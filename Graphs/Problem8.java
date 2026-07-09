/**

  P8: Minimum Score of a Path Between Two Cities
  
  Example 1:
  Input: n = 4, roads = [[1,2,9],[2,3,6],[2,4,5],[1,4,7]]
  Output: 5
  Explanation: The path from city 1 to 4 with the minimum score is: 1 -> 2 -> 4. The score of this path is min(9,5) = 5.
  It can be shown that no other path has less score.
  
  Example 2:
  Input: n = 4, roads = [[1,2,2],[1,3,4],[3,4,7]]
  Output: 2
  Explanation: The path from city 1 to 4 with the minimum score is: 1 -> 2 -> 1 -> 3 -> 4. The score of this path is min(2,2,4,7) = 2.

*/

class Problem8 {
    public int dfs(int node, List<int[]>[] graph, boolean[] visited){
        visited[node] = true;
        int ans = Integer.MAX_VALUE;
        for(int[] one: graph[node]){
            ans = Math.min(ans, one[1]);
            if(!visited[one[0]]){
                ans = Math.min(ans, dfs(one[0],graph,visited));
            } 
        }
        return ans;
    }
    public int minScore(int n, int[][] roads) {
        List<int[]> graph[] = new ArrayList[n+1];
        for(int i = 0; i<=n; i++){
            graph[i] = new ArrayList<int[]>();
        }
        for(int[] one : roads){
            graph[one[0]].add(new int[]{one[1],one[2]});
            graph[one[1]].add(new int[]{one[0],one[2]});
        }
        boolean visited[]=new boolean[n+1];
        int ans = dfs(1,graph,visited);
        return ans;
    }
}
