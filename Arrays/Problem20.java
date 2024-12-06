/**
	P20: Maximum Number of Integers to choose from range 
	
	Example 1:
	Input: banned = [1,6,5], n = 5, maxSum = 6
	Output: 2
	Explanation: You can choose the integers 2 and 4.
	2 and 4 are from the range [1, 5], both did not appear in banned, and their sum is 6, which did not exceed maxSum.

	Example 2:
	Input: banned = [1,2,3,4,5,6,7], n = 8, maxSum = 1
	Output: 0
	Explanation: You cannot choose any integer while following the mentioned conditions.
	
	Example 3:
	Input: banned = [11], n = 7, maxSum = 50
	Output: 7
	Explanation: You can choose the integers 1, 2, 3, 4, 5, 6, and 7.
	They are from the range [1, 7], all did not appear in banned, and their sum is 28, which did not exceed maxSum.
*/
import java.io.*;
import java.util.*;
class Problem20{
	public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i<banned.length ; i++){
            hs.add(banned[i]);
        }
        int count = 0;
        for(int i = 1 ; i<=n ; i++ ){
            if((maxSum - i)< 0)
                break;
            if(!hs.contains(i)){
                maxSum = maxSum-i;
                count++;
            }
        }
        return count;
    }
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem20 obj = new Problem20();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int banned[] = new int[line.length];
			for(int i = 0; i < line.length ; i++){
				banned[i] = Integer.parseInt(line[i]);
			}
			int n = Integer.parseInt(br.readLine());
			int maxSum = Integer.parseInt(br.readLine());
			System.out.println(obj.maxCount(banned, n, maxSum));
		}
	}
}

/*
Output:
>javac Problem20.java
>java Problem20
>3
>1 6 5
>5
>6
2
>1 2 3 4 5 6 7
>8
>1
0
>11
>7
>50
7
*/