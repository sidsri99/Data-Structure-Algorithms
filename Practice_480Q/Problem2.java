/*
    Problem 2: Even Fibonacci Numbers
    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    By considering the terms in the Fibonacci sequence whose values do not exceed n, find the sum of the even-valued terms.

*/

import java.io.*;
class Problem2{
    long SumEvenFib(int num){
        int a = 1;
        int b = 2;
        int c = 0;
        long sum =0;
        if(num > 2){
            sum = sum + 2;
        }
        for(int i = 3; i<num; i++){
            c = a + b;
            a = b;
            b = c;
            if(c > num)
                return sum;
            else if(c % 2 == 0){
                sum = sum + c;
            }
        }
        return sum;
    }
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Problem2 obj = new Problem2();
        int test  = Integer.parseInt(br.readLine());
        while(test-->0){
            int number = Integer.parseInt(br.readLine());
            long sum = obj.SumEvenFib(number);
            System.out.println(sum);
        }
    }
}

/*
Output: 
>javac Problem2.java
>java Problem2
>7
>8
10
>10
10
>34
44
>60
44
>1000
798
>100000
60696
>4000000
4613732
*/