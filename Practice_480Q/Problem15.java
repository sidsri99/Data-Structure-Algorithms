/*
    Problem 15: Lattice paths
    Starting in the top left corner of a 2×2 grid,
    and only being able to move to the right and down,
    there are exactly 6 routes to the bottom right corner.

    How many such routes are there through a given gridSize?

*/

/**
 * Possible lattice path = 
 *      nCr = n! / ( (n-r)! * r! )
 *      n = shortest path length
 *      r = max length in one direction
 */

import java.io.*;
class Problem15{
    long Lattice(int n){
        long val = 1;
        for(int i=2*n, j=2 ; i>n ; i--){
            val = val * i ;
            //To avoid overflow in larger number
            while(val % j == 0 && j <= n){
                val = val / j;
                j++;
            }
        }
        // for(int i = n-1 ; i>2;i--){
        //     val = val / i ;
        // }
        return val;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem15 obj=new Problem15();
        int t= Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            System.out.println(obj.Lattice(n));
        }
    }
}

/**
    Output:
    >javac Problem15.java
    >java Problem15
    >4
    >2
    6
    >4
    70
    >9
    48620
    >20
    137846528820
 */