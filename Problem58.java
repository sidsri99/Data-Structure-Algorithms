/**

  P58: Maximum Sum of an Hourglass

  Example 1:
  Input: grid = [[6,2,1,3],[4,2,1,5],[9,2,8,7],[4,1,2,9]]
  Output: 30
  Explanation: The cells shown above represent the hourglass with the maximum sum: 6 + 2 + 1 + 2 + 9 + 2 + 8 = 30.
  
  Example 2:
  Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
  Output: 35
  Explanation: There is only one hourglass in the matrix, with the sum: 1 + 2 + 3 + 5 + 7 + 8 + 9 = 35.

*/

class Problem58 {
    public int maxSum(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int row = grid.length, col = grid[0].length;
        int sum[] = new int[row];
        for(int i = 0; i< row; i++){
            for(int j = 0 ; j < 3; j++){
                sum[i] += grid[i][j];
            }
        }
        for(int i = 0; i< row-2; i++){
            max = Math.max(max, sum[i]+sum[i+2]+grid[i+1][1]);
        }
        for(int i = 1; i<col-2;i++){
            for(int j = 0;j<row; j++){
                sum[j] = sum[j] - grid[j][i-1] + grid[j][i+2];
            }
            for(int j = 0; j< row-2; j++){
                max = Math.max(max, sum[j]+sum[j+2]+grid[j+1][i+1]);
            }
        }
        return max;
    }
}

/*

Input
grid =
[[1,2,3,4,5,6],[1,2,3,4,5,6],[1,2,3,4,5,6]]
Output
35
Expected
35

Input
grid =
[[1,2,3,4],[1,2,3,4],[1,2,3,4],[1,2,3,4]]
Output
21
Expected
21

Input
grid =
[[520626,685427,788912,800638,717251,683428],[23602,608915,697585,957500,154778,209236],[287585,588801,818234,73530,939116,252369]]
Output
5095181
Expected
5095181

*/
