/**

  P9: Count the Number of Complete Components
  
  Example 1:
  Input: n = 6, edges = [[0,1],[0,2],[1,2],[3,4]]
  Output: 3
  Explanation: From the picture above, one can see that all of the components of this graph are complete.
  
  Example 2:
  Input: n = 6, edges = [[0,1],[0,2],[1,2],[3,4],[3,5]]
  Output: 1
  Explanation: The component containing vertices 0, 1, and 2 is complete since there is an edge between every pair of two vertices. 
  On the other hand, the component containing vertices 3, 4, and 5 is not complete since there is no edge between vertices 4 and 5. 
  Thus, the number of complete components in this graph is 1.

*/

class Problem9 {
    public void dfs(int node, List<Integer>[] graph, boolean[] visited, List<Integer> component){
        component.add(node);
        visited[node] = true;
        for(int vertices: graph[node]){
            if(!visited[vertices]){
                dfs(vertices,graph,visited,component);
            }
        }
    } 
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge: edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        boolean visited[] = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            if(!visited[i]){
                List<Integer> component = new ArrayList<Integer>();
                dfs(i,graph,visited,component);
                int size = component.size();
                boolean flag = true;
                for(int vertices: component){
                    if(graph[vertices].size() != size - 1){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    count++;
                }
            }
        }
        return count;
    }
}
