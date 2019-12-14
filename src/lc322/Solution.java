package lc322;

public class Solution {
    public static int coinChange(int[] coins,int amount){
        int n = amount;
        int m = coins.length;
        int T[] = new int[n+1];
        for(int j=0;j<=n;j++){
            T[j] = Integer.MAX_VALUE;
        }
        T[0] = 0;
        for(int i=0;i<m;i++){
            for(int j=coins[i];j<=n;j++){
                T[j] = Math.min(T[j],T[j-coins[i]]+1);
            }
        }
        if(T[n]<0||T[n]==Integer.MAX_VALUE){
            return -1;
        }
        return T[n];
    }
    public static void main(String[] args){
        int coins[] = {2};
        int amount = 1;
        int res = coinChange(coins,amount);
        System.out.println(res);
    }
}
