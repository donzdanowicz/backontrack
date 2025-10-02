package com.backontrack.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openSettingsFile() {
        logger = Logger.INSTANCE;
    }

    @Test
    void testLog() {
        //Given
        LocalDateTime now = LocalDateTime.now();
        String logMessage = now.toString().substring(0,19) + ": First Log.";

        //When
        logger.log(logMessage);

        //Then
        assertEquals(logMessage, logger.getLastLog());
    }
}
