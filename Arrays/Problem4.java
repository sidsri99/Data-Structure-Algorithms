/*
    Remove duplicate elements in sorted Array
    Also return new length as array, i.e., the first n elements of Array to consider. 

*/

class Problem4 {
    public int removeDuplicates(int[] nums) {
        int num=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            int j=i;
            while(j<nums.length && nums[j]<=num){
                j++;           
            }
            if(j< nums.length){
                count++;
                nums[i]=nums[j];
                num=nums[j];
            }
            
        }
        return count;
    }

    public int removeDuplicatesOptimized(int[] nums){
        int current = nums[0];
        int j=0;
        for (int i=1; i<nums.length; i++){
            if (nums[j] == nums[i]){
                continue;
            }
            nums[j+1] = nums[i];
            j++;
            
            
        }
        return j+1;
    }
}