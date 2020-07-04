import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Change {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("change.in"));
		int val = sc.nextInt();
		sc.nextLine();
		String[] coinsstring = sc.nextLine().split(",");
		int[] coins = new int[coinsstring.length];
		for (int i = 0; i < coinsstring.length; i++) {
			coins[i] = Integer.parseInt(coinsstring[i]);
		}
		int amtcoin = coins.length;
		System.out.println(minnumcoins(val, coins, amtcoin));
		System.out.println(maxcombinations(val,coins,amtcoin));


	}

	public static int minnumcoins(int val, int[] coins, int amtcoin) {
		int[][] dp = new int[amtcoin + 1][val + 1];
		for (int j = 0; j <= val; j++) {
			dp[0][j] = Integer.MAX_VALUE; // no way to make these comb if no coins
		}
		for (int i = 0; i <= amtcoin; i++) {
			dp[i][0] = 0; //0 cost to make 0
		}
		for (int i = 1; i <= amtcoin; i++) {
			for (int j = 1; j <= val; j++) {
				if (j - coins[i - 1] >= 0 && dp[i][j - coins[i - 1]] != Integer.MAX_VALUE) {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]] + 1);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[amtcoin][val];
	}
	public static int maxcombinations (int val, int[] coins, int amtcoin){
		int[] combinations = new int[val+1];
		combinations[0] =1;
		for(int i = 0; i< amtcoin; i++){
			for(int j = 0; j<= val; j++){
				if(j-coins[i]>=0){
					combinations[j]+=combinations[j-coins[i]];
				}
			}
			System.out.println(Arrays.toString(combinations));
		}
		return combinations[val];
	}
}
