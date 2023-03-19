/*
Problem 1: Multiples of 3 or 5
Number 10: 3 + 5 + 6 + 9 = 23.

Find the sum of all the multiples of 3 or 5 below the provided parameter value number.
*/

import java.io.*;
class Problem1{
    long sumOfMul(int num){
        long sum = 0;
        for(int i=1 ; i<num ; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum = sum + i ;
            }
        }
        return sum;
    }
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem1 obj = new Problem1();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int number = Integer.parseInt(br.readLine());
            long sum = obj.sumOfMul(number);
            System.out.println(sum);
        }
    }
}

/*
Output: 
>javac Problem1.java
>java Problem1
>5
>10
23
>49
543
>1000
233168
>8456
16687353
>19564
89301183

*/