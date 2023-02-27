package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSumSales(int[] sales) {
        int aveSum = sales[0];
        for (int i = 1; i < sales.length; i++) {
            aveSum = aveSum + sales[i];
        }
        return aveSum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lowerAveSales(int[] sales) {
        int lowerAveMomth = 0;
        for (int sale : sales) {
            if (sale < averageSumSales(sales)) {
                lowerAveMomth = lowerAveMomth + 1;
            }
        }
        return lowerAveMomth;
    }

    public int aboveAveSales(int[] sales) {
        int aboveAveMomth = 0;
        for (int sale : sales) {
            if (sale > averageSumSales(sales)) {
                aboveAveMomth = aboveAveMomth + 1;
            }
        }
        return aboveAveMomth;
    }
}
