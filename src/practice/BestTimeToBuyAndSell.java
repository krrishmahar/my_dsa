package practice;

public class BestTimeToBuyAndSell {

    static int maxProfit(int[] prices){
        int left = 0, right = prices.length -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        while (left != right){
            low = (prices[left] < prices[left+1]) ? left : left+1;
            high = (prices[right] < prices[right-1]) ? right -1 : right;
            ++left;
            --right;
        }

        return right+1;
    }

    static int maxProfit2(int[] prices) {
        int minPriceInd = Integer.MAX_VALUE, maxPrice = Integer.MIN_VALUE;
        int maxInd = 0;
        for (int i = 0; i < prices.length; i++) {
            minPriceInd = Math.min(prices[i], minPriceInd);
        }
        for (int i = minPriceInd; i < prices.length; i++) {
            maxPrice = Math.max(prices[i], maxPrice);
            maxInd = i;
        }
//        System.out.printf("minPrice: %d \nmaxPrice: %d",minPriceInd,maxPrice);
        return (maxInd < prices.length) ? maxInd : 0;
    }

    static void main() {
    int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit2(nums));

    }
}
