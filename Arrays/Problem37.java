/*
  
  P37 Count Servers that Communicate
  
  Example 1:
  Input: grid = [[1,0],[0,1]]
  Output: 0
  Explanation: No servers can communicate with others.
  
  Example 2:
  Input: grid = [[1,0],[1,1]]
  Output: 3
  Explanation: All three servers can communicate with at least one other server.
  
  Example 3:
  Input: grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
  Output: 4
  Explanation: The two servers in the first row can communicate with each other. The two servers in the third column can communicate with each other. The server at right bottom corner can't communicate with any other server.

*/

class Problem37 {
    public int countServers(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        int r[]=new int[row];
        int c[]=new int[col];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    r[i]++;
                    c[j]++;
                }
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1 && (r[i]>1 || c[j]>1)){
                    count++;
                }
            }
        }
        
        return count;
        
    }
}

/*

*/
