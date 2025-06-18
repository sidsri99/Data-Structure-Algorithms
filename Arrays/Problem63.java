/**

  P63: Divide Array Into Arrays With Max Difference

  Example 1:
  Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
  Output: [[1,1,3],[3,4,5],[7,8,9]]
  Explanation:
  The difference between any two elements in each array is less than or equal to 2.
  
  Example 2:
  Input: nums = [2,4,2,2,5,2], k = 2
  Output: []
  Explanation:
  Different ways to divide nums into 2 arrays of size 3 are:
  [[2,2,2],[2,4,5]] (and its permutations)
  [[2,2,4],[2,2,5]] (and its permutations)
  Because there are four 2s there will be an array with the elements 2 and 5 no matter how we divide it. since 5 - 2 = 3 > k, the condition is not satisfied and so there is no valid division.

  Example 3:
  Input: nums = [4,2,9,8,2,12,7,12,10,5,8,5,5,7,9,2,5,11], k = 14
  Output: [[2,2,12],[4,8,5],[5,9,7],[7,8,5],[5,9,10],[11,12,2]]
  Explanation:
  The difference between any two elements in each array is less than or equal to 14.
  
*/

class Problem63 {
    public int[][] divideArray(int[] nums, int k) {
        /*Arrays.sort(nums);
        int arr[][]=new int[nums.length/3][3];
        int counter = 0,tmp = 0;
        for(int i=0; i<nums.length-2;i+=3){
            if(nums[i+2]-nums[i]>k){
                return (new int[0][0]);
            }
            arr[counter][0] = nums[i];
            arr[counter][1] = nums[i+1];
            arr[counter++][2] = nums[i+2];
        }
        return arr;*/
        List<int []>  ls = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i+=3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }
            ls.add(new int[]{nums[i],nums[i+1],nums[i+2]});
        }
        return ls.toArray(new int[0][0]);
    }
}
