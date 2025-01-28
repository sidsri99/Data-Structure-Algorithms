/**

  P5: Number of Provinces

  Example 1:
  Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
  Output: 2
  
  Example 2:
  Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
  Output: 3

*/

class Problem5{
    public void DFS(int[][] isConnected, int node, boolean[] visited){
        if(visited[node])return;
        visited[node] = true;
        for(int i=0 ; i<isConnected.length;i++){
            if(isConnected[node][i] == 1){ //&& (!visited[i])){
                DFS(isConnected, i, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean visited[]=new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                count++;
                DFS(isConnected, i, visited);
            }
        }
        return count;
    }
}

/*



*/
