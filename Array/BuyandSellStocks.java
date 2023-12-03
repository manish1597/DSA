package Array;



public class BuyandSellStocks {
    public static int BuyandSell(int[] prices){
        int n=prices.length;
        int buyprice=Integer.MAX_VALUE;//we have to find minimum buy price that's why we take maximum integer value
        int maxprofit=0;
        for(int i=0;i<n;i++)
            if (buyprice < prices[i]) {//selling price =prices[i]
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(profit, maxprofit);
            } else {//if buy price greater than selling then we have to update buy price
                buyprice = prices[i];
            }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(BuyandSell(prices));

    }
}
