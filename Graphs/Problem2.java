/*
    Sum of dependencies in a graph
    Given a directed graph with V nodes and E edges.
    If there is an edge from u to v then u depends on v.
    Find out the sum of dependencies for every node.
    Duplicate edges should be counted as separate edges.

    Example :
    Input: 4 4
           0 2 0 3 1 3 2 3 
    V=4
    E=4
    Edges={ {0,2},{0,3},{1,3},{2,3} }
    Output:
    4
    
    Example :
    Input: 4 3
           0 3 0 2 0 1
    V=4
    E=3
    Edges={ {0,3},{0,2},{0,1} }
    Output:
    3

*/

import java.io.*;
import java.util.*;

class Problem2{

    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        if(V<1)
            return 0;
        return ( (adj.get(V-1).size()) + sumOfDependencies(adj,V-1) );
 
    }

    public static void main(String args[])throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem2 obj=new Problem2();
        System.out.println("Enter number of test cases");
        int t=Integer.parseInt(br.readLine());
        while( t-- >  0){

            int M,N,x,y;
            String line1[]= br.readLine().split(" ");
            N = Integer.parseInt(line1[0]);
            M = Integer.parseInt(line1[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(N);
            for(int i =0; i < N; i++){
                adj.add(new ArrayList<Integer>());
            }
            String line2[]= br.readLine().split(" ");
            for(int i=0; i < 2*M; i+=2){
                x=Integer.parseInt(line2[i]);
                y=Integer.parseInt(line2[i+1]);
                adj.get(x).add(y);
            } 
            System.out.println(obj.sumOfDependencies(adj,N));
        }
    }
}


/*
    Output:
    >javac Problem2.java

    >java Problem2
    Enter number of test cases
    >2
    >4 4
    >0 2 0 3 1 3 2 3
    4
    >4 3
    >0 3 0 2 0 1
    3
*/