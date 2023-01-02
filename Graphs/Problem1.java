/* Shortest Path

Consider a directed graph whose vertices are numbered from 1 to n.
  There is an edge from a vertex i to a vertex j iff either j = i + 1 or j = 3 * i.
  The task is to find the minimum number of edges in a path in G from vertex 1 to vertex n.

  Example: n = 9 ,  Steps =  2;  9 -> 3 -> 1
           n = 4 ,  Steps =  2;  4 -> 3 -> 1
           n = 887, Steps = 14;  887 -> 886 -> 885 -> 295 -> 294 -> 98 -> 97 -> 96 -> 32 -> 31 -> 30 -> 10 -> 9 -> 3 -> 1
  */

//

  import java.io.*;
  class Solution{
    int minStep(int n){
        //complete the function here
        int step=0;
        if(n <= 1){
            return 0;
        }
        else if( n%3 == 0 ){
            return (1 + minStep(n/3));
        }else{
            return (1 + minStep(n-1));    
        }
    }
  }
    class Problem1{
        public static void main(String args[])throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Solution obj = new Solution();
            System.out.println("Enter number of test cases");
            int t=Integer.parseInt(br.readLine());
            while( t-- > 0 ){
                System.out.println("Enter value of vertex n");
                int n = Integer.parseInt(br.readLine());
                System.out.println("Minimum Steps : "+ obj.minStep(n));
            }
            
        }
  }

 /*
 Output:
>javac Problem1.java

>java Problem1
Enter number of test cases
3
Enter value of vertex n
9
Minimum Steps : 2
Enter value of vertex n
4
Minimum Steps : 2
Enter value of vertex n
887
Minimum Steps : 14

 */ 

