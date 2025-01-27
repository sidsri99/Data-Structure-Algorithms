/**
  P3: Floyd-Warshall algorithm
  
  Example 1:
  Input: numCourses = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
  Output: [false,true]
  Explanation: The pair [1, 0] indicates that you have to take course 1 before you can take course 0.
  Course 0 is not a prerequisite of course 1, but the opposite is true.
  
  Example 2:
  Input: numCourses = 2, prerequisites = [], queries = [[1,0],[0,1]]
  Output: [false,false]
  Explanation: There are no prerequisites, and each course is independent.
  
  Example 3:
  Input: numCourses = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
  Output: [true,true]
  
*/

class Problem3{
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> ls=new ArrayList<>();
        boolean pre[][]=new boolean[numCourses][numCourses];
        for(int[] ar: prerequisites){
            pre[ar[0]][ar[1]] = true;
        }
        //Floyd-Warshall algorithm
        for(int k = 0; k < numCourses; k++){
            for(int i = 0 ; i < numCourses; i++){
                for(int j = 0; j < numCourses; j++){
                    if((pre[i][j] == true) || 
                       ((pre[i][k] == true) && 
                        (pre[k][j] == true))){
                            pre[i][j] = true;
                        }
                }
            }
        }
        for(int[] ar: queries){
            ls.add(pre[ar[0]][ar[1]]);
        }
        
        return ls;
    }
}

/*

*/
