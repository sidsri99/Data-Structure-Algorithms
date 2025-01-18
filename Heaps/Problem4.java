/**

  P4: Minimum Cost to Make at Least One Valid Path in a Grid
  
  Example 1:
  Input: grid = [[1,1,1,1],[2,2,2,2],[1,1,1,1],[2,2,2,2]]
  Output: 3
  Explanation: You will start at point (0, 0).
  The path to (3, 3) is as follows. (0, 0) --> (0, 1) --> (0, 2) --> (0, 3) change the arrow to down with cost = 1 --> (1, 3) --> (1, 2) --> (1, 1) --> (1, 0) change the arrow to down with cost = 1 --> (2, 0) --> (2, 1) --> (2, 2) --> (2, 3) change the arrow to down with cost = 1 --> (3, 3)
  The total cost = 3.
  
  Example 2:
  Input: grid = [[1,1,3],[3,2,2],[1,1,4]]
  Output: 0
  Explanation: You can follow the path from (0, 0) to (2, 2).

  Example 3:
  Input: grid = [[1,2],[4,3]]
  Output: 1
  
*/

class Problem4 {
    public int minCost(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;

        int cost[][]=new int[row][col];
        for(int arr[]:cost){
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
        cost[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.offer(new int[]{0,0,0});

        while(!pq.isEmpty()){
            int arr[] = pq.poll();
            if(arr[0] == row-1 && arr[1] == col-1)
                return arr[2];

            if(arr[1]+1 < col){
                int tmp = 0;
                if(grid[arr[0]][arr[1]] == 1){
                    tmp = arr[2];
                }else{
                    tmp = arr[2] + 1;
                }
                if(tmp < cost[arr[0]][arr[1]+1]){
                    cost[arr[0]][arr[1]+1] = tmp;
                    pq.offer(new int[]{arr[0], arr[1]+1, tmp});
                }
            }
            if(arr[1]-1 > -1){
                int tmp = 0;
                if(grid[arr[0]][arr[1]] == 2){
                    tmp = arr[2];
                }else{
                    tmp = arr[2] + 1;
                }
                if(tmp < cost[arr[0]][arr[1]-1]){
                    cost[arr[0]][arr[1]-1] = tmp;
                    pq.offer(new int[]{arr[0], arr[1]-1, tmp});
                }
            }
            if(arr[0]+1 < row){
                int tmp = 0;
                if(grid[arr[0]][arr[1]] == 3){
                    tmp = arr[2];
                }else{
                    tmp = arr[2] + 1;
                }
                if(tmp < cost[arr[0]+1][arr[1]]){
                    cost[arr[0]+1][arr[1]] = tmp;
                    pq.offer(new int[]{arr[0]+1, arr[1], tmp});
                }
            }
            if(arr[0]-1 >-1){
                int tmp = 0;
                if(grid[arr[0]][arr[1]] == 4){
                    tmp = arr[2];
                }else{
                    tmp = arr[2] + 1;
                }
                if(tmp < cost[arr[0]-1][arr[1]]){
                    cost[arr[0]-1][arr[1]] = tmp;
                    pq.offer(new int[]{arr[0]-1, arr[1], tmp});
                }
            }
        }
    return -1;
    }
}

/*

>[[3,4,3],[2,2,2],[2,1,1],[4,3,2],[2,1,4],[2,4,1],[3,3,3],[1,4,2],[2,2,1],[2,1,1],[3,3,1],[4,1,4],[2,1,4],[3,2,2],[3,3,1],[4,4,1],[1,2,2],[1,1,1],[1,3,4],[1,2,1],[2,2,4],[2,1,3],[1,2,1],[4,3,2],[3,3,4],[2,2,1],[3,4,3],[4,2,3],[4,4,4]]
18

*/
