/*
    Make it Divisible
    Given an integer N, find N-digit odd positive integer such that it is divisible by 3 but not by 9.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Problem5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String num ="";
            if(n == 1){
                num = "3";
            }
            else if(n == 2 ){
                num ="33";
            }
            else{
                for(int i = 0; i<n;i++){
                    if(i<2){
                        num += "1";
                    }
                    else if(i == n-1){
                        num += "1";
                    } 
                    else{
                        num += "0";
                    }
                }
            }
            System.out.println(num);
        }
	}
}
/*
   >javac Problem5.java
   >java Problem5
   >6
   >1
   3
   >2
   33
   >10
   1100000001
   >20
   11000000000000000001
   >3
   111
   >40
   1100000000000000000000000000000000000001
*/