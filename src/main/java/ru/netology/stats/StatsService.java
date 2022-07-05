package ru.netology.stats;

public class StatsService {
    public int amountAllSales(int[] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    }

    public int averageAmountSales(int[] sales) {
        int avTotal = 0;
        for (int i = 0; i < sales.length; i++) {
            avTotal = avTotal + sales[i];
        }
        return avTotal / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int totalMonthBelowAvSales(int[] sales) {
        int avTotal = 0;
        for (int i = 0; i < sales.length; i++) {
            avTotal = avTotal + sales[i];
        }
        int value = avTotal / sales.length;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < value)
                count++;
        }
        return count;
    }

    public int totalMonthHigherAvSales(int[] sales) {
        int avTotal = 0;
        for (int i = 0; i < sales.length; i++) {
            avTotal = avTotal + sales[i];
        }
        int value = avTotal / sales.length;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > value)
                count++;
        }
        return count;
    }
}