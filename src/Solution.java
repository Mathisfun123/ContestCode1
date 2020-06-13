//leetcode attempts
public class Solution {
	public static void main(String[] args) {
		int[][] grid = {{1,2,5},{3,2,1}};
		System.out.println(minPathSum(grid));
	}
	public static int minPathSum(int[][] grid) {
		int[][] dps = new int[grid.length][grid[0].length];
		for(int i = 0; i< grid.length; i++){
			for(int j =0; j< grid[i].length; j++){
				int left = Integer.MAX_VALUE;
				try{
					left = dps[i-1][j];
				}catch (Exception ignored){
				}
				try{
					left = Math.min(left, dps[i][j-1]);
				}catch (Exception ignored){

				}
				left = left!=Integer.MAX_VALUE? left: 0;
				dps[i][j] = left + grid[i][j];
			}
		}
		return dps[grid.length-1][grid[0].length-1];
	}
}
