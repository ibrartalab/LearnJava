package DSAJava.leetcode;

public class BuyAndSell {
    static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int profit = bestTimeBuyAndSellStocks(prices2);
        System.out.println("Maximum profits you can make: " + profit);
    }
    // The Optimal Approach using sliding window
    public static int bestTimeBuyAndSellStocks(int[] prices){
        if(prices == null || prices.length == 0) return 0;
        int left = 0;
        int bestDayBuyingStocks = 0;
        int bestDaySellingStocks = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[left] > prices[i]){
                left = i;
                bestDayBuyingStocks = i+1;
            }
            maxProfit = Math.max(maxProfit,prices[i] - prices[left]);
            bestDaySellingStocks = i + 1;
        }
        if(maxProfit > 0){
            System.out.printf("Best day to buy is %d,\nbest day to sold for max profit is %d",bestDayBuyingStocks,bestDaySellingStocks);
            System.out.println();
        }
        return maxProfit;
    }
}
/*
Problem Statement
You are given an array prices where prices[i] is the price of a given stock
on the i-th day.
You want to maximize your profit by choosing a single day to buy one stock
and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
Example 1:
 Input: prices = [7, 1, 5, 3, 6, 4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6).
 Profit = 6 - 1 = 5.
 (Note that buying on day 2 and selling on day 1 is not allowed because
 you must buy before you sell [1])
Example 2:
 Input: prices = [7, 6, 4, 3, 1]
 Output: 0
 Explanation: In this case, no transactions are done and the max profit = 0.
*/

