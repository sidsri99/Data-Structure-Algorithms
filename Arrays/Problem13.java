/**
	P13: Best Time to Buy and Sell stock
*/
import java.util.*;
import java.io.*;

class Problem13{
	// Sliding Window Technique
	public int maxProfitBetter(int[] prices){
		int maxProfit = 0;
		int i=0,j=1;
//		while(i<prices.length && j<prices.length){
	    while(j<prices.length){
			if(prices[j]>prices[i]){
				int profit = prices[j]-prices[i];
				maxProfit = Math.max(profit, maxProfit);
//				j++;
			}
			else{
//				i++;
				i = j;
//				j++;
			}
			j++;
		}
		return maxProfit;
	}
	public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length == 0)return 0;
        int arr[]=new int[prices.length];
        arr[prices.length-1] = prices[prices.length-1];
        for(int i = prices.length-2; i>=0 ; i--){
            arr[i] = Math.max(prices[i], arr[i+1]);
        }
        for(int i = 0;i<prices.length-1;i++){
            int profit = arr[i] - prices[i];
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem13 obj=new Problem13();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int arr[]=new int[line.length];
			for(int i=0;i<line.length;i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			int maxProfit = obj.maxProfit(arr);
			System.out.println(maxProfit);
			
			maxProfit = obj.maxProfitBetter(arr);
			System.out.println(maxProfit);
		}
	}
}


/*
Output:
>javac Problem13.java
>java Problem13
>2
>7 1 5 3 6 4
5
5
>7 6 4 3 1
0
0
*/