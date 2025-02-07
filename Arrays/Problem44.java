/**

  P44: Find the Number of Distinct Colors Among the Balls

  Example 1:
  Input: limit = 4, queries = [[1,4],[2,5],[1,3],[3,4]]
  Output: [1,2,2,3]
  Explanation:
  After query 0, ball 1 has color 4.
  After query 1, ball 1 has color 4, and ball 2 has color 5.
  After query 2, ball 1 has color 3, and ball 2 has color 5.
  After query 3, ball 1 has color 3, ball 2 has color 5, and ball 3 has color 4.
  
  Example 2:
  Input: limit = 4, queries = [[0,1],[1,2],[2,2],[3,4],[4,5]]
  Output: [1,2,2,3,4]
  Explanation:
  After query 0, ball 0 has color 1.
  After query 1, ball 0 has color 1, and ball 1 has color 2.
  After query 2, ball 0 has color 1, and balls 1 and 2 have color 2.
  After query 3, ball 0 has color 1, balls 1 and 2 have color 2, and ball 3 has color 4.
  After query 4, ball 0 has color 1, balls 1 and 2 have color 2, ball 3 has color 4, and ball 4 has color 5.

*/

class Problem44 {
    public int[] queryResults(int limit, int[][] queries) {
        //int balls[]=new int[limit+1];
        int ans[]=new int[queries.length];
        int count = 0;
        Map<Integer,Integer> col = new HashMap<Integer,Integer>();
        Map<Integer,Integer> balls = new HashMap<Integer,Integer>();
        for(int[] ar: queries){
            //if(balls[ar[0]] != 0){
            /*if(balls.containsKey(ar[0])){
                //if(col.get(balls[ar[0]]) == 1){
                if(col.get(balls.get(ar[0]))==1){
                    //col.remove(balls[ar[0]]);
                    col.remove(balls.get(ar[0]));
                }else{
                    //col.put(balls[ar[0]], col.get(balls[ar[0]])-1);
                    col.put(balls.get(ar[0]), col.get(balls.get(ar[0]))-1);
                }
            }*/
            if(balls.containsKey(ar[0])){
                int c = balls.get(ar[0]);
                col.put(c, col.get(c)-1);
                if(col.get(c) == 0){
                    col.remove(c);
                }
            }
            //balls[ar[0]] = ar[1];
            balls.put(ar[0],ar[1]);
            col.put(ar[1],col.getOrDefault(ar[1],0)+1);
            ans[count++] = col.size();
        }
        return ans;
    }
}

