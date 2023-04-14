package ru.netology.statistics.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticTest {
    @Test

    public void testAmountOfAllSales() {
        Statistic statistic = new Statistic();
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int expected = 78;
        int actual = statistic.amountOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSalesPermonths() {
        Statistic statistic = new Statistic();
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int expected = 6;
        int actual = statistic.averageSalesPermonths(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaximumSales() {
        Statistic statistic = new Statistic();
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int expected = 12;
        int actual = statistic.maximumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinimumSales() {
        Statistic statistic = new Statistic();
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int expected = 1;
        int actual = statistic.minimumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowAverageSales() {
        Statistic statistic = new Statistic();
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int expected = 5;
        int actual = statistic.belowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveAverageSales() {
        Statistic statistic = new Statistic();
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int expected = 6;
        int actual = statistic.aboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }


}

