/**

  P2: Count Total Number of Colored Cells

  Example 1:
  Input: n = 1
  Output: 1
  Explanation: After 1 minute, there is only 1 blue cell, so we return 1.
  
  Example 2:
  Input: n = 2
  Output: 5
  Explanation: After 2 minutes, there are 4 colored cells on the boundary and 1 in the center, so we return 5. 

*/

class Problem2{
    public long coloredCells(int n) {
     /*long sum = 1; long num = 4;
     for(int i = 2; i <= n; i++){
        sum += num;
        num +=4;
     }
     return sum;*/
     return 1+(long)n*(n-1)*2;
    }
}

/*
>n=3
13
>n=4
25
>n=100000
19999800001

*/
