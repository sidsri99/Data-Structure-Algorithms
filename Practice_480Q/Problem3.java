/*
    Largest prime factor of a number
    Prime factor of 3195 are 5, 7, 13 and 29
    Largest = 29
*/

import java.io.*;
class Problem3{
    long LargestPrime(long num){
        for(long i=2;i*i<=num;i++){
            if(num % i == 0){
                num = num / i--;
            }
        }
        return num;
    }
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem3 obj=new Problem3();
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            long number=Long.parseLong(br.readLine());
            long largestPrime = obj.LargestPrime(number);
            System.out.println(largestPrime);
        }
    }
}

/*
Output : 
>javac Problem3.java
>java Problem3
>7
>2
2
>3
3
>5
5
>7
7
>8
2
>13195
29
>600851475143
6857
*/