/*
   Problem 1: Minimum Number of Pizzas
   N people 
   Each pizza has K slices
   Find minimum number of pizzas so that everyone get equal slices and no slices are left. 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Problem1
{
    static int gcd(int num1, int num2){
        if(num2 == 0)
            return num1;
        else{
            return gcd(num2, num1%num2);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    String line[] = br.readLine().split(" ");
		    int n=Integer.parseInt(line[0]);
		    int k=Integer.parseInt(line[1]);
		    int pizza = n /Problem1.gcd(n,k);
		    System.out.println(pizza);
		}
	}
}



/*
Input: 
7
2 2
2 3
4 2
9 6
10 12
7 5
3250021 8506441

Output:
1
2
2
3
5
7
3250021
*/