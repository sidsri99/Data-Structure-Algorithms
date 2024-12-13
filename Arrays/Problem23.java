/**
	P23: Find Score of an Array After Marking All Elements
	
	Example 1:
	Input: nums = [2,1,3,4,5,2]
	Output: 7
	Explanation: We mark the elements as follows:
	- 1 is the smallest unmarked element, so we mark it and its two adjacent elements: [2,1,3,4,5,2].
	- 2 is the smallest unmarked element, so we mark it and its left adjacent element: [2,1,3,4,5,2].
	- 4 is the only remaining unmarked element, so we mark it: [2,1,3,4,5,2].
	Our score is 1 + 2 + 4 = 7.
	
	Example 2:
	Input: nums = [2,3,5,1,3,2]
	Output: 5
	Explanation: We mark the elements as follows:
	- 1 is the smallest unmarked element, so we mark it and its two adjacent elements: [2,3,5,1,3,2].
	- 2 is the smallest unmarked element, since there are two of them, we choose the left-most one, so we mark the one at index 0 and its right adjacent element: [2,3,5,1,3,2].
	- 2 is the only remaining unmarked element, so we mark it: [2,3,5,1,3,2].
	Our score is 1 + 2 + 2 = 5.
	
*/
import java.io.*;
import java.util.*;
class Problem23{
	/*
	public long getScore(int[] nums, boolean[] visited, int count,long score){
        if(count == nums.length) return score;

        int ind = -1;
        for(int i=0; i<nums.length ; i++){
            if(ind == -1){
                if(visited[i]==false)
                    ind = i;
                else
                    continue;
            }
            else{
                if(visited[i] == false){
                    if(nums[i]<nums[ind]){
                        ind = i;
                    }
                }else{
                    continue;
                }
            }
        }
        score += nums[ind];
        visited[ind] = true;
        count += 1; 
        if(ind-1>=0 && visited[ind-1]==false){
            visited[ind-1]=true;
            count += 1;
        }
        if(ind+1<nums.length && visited[ind+1]==false){
            visited[ind+1]=true;
            count += 1;
        }

        return getScore(nums, visited,count,score);  

    }
	*/
	public long findScore(int[] nums) {
        boolean visited[] = new boolean[nums.length];
        Arrays.fill(visited,false);
        long score = 0;
        //return getScore(nums,visited,0,score);
        int dp[][] = new int[nums.length][2];
        for(int i = 0; i< nums.length; i++){
            dp[i][0] = nums[i];
            dp[i][1] = i;
        }
        Arrays.sort(dp, (a,b) -> Integer.compare(a[0],b[0]));
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(visited[dp[i][1]] == false){
                visited[dp[i][1]] = true;
                score += dp[i][0];
                count++;
            
            if((dp[i][1]-1)>=0 && visited[dp[i][1]-1]==false){
                visited[dp[i][1]-1]=true;
                count += 1;
            }
            if((dp[i][1]+1)<nums.length && visited[dp[i][1]+1]==false){
                visited[dp[i][1]+1]=true;
                count += 1;
            }
            }
            if(count == nums.length)break;
        }
        return score;
    }
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem23 obj = new Problem23();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			for(int i = 0; i < line.length ; i++){
				nums[i] = Integer.parseInt(line[i]);
			}
			System.out.println(obj.findScore(nums));
		}
	}
}

/*

Output:

>javac Problem23.java
>java Problem23
>2
>2 1 3 4 5 2
7
>2 3 5 1 3 2
5

*/