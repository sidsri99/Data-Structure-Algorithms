/*
P29: Maximum Score After Splitting a String
  Example 1:
  Input: s = "011101"
  Output: 5 
  Explanation: 
  All possible ways of splitting s into two non-empty substrings are:
  left = "0" and right = "11101", score = 1 + 4 = 5 
  left = "01" and right = "1101", score = 1 + 3 = 4 
  left = "011" and right = "101", score = 1 + 2 = 3 
  left = "0111" and right = "01", score = 1 + 1 = 2 
  left = "01110" and right = "1", score = 2 + 1 = 3
  
  Example 2:
  Input: s = "00111"
  Output: 5
  Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
  
  Example 3:
  Input: s = "1111"
  Output: 3
*/
class Problem29{
    public int maxScore(String s) {
        int maxSum = 0, size = s.length();
        /*if(size == 2){
            if(s.charAt(0) == '0')
                maxSum++;
            if(s.charAt(1) == '1')
                maxSum++;
            return maxSum;
        }
        int left[] = new int[size];
        int right[] = new int[size];
        
        if(s.charAt(0) == '0')
            left[0]=1;
        for(int i=1;i<size;i++){
            if(s.charAt(i) == '0'){
                left[i] = left[i-1]+1;
            }else{
                left[i] = left[i-1];
            }
        }
        if(s.charAt(size-1) == '1')
            right[size-1]=1;
        for(int i=size-2;i>-1;i--){
            if(s.charAt(i) == '1'){
                right[i] = right[i+1]+1;
            }else{
                right[i] = right[i+1];
            }
        }

        for(int i = 1; i< size-1; i++){
            int sum = left[i]+right[i];
            maxSum = Math.max(sum,maxSum);
        }*/

        int sum = 0 ;

        for(int i=1;i<size;i++){
            if(s.charAt(i)=='1')
                sum += 1;
        }
        if(s.charAt(0)=='0'){
            sum += 1;
        }
        maxSum = sum;

        for(int i = 1; i<size-1; i++){
            if(s.charAt(i)== '0')
                sum += 1;
            else{
                sum -=1;
            }
            maxSum=Math.max(sum,maxSum);
        }

        return maxSum;
    }
}

/*
>00
1
>0000
3
>11
1
>1111
3
>010
2
>00111
5
>1011011
5
>011101
5
*/
