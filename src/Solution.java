import java.util.Arrays;

//leetcode attempts
public class Solution {
	public static void main(String[] args) {
		int cost[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(minCostClimbingStairs(cost));
	}
	public static int minCostClimbingStairs(int[] cost) {
		int[] dps = new int[cost.length];
		Arrays.fill(dps, Integer.MAX_VALUE);
		dps[0] = 0; dps[1] = 0;
		int ans = -1;
		for(int i = 2; i< dps.length+1; i++){
			for(int j = Math.max(0,i-2); j< i; j++){
				if(i!=dps.length){
					dps[i]= Math.min(dps[i], dps[j]+ cost[j]);
				}else{
					ans = Math.min(dps[dps.length-1] +cost[dps.length-1], dps[dps.length-2]+cost[dps.length-2]);
				}
			}
		}
		return ans;
	}
}
