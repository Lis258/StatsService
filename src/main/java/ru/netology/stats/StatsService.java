package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] purchases){
        int sum = 0;
        for (int purchase : purchases){
            sum += purchase;
        }
        return sum;
    }

    public int averageSum(int[] purchases){
        int sum = calculateSum(purchases);
        int averageSum = sum / purchases.length;
        return averageSum;
    }

    public int maxSales(int[] purchases){
        int month = 0;
        int monthMax = 0;
        int currentMax = purchases[0];
        for (int purchase : purchases){
            month++;
            if (currentMax <= purchase) {
                currentMax = purchase;
                monthMax = month;
            }
        }
        return monthMax;
    }

    public int minSales(int[] purchases){
        int month = 0;
        int monthMin = 0;
        int currentMin = purchases[0];
        for (int purchase : purchases){
            month ++;
            if (currentMin >= purchase) {
                currentMin = purchase;
                monthMin = month;
            }
        }
        return monthMin;
    }

    public int salesBelowAverage(int[] purchases){
        int months = 0;
        int averageSum = averageSum(purchases);
        for (int purchase : purchases){
            if (averageSum > purchase){
                months++;
            }
        }
        return months;
    }

    public int salesAboveAverage(int[] purchases){
        int months = 0;
        int averageSum = averageSum(purchases);
        for (int purchase : purchases){
            if (averageSum < purchase){
                months++;
            }
        }
        return months;
    }

}
