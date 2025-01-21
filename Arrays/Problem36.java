/**

  P36: Grid Game

  Example 1:
  Input: grid = [[2,5,4],[1,5,1]]
  Output: 4
  Explanation: The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.
  The cells visited by the first robot are set to 0.
  The second robot will collect 0 + 0 + 4 + 0 = 4 points.
  
  Example 2:
  Input: grid = [[3,3,1],[8,5,2]]
  Output: 4
  Explanation: The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.
  The cells visited by the first robot are set to 0.
  The second robot will collect 0 + 3 + 1 + 0 = 4 points.
  
  Example 3:
  Input: grid = [[1,3,1,15],[1,3,3,1]]
  Output: 7
  Explanation: The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.
  The cells visited by the first robot are set to 0.
  The second robot will collect 0 + 1 + 3 + 3 + 0 = 7 points.
  
*/

class Problem36 {
    public long gridGame(int[][] grid) {
        int size = grid[0].length;
        long prefix = 0, second = Long.MAX_VALUE; //Maximum long value
        
        long suma = 0;
        for(int num: grid[0]){
            suma += num;
        }

        for(int i = 0 ; i<size; i++){
            suma -= grid[0][i];
            long tmp = Math.max(suma,prefix);
            second = Math.min(tmp,second);
            prefix += grid[1][i];
        }
        return second;
    }
}

/*
>grid = [[20,3,20,17,2,12,15,17,4,15],[20,10,13,14,15,5,2,3,14,3]]
63


*/
