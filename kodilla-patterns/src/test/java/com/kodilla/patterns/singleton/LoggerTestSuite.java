package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openSettingsFile() {
        logger = Logger.INSTANCE;
        logger.log("Test log");
    }

    @Test
    void getLastLogTest() {
        // GIVEN
        // WHEN
        System.out.println(logger.getLastLog());
    }



}
