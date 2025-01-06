/**
  
  P13: Minimum Number of Operations to Move All Balls to Each Box

  Example 1:
  Input: boxes = "110"
  Output: [1,1,3]
  Explanation: The answer for each box is as follows:
  1) First box: you will have to move one ball from the second box to the first box in one operation.
  2) Second box: you will have to move one ball from the first box to the second box in one operation.
  3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.

  Example 2:
  Input: boxes = "001011"
  Output: [11,8,5,4,3,4]

*/

class Solution {
    public int[] minOperations(String boxes) {
        int size = boxes.length();
        /* First solution
        int ans[]=new int[size];
        for(int i = 0; i<size; i++){
            if(boxes.charAt(i)=='1'){
                for(int j=0;j<size;j++){
                    //if(boxes.charAt(j)=='1'&& i!=j){
                        ans[j] += (int)Math.abs(i-j); 
                    //}
                }
            }
        }
        return ans;*/
        //Prefix and suffix sum
        int prefix[]=new int[size];
        int suffix[]=new int[size];
        int count=0;
        if(boxes.charAt(0)=='1')
            count++;
        for(int i=1;i<size;i++){
            prefix[i] = prefix[i-1] + count;
            if(boxes.charAt(i) == '1')
                count++; 
        }
        count=0;
        if(boxes.charAt(size-1)=='1')
            count++;
        for(int i=size-2;i>-1;i--){
            suffix[i] = suffix[i+1] + count;
            if(boxes.charAt(i) == '1')
                count++;
            prefix[i] += suffix[i]; 
        }
        return prefix;
    }
}

/*

>"110"
[1,1,3]
>"001011"
[11,8,5,4,3,4]

*/
