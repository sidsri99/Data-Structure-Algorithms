/**
	P21: Special Array II
	
	Example 1:
	Input: nums = [3,4,1,2,6], queries = [[0,4]]
	Output: [false]
	Explanation:
	The subarray is [3,4,1,2,6]. 2 and 6 are both even.

	Example 2:
	Input: nums = [4,3,1,6], queries = [[0,2],[2,3]]
	Output: [false,true]
	Explanation:
	The subarray is [4,3,1]. 3 and 1 are both odd. So the answer to this query is false.
	The subarray is [1,6]. There is only one pair: (1,6) and it contains numbers with different parity. So the answer to this query is true.
	
*/
import java.io.*;
import java.util.*;
class Problem21{
	public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean ans[]=new boolean[queries.length];
        int prefix[] = new int[nums.length];
        for(int i = 1 ; i < nums.length ; i++){
            if((nums[i]+nums[i-1]) % 2 == 0){
                prefix[i] = prefix[i-1]+1;
            }else{
                prefix[i] = prefix[i-1];
            }
        }
        for(int i = 0 ; i < ans.length ; i++){
            if(prefix[queries[i][1]]-prefix[queries[i][0]] == 0)
                ans[i] = true;
            else
                ans[i] = false;
        }
        return ans;
    }
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem21 obj = new Problem21();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			for(int i = 0; i < line.length ; i++){
				nums[i] = Integer.parseInt(line[i]);
			}
			int num = Integer.parseInt(br.readLine());
			int queries[][]=new int[num][2];
			for(int i = 0; i < num ; i++){
				String new_line[] = br.readLine().split(" ");
				queries[i][0] = Integer.parseInt(new_line[0]);
				queries[i][1] = Integer.parseInt(new_line[1]);
			}
			boolean ans[]=new boolean[num];
			ans = obj.isArraySpecial(nums, queries);
			for(int i = 0 ; i< num ; i++){
				System.out.print(ans[i]+" ");
			}
			System.out.println("");
		}
	}
}

/*
Output:

>javac Problem21.java
>java Problem21
>2
>3 4 1 2 6
>1
>0 4
false
>4 3 1 6
>2
>0 2
>2 3
false true

*/