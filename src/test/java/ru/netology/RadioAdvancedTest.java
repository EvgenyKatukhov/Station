package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test
    void setCurrentVolume() {
        Radio smart = new Radio();
        smart.setCurrentVolume(8);
        int expected = 8;
        int actual = smart.CurrentVolume;
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStation() {
        Radio smart = new Radio();
        smart.setCurrentStation(5);
        int expected = 5;
        int actual = smart.CurrentStaion;
        assertEquals(expected, actual);
    }

    @Test
    void increaseStation1() {
        Radio smart = new Radio();
        smart.setCurrentStation(5);
        int expected = 6;
        int actual = smart.CurrentStaion;
        assertEquals(expected, actual);

    }
}
