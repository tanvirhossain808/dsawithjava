public class Btbs {
    public static void maxProfit(int prices[]) {
        int buingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buingPrice < prices[i]) {
                int profit = prices[i] - buingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buingPrice = prices[i];
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 8 };
        maxProfit(prices);

    }
}
