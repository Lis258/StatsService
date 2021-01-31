package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = service.calculateSum(purchases);
        assertEquals(180, actual);
    }

    @Test
    void averageSum() {
        StatsService service = new StatsService();
        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = service.averageSum(purchases);
        assertEquals(15, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = service.maxSales(purchases);
        assertEquals(8, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = service.minSales(purchases);
        assertEquals(9, actual);
    }

    @Test
    void salesBelowAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = service.salesBelowAverage(purchases);
        assertEquals(5, actual);
    }

    @Test
    void salesAboveAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = service.salesAboveAverage(purchases);
        assertEquals(5, actual);
    }
}