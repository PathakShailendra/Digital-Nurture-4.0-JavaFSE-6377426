package org.example;

public class NotificationManager {

    private final UserService userService;
    private final NotificationService notificationService;

    public NotificationManager(UserService userService, NotificationService notificationService) {
        this.userService = userService;
        this.notificationService = notificationService;
    }

    public void notifyUser(String userId, String message) {
        if (userService.userExists(userId)) {
            notificationService.sendNotification(userId, message);
        }
    }
}
