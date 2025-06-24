package org.example;

import org.testng.annotations.Test;
import static org.mockito.Mockito.*;

public class NotificationManagerTest {

    @Test
    public void testSendNotification_WhenUserExists() {
        // Arrange
        UserService userService = mock(UserService.class);
        NotificationService notificationService = mock(NotificationService.class);

        when(userService.userExists("harsh123")).thenReturn(true);

        NotificationManager manager = new NotificationManager(userService, notificationService);

        // Act
        manager.notifyUser("harsh123", "Welcome to the platform!");

        // Assert
        verify(notificationService, times(1))
                .sendNotification("harsh123", "Welcome to the platform!");

        verify(userService, times(1)).userExists("harsh123");
    }

    @Test
    public void testSendNotification_WhenUserDoesNotExist() {
        // Arrange
        UserService userService = mock(UserService.class);
        NotificationService notificationService = mock(NotificationService.class);

        when(userService.userExists("ghost")).thenReturn(false);

        NotificationManager manager = new NotificationManager(userService, notificationService);

        // Act
        manager.notifyUser("ghost", "Hello!");

        // Assert
        // Should NOT call sendNotification if user doesn't exist
        verify(notificationService, never()).sendNotification(anyString(), anyString());

        verify(userService, times(1)).userExists("ghost");
    }
}
