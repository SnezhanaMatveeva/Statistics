import ru.netology.statistics.statistic.Statistic;

public class Main {
    public static void main(String[] args) {
        Statistic statistic = new Statistic();
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        statistic.amountOfAllSales(sales);
        statistic.averageSalesPermonths(sales);
        statistic.maximumSales(sales);
        statistic.minimumSales(sales);
        statistic.belowAverageSales(sales);
        statistic.aboveAverageSales(sales);
    }

}
