package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }


        return sum;
    }

    public long avgSales(long[] sales) {
        long sum = sumSales(sales);
        long avg = sum / sales.length;

        return avg;
    }

    public int monthMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberLowMonth(long[] sales) {
        int numberLow = 0;
        long avg = avgSales(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < avg) {
                numberLow++;
            }
        }
        return numberLow;
    }

    public int numberHighMonth(long[] sales) {
        int numberHigh = 0;
        long avg = avgSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                numberHigh++;
            }
        }
        return numberHigh;
    }

}

