/**
	Min Cost Climbing Stairs
	Ex 1:
	Input: cost = [10,15,20]
	Output: 15
	
	Example 2:
	Input: cost = [1,100,1,1,1,100,1,1,100,1]
	Output: 6
	
*/
import java.io.*;
class Problem1{
	public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        for(int i = 0 ;i<cost.length;i++){
            if(i == 0 || i==1)dp[i]=cost[i];
            else{
                dp[i]=cost[i] + Math.min(dp[i-1],dp[i-2]);
            }
        }
        return Math.min((dp[cost.length-1]),dp[cost.length-2]);
    }
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem1 obj = new Problem1();
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			String line[] = br.readLine().split(" ");
			int cost[] = new int[line.length];
			for(int i=0; i<cost.length; i++){
				cost[i] = Integer.parseInt(line[i]);
			}
			System.out.println(obj.minCostClimbingStairs(cost));
		}
	}
}

/*
>javac Problem1.java

>java Problem1
>2
>10 15 20
15
>1 100 1 1 1 100 1 1 100 1
6

*/