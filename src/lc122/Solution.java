package lc122;

public class Solution {
    public static int maxProfit(int[] prices){
        int l = prices.length;
        int res = 0;
        for(int i=0;i<l-1;i++){
            if(prices[i+1]>prices[i]){
                res = res+prices[i+1]-prices[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println(res);
    }
}
