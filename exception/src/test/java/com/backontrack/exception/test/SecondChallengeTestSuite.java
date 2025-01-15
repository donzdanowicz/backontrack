package com.backontrack.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SecondChallengeTestSuite {
    @Test
    void testProbablyIWillThrowException_shouldNotThrowExceptionAndReturnDone() throws Exception {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when
        double x = 1.9;
        double y = 10;
        String expected = "Done!";

        // then
        assertEquals(expected, secondChallenge.probablyIWillThrowException(x, y));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testProbablyIWillThrowException_shouldThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when
        double xEqualTo2 = 2.0;
        double yEqualTo1_5 = 1.5;

        //then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(xEqualTo2, yEqualTo1_5));
    }

    @Test
    void testProbablyIWillThrowException_testAllCases() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when
        double xEqualTo2 = 2.0;
        double xGreaterThan2 = 2.01;
        double xLesserThan2 = 1.99;
        double xEqualTo1 = 1.0;
        double xGreaterThan1 = 1.01;
        double xLesserThan1 = 0.99;
        double yEqualTo1_5 = 1.5;
        double yGreaterThan1_5 = 1.51;
        double yLesserThan1_5 = 1.49;

        //then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(xEqualTo2, yEqualTo1_5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(xEqualTo1, yEqualTo1_5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(xGreaterThan2, yEqualTo1_5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(xLesserThan1, yEqualTo1_5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(xLesserThan2, yLesserThan1_5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(xGreaterThan1, yGreaterThan1_5))
        );
    }
}
