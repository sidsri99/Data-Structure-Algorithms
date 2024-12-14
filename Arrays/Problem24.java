/**

	P24: Continuous Subarrays

	Example 1:
	Input: nums = [5,4,2,4]
	Output: 8
	Explanation: 
	Continuous subarray of size 1: [5], [4], [2], [4].
	Continuous subarray of size 2: [5,4], [4,2], [2,4].
	Continuous subarray of size 3: [4,2,4].
	Thereare no subarrys of size 4.
	Total continuous subarrays = 4 + 3 + 1 = 8.
	It can be shown that there are no more continuous subarrays.
 
	Example 2:
	Input: nums = [1,2,3]
	Output: 6
	Explanation: 
	Continuous subarray of size 1: [1], [2], [3].
	Continuous subarray of size 2: [1,2], [2,3].
	Continuous subarray of size 3: [1,2,3].
	Total continuous subarrays = 3 + 2 + 1 = 6.
	
*/
import java.io.*;
import java.util.*;
class Problem24{

	public long continuousSubarrays(int[] nums) {
        //return unOptimize(nums);
        TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
        long count = 0;
        int slow = 0;
        for(int fast = 0 ; fast < nums.length ; fast++ ){
            tm.put(nums[fast], tm.getOrDefault(nums[fast],0)+1);
            while(tm.lastKey() - tm.firstKey() > 2){
                tm.put(nums[slow], tm.get(nums[slow])-1);
                if(tm.get(nums[slow]) == 0){
                    tm.remove(nums[slow]);
                }
                slow++;
            }
            count += fast - slow + 1; 
        }
        return count;
    }

    public long unOptimize(int[] nums){
        long count = 0;
        for(int i = 0; i < nums.length ; i++){
            int max=0,min=0;
            for(int j = i; j < nums.length ; j++){
                if(i == j){
                    max = min = nums[i];
                    count++;
                }
                else{
                    int maxdif = Math.abs(max - nums[j]);
                    int mindif = Math.abs(min - nums[j]);
                    if(maxdif <=2 && mindif <=2 && mindif>=0 && maxdif>=0){
                        max = Math.max(max, nums[j]);
                        min = Math.min(min, nums[j]);
                        count++;
                    }else{
                        break;
                    }     
                }   
            }
        } 
        return count;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem24 obj = new Problem24();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			for(int i = 0; i < line.length ; i++){
				nums[i] = Integer.parseInt(line[i]);
			}
			System.out.println(obj.continuousSubarrays(nums));
		}
	}
}

/*

Output:

>javac Problem24.java
>java Problem24
>4
>5 4 2 4
8
>1 2 3
6
>65 66 67 66 66 65 64 65 65 64
43
>1 1 1 1 1 1 1 1 1 1
55

*/