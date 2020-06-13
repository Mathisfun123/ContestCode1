import java.util.Arrays;

//leetcode attempts
public class Solution {
	public static void main(String[] args) {
		int cost[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(minCostClimbingStairs(cost));
	}
	public static int minCostClimbingStairs(int[] cost) {
		int[] dps = new int[cost.length+1];
		dps[0] =cost[0]; dps[1]= cost[1];
		for(int i = 2; i<=cost.length; i++){
			dps[i] = Math.min(dps[i-2], dps[i-1]) + (i==cost.length?0:cost[i]);
		}
		return dps[cost.length];


	}
}
