/**

  P34: Greatest Sum Divisible by Three
  Example 1:
  Input: nums = [3,6,5,1,8]
  Output: 18
  Explanation: Pick numbers 3, 6, 1 and 8 their sum is 18 (maximum sum divisible by 3).
  
  Example 2:
  Input: nums = [4]
  Output: 0
  Explanation: Since 4 is not divisible by 3, do not pick any number.
  
  Example 3:
  Input: nums = [1,2,3,4,4]
  Output: 12
  Explanation: Pick numbers 1, 3, 4 and 4 their sum is 12 (maximum sum divisible by 3).

*/

class Problem34 {
    public int maxSum(int[] nums, int[][] dp, int ind, int mod){
        if(ind == nums.length){
            if(mod == 0){
                return 0;
            }else{
                return Integer.MIN_VALUE;
            }
        }
        if(dp[ind][mod]!=Integer.MIN_VALUE)
            return dp[ind][mod];
        int include, exclude;
        include = nums[ind] + maxSum(nums, dp, ind+1, (mod + (nums[ind]%3))%3);
        exclude = maxSum(nums, dp, ind+1, mod);
        return dp[ind][mod] = Math.max(include,exclude);
    }
    public int maxSumDivThree(int[] nums) {
        int dp[][]=new int[nums.length][3];
        for(int i = 0 ; i< nums.length; i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        int sum = maxSum(nums, dp, 0, 0);
        return sum;
    }
}
