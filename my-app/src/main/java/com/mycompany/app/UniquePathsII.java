package com.mycompany.app;

/**
 * https://leetcode.com/problems/unique-paths-ii/
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and space is marked as 1 and 0 respectively in the grid.
 * Example 1:
 * Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * Output: 2
 * Explanation: There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 * Example 2:
 * Input: obstacleGrid = [[0,1],[0,0]]
 * Output: 1
 * Constraints:
 * m == obstacleGrid.length
 * n == obstacleGrid[i].length
 * 1 <= m, n <= 100
 * obstacleGrid[i][j] is 0 or 1.
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][]dp = new int[m][n];
        //set initial values
        //初始值容易set错，不能简单的把第一行和第一列设成默认是1，之前可以默认是1是因为没有挡住的情况。
        dp[m-1][n-1] = obstacleGrid[m-1][n-1]==1 ? 0 : 1;
        for(int i=m-2; i>=0; i--){
            dp[i][n-1] = obstacleGrid[i][n-1]==1 ? 0 : dp[i+1][n-1];
        }
        for(int j=n-2; j>=0; j--){
            dp[m-1][j] = obstacleGrid[m-1][j]==1 ? 0 : dp[m-1][j+1];
        }

        //recursion
        for(int i=m-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                dp[i][j] = obstacleGrid[i][j]==1 ? 0 : dp[i+1][j] + dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}
