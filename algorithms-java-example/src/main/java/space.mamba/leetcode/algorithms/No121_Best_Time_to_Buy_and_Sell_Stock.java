package space.mamba.leetcode.algorithms;

/**
 * @author mamba
 * @date 2021/1/1 18:39
 * <p>
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * <p>
 * 滑动窗口
 */
public class No121_Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
        No121_Best_Time_to_Buy_and_Sell_Stock obj = new No121_Best_Time_to_Buy_and_Sell_Stock();
        int[] arr = {7,1,5,3,6,4};
        int value = obj.maxProfit(arr);
        System.out.println(value);

        int[] arr2 = {7,6,4,3,1};
        int value2 = obj.maxProfit(arr2);
        System.out.println(value2);
    }


    public int maxProfit(int[] prices) {
        //不进行任何交易，即最大利益为0
        int bestTimeSellStock = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                //下一次开盘价格小于购买的价格
                if (prices[i] > prices[j]) {
                    continue;
                } else {
                    //
                    int temp = prices[j] - prices[i];
                    if (temp > bestTimeSellStock) {
                        bestTimeSellStock = temp;
                    }
                }
            }
        }
        return bestTimeSellStock;
    }
}
