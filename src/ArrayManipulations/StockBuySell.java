package ArrayManipulations;

/**
 * Best Time to Buy and Sell Stock (Single Transaction)
 * Problem: දින කිහිපයක Stock Price තියෙන Array එකකින් ගන්න පුළුවන් උපරිම ලාභය හොයන්න.

 * Input: [7, 1, 5, 3, 6, 4] | Output: 5 (Buy at 1, Sell at 6)

 * Logic: දැනට හම්බුණු අවම මිල (minPrice) තියාගෙන, එක පාරක් Loop එකේ යමින් ලාභය (price - minPrice) Max කරගනී.
 */


public class StockBuySell {
    public static void main(String[] args) {
        int [] prices = {7, 1, 5, 3, 6, 4};

        int minPrice= prices[0];
        int maxProfit = 0;

    for(int i =0;i<prices.length;i++){
        if(prices[i]<minPrice){
            minPrice = prices[i];
        } else if (prices[i]-minPrice>maxProfit) {
            maxProfit = prices[i]-minPrice;
            
        }
    }
        System.out.println("Maximum profit is :"+maxProfit);


    }
}
