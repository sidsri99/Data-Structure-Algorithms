/*
    Two Sum
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.

    exactly one solution. 

    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].  
    
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]
*/

class Problem9 {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int arr[]=new int[2];
        arr[0]=-1;arr[1]=-1;
        int nums1[]=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            nums1[k]=nums[k];
        }
        Arrays.sort(nums1);
        while(i<j){
            if((nums1[i]+nums1[j])==target){
                break;
            }
            else if(nums1[i]+nums1[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(arr[0]==-1 && nums[k]==nums1[i]){
                arr[0]=k;
            }
            else if(nums[k]==nums1[j]){
                arr[1]=k;
            }
            if(arr[0] != -1 && arr[1] != -1)
            break;
        }
        return arr;
    }
}

