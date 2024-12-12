/**
	
	P3: Take Gifts From the Richest Pile
	
	Example 1:
	Input: gifts = [25,64,9,4,100], k = 4
	Output: 29
	Explanation: 
	The gifts are taken in the following way:
	- In the first second, the last pile is chosen and 10 gifts are left behind.
	- Then the second pile is chosen and 8 gifts are left behind.
	- After that the first pile is chosen and 5 gifts are left behind.
	- Finally, the last pile is chosen again and 3 gifts are left behind.
	The final remaining gifts are [5,8,9,4,3], so the total number of gifts remaining is 29.

	Example 2:
	Input: gifts = [1,1,1,1], k = 4
	Output: 4
	Explanation: 
	In this case, regardless which pile you choose, you have to leave behind 1 gift in each pile. 
	That is, you can't take any pile with you. 
	So, the total gifts remaining are 4.
	
*/

import java.io.*;
import java.util.*;
class Problem3{
	
	public long pickGifts(int[] gifts, int k) {
        /*
        for(int i = 1; i<=k; i++){
            Arrays.sort(gifts);
            gifts[gifts.length-1] = (int)Math.floor(Math.sqrt(gifts[gifts.length-1]));
        }
        long rem = 0;
        for(int i = 0; i < gifts.length; i++){
            rem += gifts[i];
        }
        return rem;
        */
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i< gifts.length; i++){
            pq.add(gifts[i]);
        }
        for(int i = 1; i<=k;i++){
            int num = (int) Math.sqrt(pq.poll());
            pq.add(num);
        }
        long rem = 0;
        while(!pq.isEmpty()){
            rem += pq.poll(); 
        }
        return rem;
    }

	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem3 obj = new Problem3();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int gifts[] = new int[line.length];
			for(int i = 0; i<gifts.length;i++)
				gifts[i] = Integer.parseInt(line[i]);
			int k = Integer.parseInt(br.readLine());
			System.out.println(obj.pickGifts(gifts,k));
		}
	}
}

/*

>javac Problem3.java
>java Problem3
>2
>25 64 9 4 100
>4
29
>1 1 1 1
>4
4

*/