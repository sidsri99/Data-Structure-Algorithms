/**

  P65: Find Lucky Integer in an Array

  Example 1:
  Input: arr = [2,2,3,4]
  Output: 2
  Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
  
  Example 2:
  Input: arr = [1,2,2,3,3,3]
  Output: 3
  Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
  
  Example 3:
  Input: arr = [2,2,2,3,3]
  Output: -1
  Explanation: There are no lucky numbers in the array.
 
  Constraints:
  1 <= arr.length <= 500
  1 <= arr[i] <= 500

*/

class Solution {
    public int findLucky(int[] arr) {
        /*
        int ans = -1, count = 0, size = arr.length-1;
        Arrays.sort(arr);
        int prev = arr[size];
        for(int i = size; i>-1; i--){
            while(i>-1 && arr[i] == prev){
                count += 1;
                i -= 1;
            }
            if(prev == count){
                ans = prev;
                break;
            }
            if(i > -1){
                prev = arr[i];
                count = 0;
                i += 1;
            }
        }
        return ans;
        */
        int count[]=new int[501];
        for(int num: arr){
            count[num] += 1;
        }
        for(int i = 500; i>0 ; i--){
            if((i) == count[i])return i;
        }
        return -1;
    }
}
