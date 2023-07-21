package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
     public void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findNewMax() {
        StatisticsService service = new StatisticsService();

        long [] incomesMaxEqually = {12, 5, 8, 4, 5, 13, 8, 6, 11, 11, 12};
        long expectedEqually = 13 ;
        long actualEqually = service.findMax(incomesMaxEqually);

        Assertions.assertEquals(expectedEqually,actualEqually);

    }
}