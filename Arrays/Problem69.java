/**
  P69: Container With Most Water

  Example 1:
  Input: height = [1,8,6,2,5,4,8,3,7]
  Output: 49
  Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

  Example 2:
  Input: height = [1,1]
  Output: 1

  Two pointer algorithm
  
*/

class Problem69 {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int ans = 0;
        while(left<right){
            ans = Math.max(ans,Math.min(height[right],height[left]) * (right-left));
            if(height[right]<height[left]){
                right -= 1;
            }else{
                left += 1;
            }
        }
        return ans;
    }
}
