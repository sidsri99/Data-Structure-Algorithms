/**

  P7: Find if Path Exists in Graph
  Example 1:
  Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
  Output: true
  Explanation: There are two paths from vertex 0 to vertex 2:
  - 0 → 1 → 2
  - 0 → 2
  
  Example 2:
  Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
  Output: false
  Explanation: There is no path from vertex 0 to vertex 5.

*/


class Problem7 {
    public boolean dfs(ArrayList<Integer>[] graph, int source, int destination, boolean[] visited){
        if(source == destination)
            return true;
        if(visited[source] == true){
            return false;
        }
        visited[source] = true;
        for(int no: graph[source]){
            if(visited[no] == false){
                if(dfs(graph, no,destination,visited))
                    return true;
            }
        }
        return false; 
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0 ; i < n ; i++){
            graph[i] = new ArrayList<Integer>();
        }
        boolean visited[]=new boolean[n];
        for(int ar[]: edges){
            graph[ar[1]].add(ar[0]);
            graph[ar[0]].add(ar[1]);
        }
        return dfs(graph,source,destination,visited);
    }
}

/*



*/
