/**
 P3: Permutations
 
	Example 1:
	Input: nums = [1,2,3]
	Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

	Example 2:
	Input: nums = [0,1]
	Output: [[0,1],[1,0]]
	
	Example 3:
	Input: nums = [1]
	Output: [[1]]
 
*/

import java.io.*;
import java.util.*;
class Problem3{
	
	public void swap(int[] nums, int i, int ind){
        int temp = nums[i];
        nums[i] = nums[ind];
        nums[ind] = temp;
    }
    public void getPermutation(int[] nums, int ind, List<List<Integer>> lli){
        if(ind == nums.length-1){
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++){
                al.add(nums[i]);
            }
            //lli.add(new ArrayList<>(al));
            lli.add(al);
            return;
        }
        for(int i = ind; i<nums.length;i++){
            swap(nums,ind,i);
            getPermutation(nums, ind+1, lli);
            swap(nums,ind,i);
        }

    }
	
	public void getAll(int[] nums, boolean[] index, List<List<Integer>> lli, ArrayList<Integer> li){
        if(li.size() == nums.length){
            lli.add(new ArrayList<>(li));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(index[i] == true)continue;
            li.add(nums[i]);
            index[i] = true;

            getAll(nums,index, lli, li);

            //li.remove(li.indexOf(nums[i]));
            li.remove(li.size()-1);
            index[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        /*
		List<List<Integer>> lli = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        boolean index[] = new boolean[nums.length];
        getAll(nums,index,lli,al);
        return lli;
		*/
		// Space Optimized - By Swap in Array instead of maintaining index used or not
		List<List<Integer>> lli = new ArrayList<>();
        getPermutation(nums, 0, lli);
        return lli;
		
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem3 obj = new Problem3();
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			for(int i = 0; i<nums.length; i++){
				nums[i] = Integer.parseInt(line[i]);
			}
			System.out.println(obj.permute(nums));
		}
	}
}

/*
>javac Problem3.java
>java Problem3
>3
>1 2 3
[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
>0 1
[[0, 1], [1, 0]]
>1
[[1]]
*/