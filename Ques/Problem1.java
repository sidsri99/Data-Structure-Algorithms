/*
	Distinct Pair Sums
	Given a range {L, L+1, ...., R}
	An integer X is said to be reachable if it can be represented as a sum of two not necessarily distinct integers in this range.
	Input:
	2
	2 2
	2 3
	Output:
	1
	3
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Problem1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String line[]=br.readLine().split(" ");
		    int l =Integer.parseInt(line[0]);
		    int r =Integer.parseInt(line[1]);
            System.out.println(2*r-2*l+1);
		}

	}
}


/*
Input:
6
2 2
2 3
1 1000000
2 1000000
2 999999
1 99999
Output:
1
3
1999999
1999997
1999995
199997
*/