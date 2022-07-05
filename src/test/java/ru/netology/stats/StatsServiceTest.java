package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test // проверяем сумму всех продаж
    public void amAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAllSales = 180;
        int actualAllSales = service.amountAllSales(sales);

        Assertions.assertEquals(expectedAllSales, actualAllSales);

    }

    @Test // проверяем среднюю сумму продаж
    public void avAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvAllSales = 15;
        int actualAvAllSales = service.averageAmountSales(sales);

        Assertions.assertEquals(expectedAvAllSales, actualAvAllSales);
    }

    @Test // проверяем последний месяц с пиком продаж
    public void mxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMxSales = 8;
        int actualMxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMxSales, actualMxSales);

    }

    @Test // проверяем последний месяц с минимальными продажами
    public void mnSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMnSales = 9;
        int actualMnSales = service.minSales(sales);

        Assertions.assertEquals(expectedMnSales, actualMnSales);

    }

    @Test // проверяем количество месяцев с продажами меньше среднего числа продаж за год
    public void monthBelowAvSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAv = 5;
        int actualBelowAv = service.totalMonthBelowAvSales(sales);

        Assertions.assertEquals(expectedBelowAv, actualBelowAv);

    }

    @Test // проверяем количество месяцев с продажами выше среднего числа продаж за год
    public void monthHigherAvSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedHigherAv = 5;
        int actualHigherAv = service.totalMonthHigherAvSales(sales);

        Assertions.assertEquals(expectedHigherAv, actualHigherAv);

    }

}
