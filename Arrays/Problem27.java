/**

	P27: Final Prices With a Special Discount in a Shop
	
	Example 1:
	Input: prices = [8,4,6,2,3]
	Output: [4,2,4,2,3]
	Explanation: 
	For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
	For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
	For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
	For items 3 and 4 you will not receive any discount at all.
	
	Example 2:
	Input: prices = [1,2,3,4,5]
	Output: [1,2,3,4,5]
	Explanation: In this case, for all items, you will not receive any discount at all.
	
	Example 3:
	Input: prices = [10,1,1,6]
	Output: [9,0,1,6]
	
*/
import java.io.*;
import java.util.*;
class Problem27{
	
	public int[] finalPrices(int[] prices) {
        int answer[] = new int[prices.length];
        for(int i = 0 ; i<prices.length ; i++){
            answer[i] = prices[i];
            int j = i+1;
            while(j<prices.length && prices[j]>prices[i]){
                j++;
            }
            if(j==prices.length)continue;
            answer[i] -= prices[j];
        }      
        return answer;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem27 obj = new Problem27();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int prices[] =new int[line.length];
			for(int i=0; i<line.length; i++){
				prices[i] = Integer.parseInt(line[i]);
			}
			int answer[] = new int[line.length];
			answer = obj.finalPrices(prices);
			for(int i=0; i<line.length; i++){
				System.out.print(answer[i]+" ");
			}
			System.out.println("");
		}
	}
}

/*

Output:

>javac Problem27.java
>java Problem27
>3
>8 4 6 2 3
4 2 4 2 3
>1 2 3 4 5
1 2 3 4 5
>10 1 1 6
9 0 1 6

*/