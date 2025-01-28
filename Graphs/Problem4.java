/**

  P4: Maximum Number of Fish in a Grid

  Example 1:
  Input: grid = [[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]]
  Output: 7
  Explanation: The fisher can start at cell (1,3) and collect 3 fish, then move to cell (2,3) and collect 4 fish.
  
  Example 2:
  Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,1]]
  Output: 1
  Explanation: The fisher can start at cells (0,0) or (3,3) and collect a single fish. 

*/

class Problem4 {
    public int DFS(int[][] grid, boolean[][] visited, int row, int col){
        if( (row < 0) || 
            (col < 0) || 
            (row > grid.length) || 
            (col > grid[0].length) || 
            (grid[row][col] == 0)){
                return 0;
        }
        int fish = grid[row][col];
        visited[row][col] = true;
        if(((col+1) < grid[0].length) && (visited[row][col+1] == false)){
            fish += DFS(grid,visited,row,col+1);
        }
        if(((col-1) >= 0) && (visited[row][col-1] == false)){
            fish += DFS(grid,visited,row,col-1);
        }
        if(((row+1) < grid.length) && (visited[row+1][col] == false)){
            fish += DFS(grid,visited,row+1,col);
        }
        if(((row-1) >= 0) && (visited[row-1][col] == false)){
            fish += DFS(grid,visited,row-1,col);
        }
        return fish;
    }
    public int findMaxFish(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean visited[][] = new boolean[r][c];
        int fish = 0;
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[0].length; j++){
                if(visited[i][j] == false){
                    int tmp = DFS(grid,visited,i,j);
                    fish = Math.max(tmp,fish);
                }
            }
        }
        return fish;
    }
}

/*

*/
