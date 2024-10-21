/**
	P9: Subset Sum Problem
	
	Input: arr[] = {3, 34, 4, 12, 5, 2}, sum = 9
	Output: true

	Input: arr[] = {3, 34, 4, 12, 5, 2} , sum = 30
	Output: false
	
*/

import java.util.*;
import java.io.*;
class Problem9{
	public static Boolean isPossible(int arr[], int sum, int pos, int dp[][]){
        if(sum == 0)return true;
        if(pos == 0){
            if(sum == arr[0])return true;
            else return false;
        }
        if(dp[pos][sum] != -1){
            if(dp[pos][sum] == 1)return true;
            else return false;
        }
        if(  isPossible(arr, sum, pos-1,dp) || 
            ( ((sum-arr[pos]) >= 0) && 
             isPossible(arr, sum-arr[pos], pos-1,dp))){
            dp[pos][sum] = 1;
            return true;
        }else{
            dp[pos][sum] = 0;
            return false;
        }
    }
    

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int dp[][] = new int[arr.length][sum+1];
        for(int i = 0; i< arr.length; i++)
        Arrays.fill(dp[i],-1);
        return isPossible(arr, sum, arr.length-1,dp);
    }
	
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Problem9 obj = new Problem9();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int sum = Integer.parseInt(br.readLine());
			int arr[]= new int[line.length];
			for(int i = 0; i< line.length; i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			System.out.println(Problem9.isSubsetSum(arr, sum));
		}
	}
}

/*

>javac Problem9.java
>java Problem9
>2
>3 34 4 12 5 2
>9
true
>3 34 4 12 5 2
>30
false

*/