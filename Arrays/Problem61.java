/**

  P60: Sort Colors
  
  Example 1:
  Input: nums = [2,0,2,1,1,0]
  Output: [0,0,1,1,2,2]
  
  Example 2:
  Input: nums = [2,0,1]
  Output: [0,1,2]

*/

class Problem61 {
    public void sortColors(int[] nums) {
     //Arrays.sort(nums);
     int a=0,b=0,c=0;
     for(int i:nums){
        if(i == 0){
            a += 1;
        }else if(i ==1){
            b += 1;
        }else{
            c += 1;
        }
     }
     for(int i = 0 ;i<nums.length; i++){
        if(a>0){
            nums[i] = 0;
            a -= 1;
        }else if(b>0){
            nums[i] = 1;
            b -= 1;
        }else{
            nums[i] = 2;
        }
     }   
    }
}
