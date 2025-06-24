package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class WeatherReporterTest {

    @Test
    public void testGenerateReport_WithMockedService() {
        // Arrange
        WeatherService mockService = mock(WeatherService.class);
        when(mockService.getTemperature("Delhi")).thenReturn(30);

        WeatherReporter reporter = new WeatherReporter(mockService);

        // Act
        String result = reporter.generateReport("Delhi");

        // Assert
        assertEquals("The temperature in Delhi is 30°C", result);

        // Verify if method was called
        verify(mockService, times(1)).getTemperature("Delhi");
    }
}
