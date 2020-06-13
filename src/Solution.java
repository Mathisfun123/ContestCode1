import java.util.Arrays;

//leetcode attempts
public class Solution {
	public static void main(String[] args) {
		int[][] grid = {{1,2,5},{3,2,1}};
		System.out.println(minPathSum(grid));
	}
	public static int minPathSum(int[][] grid) {
		int dps[][] = new int[grid.length][grid.length];
		for(int i = 0; i< grid.length; i++){
			for(int j =0; j< grid.length; j++){
				dps[i][j] = (i==0&&j==0)?grid[0][0]: (i==0)? dps[i][j-1] + grid[i][j]: (j==0)? dps[i-1][j]+ grid[i][j] :Math.min(dps[i-1][j], dps[i][j-1]) + grid[i][j];
			}
		}
		return dps[grid.length-1][grid.length-1];
	}
}
