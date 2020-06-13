import java.util.Arrays;

//leetcode attempts
public class Solution {
	public static void main(String[] args) {
		int[] coins = {1, 2, 5}; int amount= 11;
		System.out.println(coinChange(coins, amount));
	}
	public static int coinChange(int[] coins, int amount) {
		int[] dpcoins = new int[amount+1];
		for(int i = 0; i< amount+1; i++){
			dpcoins[i] = Integer.MAX_VALUE;
		}
		dpcoins[0] = 0;
		for(int i = 1; i<= amount; i++){
			for (int coin : coins) {
				if (i - coin >= 0) {
					dpcoins[i] = Math.min(dpcoins[i], 1 + dpcoins[i - coin]);
				}
			}
		}
		return (dpcoins[amount]);

	}
}