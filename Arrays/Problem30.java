/*

  P30: Number of Ways to Split Array

  Example 1:
  Input: nums = [10,4,-8,7]
  Output: 2
  Explanation: 
  There are three ways of splitting nums into two non-empty parts:
  - Split nums at index 0. Then, the first part is [10], and its sum is 10. The second part is [4,-8,7], and its sum is 3. Since 10 >= 3, i = 0 is a valid split.
  - Split nums at index 1. Then, the first part is [10,4], and its sum is 14. The second part is [-8,7], and its sum is -1. Since 14 >= -1, i = 1 is a valid split.
  - Split nums at index 2. Then, the first part is [10,4,-8], and its sum is 6. The second part is [7], and its sum is 7. Since 6 < 7, i = 2 is not a valid split.
  Thus, the number of valid splits in nums is 2.
  
  Example 2:
  Input: nums = [2,3,1,0]
  Output: 2
  Explanation: 
  There are two valid splits in nums:
  - Split nums at index 1. Then, the first part is [2,3], and its sum is 5. The second part is [1,0], and its sum is 1. Since 5 >= 1, i = 1 is a valid split. 
  - Split nums at index 2. Then, the first part is [2,3,1], and its sum is 6. The second part is [0], and its sum is 0. Since 6 >= 0, i = 2 is a valid split.

*/

class Problem30 {
    public int waysToSplitArray(int[] nums) {
        int count = 0,size = nums.length;
        long prefix = 0, sum = 0; // use long to avoid wrong answer for large cases
        for(int i: nums){
            sum += i;
        }
        for(int i=0;i<size-1;i++){
            prefix += nums[i];
            sum -= nums[i]; 
            if(prefix>=sum)
                count++;
        }
        return count;
    }
}

/*
>10 4 -1 7
2
>2 3 1 0
2
>9 9 9
1
0 0
1
*/
