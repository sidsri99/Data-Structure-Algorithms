/*
    Problem 6: 	Indivisual Permutation
    Given an integer N. Construct an array P of size N such that:
    P is permutation of first N natural number where each N occurs exactly one.
    P is indivisible if i does not divide Pi for 2<=i<=N.
    Example :
	Input:
	4
	2
	3
	4
	5
	Output:
	2 1 
	1 3 2 
	1 3 4 2 
	4 5 2 3 1 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Problem6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        /*String s="2 ";
        for(int i=3;i<100000;i++){
            s += i+" ";
        }*/
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            //String out= s.substring(0,n*2-2) + "1";
            for(int i=2;i<=n;i++)
                System.out.print(i+ " ");
            System.out.println("1");
            //System.out.println(out);
        }
	}
}

/*
Output:
>javac Problem6.java
>java Problem6
>6
>1
1
>2
2 1
>3
2 3 1
>4
2 3 4 1
>8
2 3 4 5 6 7 8 1
>10
2 3 4 5 6 7 8 9 10 1
*/