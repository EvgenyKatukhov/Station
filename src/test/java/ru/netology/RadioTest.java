package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldCreate() {
        Radio smart = new Radio();
    }

    @Test
    public void shouldInitFieldToValues() {
        Radio smart = new Radio();
        assertEquals(0, smart.maxVolume);
        assertEquals(0, smart.minVolume);
    }

    @Test
    public void shouldInitFieldToValues1() {
        Radio smart = new Radio();
        assertEquals(0, smart.maxStation);
        assertEquals(0, smart.minStation);


    }
}
