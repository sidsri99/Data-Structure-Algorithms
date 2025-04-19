/**

  P53: Count the Number of Fair Pairs
  Example 1:
  Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
  Output: 6
  Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).

  Example 2:
  Input: nums = [1,7,9,2,5], lower = 11, upper = 11
  Output: 1
  Explanation: There is a single fair pair: (2,3).

*/

class Solution {
    public long getAllSum(int[] nums, int val){
        int start = 0, end = nums.length-1;
        long count = 0;
        while(start < end){
            int sum = nums[start]+nums[end];
            if(sum > val){
                end -= 1;
            }else{
                count += end-start;
                start += 1;
            }
        }
        return count;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        count = getAllSum(nums, upper) - getAllSum(nums,lower-1);
        return count;
        
        /*  TLE
        int count = 0;
        for(int i=0;i<nums.length-1; i++){
            for(int j=i+1; j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum>=lower && sum<=upper){
                    count +=1;
                }
            }  
        }
        return count;
        */ 
    }
}

/*

Input
nums =
[-5,-7,-5,-7,-5]
lower =
-12
upper =
-12
Output
6


*/
