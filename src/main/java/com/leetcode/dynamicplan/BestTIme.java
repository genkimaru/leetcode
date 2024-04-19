package com.leetcode.dynamicplan;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

/**
 *
 * Best Time to Buy and Sell Stock
 */

public class BestTIme {

    private int minPrice = Integer.MAX_VALUE;
    private int maxprofit = Integer.MIN_VALUE;

    public int maxProfit(int[] prices) {
        for(int price : prices){
            minPrice = Math.min(minPrice , price);
            maxprofit = Math.max(maxprofit , price - minPrice);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        BestTIme bestTIme = new BestTIme();
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = bestTIme.maxProfit(prices);
        System.out.println(maxProfit);
    }
}
