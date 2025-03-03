/**

  P50: Partition Array According to Given Pivot

  Example 1:
  Input: nums = [9,12,5,10,14,3,10], pivot = 10
  Output: [9,5,3,10,10,12,14]
  Explanation: 
  The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
  The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
  The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
  
  Example 2:
  Input: nums = [-3,4,3,2], pivot = 2
  Output: [-3,2,4,3]
  Explanation: 
  The element -3 is less than the pivot so it is on the left side of the array.
  The elements 4 and 3 are greater than the pivot so they are on the right side of the array.
  The relative ordering of the elements less than and greater than pivot is also maintained. [-3] and [4, 3] are the respective orderings.

*/

class Problem50 {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        /*ArrayList<Integer> al=new ArrayList<Integer>();
        int index = 0, count = 0;
        for(int n:nums){
            if(n>pivot){
                al.add(n);
            }
            else if(n == pivot){
                count++;
            }
            else{
                ans[index++] = n; 
            }
        }
        for(int  i = 0; i<count; i++){
            ans[index++] = pivot;
        }
        for(int n: al){
            ans[index++] = n;
        }*/
        int ind = 0,count = 0;
        for(int n: nums){
            if(n<pivot){
                ans[ind] = n;
                ind += 1;
            }else if(n == pivot){
                count += 1;
            }
        }
        for(int i = 0; i< count; i++){
            ans[ind] = pivot;
            ind += 1; 
        }
        for(int n: nums){
            if(n > pivot){
                ans[ind] = n;
                ind += 1;
            }
        }
        return ans;
    }
}
/*

*/
