package ru.netology.statistics.statistic;

public class Statistic {

    public int amountOfAllSales(int[] sales) {
        int sum = 0;
        for (int num : sales) {
            sum = sum + num;
        }
        System.out.println("Сумма всех продаж равна: " + sum);
        return sum;
    }

    public int averageSalesPermonths(int[] sales) {
        int sum = 0;
        int average = 0;
        for (int num : sales) {
            sum = sum + num;
            average = sum / 12;
        }
        System.out.println("Средняя сумма продаж в месяц равна: " + average);
        return average;
    }

    public int maximumSales(int[] sales) {
        int monthNumber = sales[0];
        for (int sale : sales) {
            if (sale > monthNumber) {
                monthNumber = monthNumber + 1;
            }
        }
        System.out.println("Номер месяца, в котором был пик продаж " + monthNumber);
        return monthNumber;
    }

    public int minimumSales(int[] sales) {
        int monthNumber = sales[0];
        for (int sale : sales) {
            if (sale < monthNumber) {
                monthNumber = monthNumber + 1;
            }
        }
        System.out.println("Номер месяца, в котором был минимум продаж " + monthNumber);
        return monthNumber;
    }

    public int belowAverageSales(int[] sales) {
        int belowAverageSales = 0;
        int a = averageSalesPermonths(sales);
        for (int sale : sales) {
            if (sale < a) {
                belowAverageSales = belowAverageSales + 1;
            }
        }
        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + belowAverageSales);
        return belowAverageSales;
    }

    public int aboveAverageSales(int[] sales) {
        int aboveAverageSales = 0;
        int a = averageSalesPermonths(sales);
        for (int sale : sales) {
            if (sale > a) {
                aboveAverageSales = aboveAverageSales + 1;
            }
        }
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + aboveAverageSales);
        return aboveAverageSales;
    }
}















