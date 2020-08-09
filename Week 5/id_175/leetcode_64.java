package week5.homwork;

/**
 * @author shizeying
 * @date 2019/11/17 15:44
 * @description
 */
public class leetcode_64 {
  public int minPathSum(int[][] grid) {
    if (grid.length == 0 || grid[0].length == 0) {
      return 0;
    }
    int[][] dp = new int[grid.length][grid[0].length];
    for (int i = grid.length - 1; i >= 0; i--) {
      for (int j = grid[i].length - 1; j >= 0; j--) {
        if (i == grid.length - 1 && j != grid[i].length - 1) {
          dp[i][j] = grid[i][j] + dp[i][j + 1];
        } else if (j == grid[i].length - 1 && i != grid.length - 1) {
          dp[i][j] = grid[i][j] + dp[i + 1][j];
        } else if (j != grid[i].length - 1 && i != grid.length - 1) {
          dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
        } else {
          dp[i][j] = grid[i][j];
        }
      }
    }
    return dp[0][0];
  }
}
