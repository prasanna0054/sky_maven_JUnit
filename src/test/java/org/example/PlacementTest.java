package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlacementTest {

    @Test
    void firstTest() {
        assertEquals("1st", DogCompetition.getPlacementString(1));

    }

    @Test
    void secondTest() {
        assertEquals("33rd", DogCompetition.getPlacementString(33));

    }

    @Test
    void thirdTest() {
        assertEquals("12th", DogCompetition.getPlacementString(12));

    }

    @Test
    void fourthTest() {
        assertEquals("22nd", DogCompetition.getPlacementString(22));

    }

    @Test
    void fifthTest() {
        assertEquals("40th", DogCompetition.getPlacementString(40));

    }

    @Test
    void sixthTest() {
        assertEquals("93rd", DogCompetition.getPlacementString(93));

    }

    @Test
    void seventhTest() {
        assertEquals("Enter 1-100 Only", DogCompetition.getPlacementString(0));

    }

    @Test
    void eigthTest() {
        assertEquals("Enter 1-100 Only", DogCompetition.getPlacementString(102));

    }
}
