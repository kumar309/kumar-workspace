package com.kumar.algorithms;

/**
 * Created by keswani on 5/12/18.
 */
public class Stock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Stock stock = new Stock();
        System.out.println(stock.maxProfit(prices));

        int[] prices1 = {};
    }

    public int maxProfit(int[] prices){
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
            System.out.println("maxprofit:"+maxProfit + " minPrice:"+minPrice);
        }
        return maxProfit;
    }



}

