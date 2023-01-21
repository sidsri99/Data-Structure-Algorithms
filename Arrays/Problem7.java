/*
    Search Insert Problem
    Given a sorted array of distinct integers and a target value,
    return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.

    Example 1:
    Input: nums = [1,3,5,6], target = 5
    Output: 2
    Example 2:
    Input: nums = [1,3,5,6], target = 2
    Output: 1
    Example 3:
    Input: nums = [1,3,5,6], target = 7
    Output: 4
*/

class Problem7 {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1,mid=0;
        while(start<=end){
            mid = (start + end)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        if(nums[mid]<target)
            return (mid+1);
        //else if(nums[mid]>target)
            //if(nums[mid]>target && nums[mid-1]<target)
        return mid;
            //return (mid-1);
        //return 0;
    }
}