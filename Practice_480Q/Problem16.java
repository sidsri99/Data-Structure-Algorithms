/**
 * Problem 16: Power digit sum
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2exponent?
 */

import java.io.*;
import java.math.BigInteger;

class Problem16{
    BigInteger PowerDigitSum(int num){
        BigInteger number,num2,num10;
        BigInteger sum;
        number = BigInteger.valueOf(1);
        num2 = BigInteger.valueOf(2);
        num10 = BigInteger.valueOf(10);
        sum = BigInteger.valueOf(0);
        for(int i=1;i<=num;i++){
            number = number.multiply(num2);
        }
        while(!number.equals(BigInteger.valueOf(0))){
            sum = sum.add(number.mod(num10));
            number = number.divide(num10);
        }
        return sum;
    }
    // long PowerDigitSum(int num){
    //     long sum = 0;
    //     long n = Power(num);
    //     while(n!=0){
    //         sum = sum + n%10;
    //         n = n/10;
    //     }
    //     return sum;
    // }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem16 obj=new Problem16();
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            System.out.println(obj.PowerDigitSum(n));
        }
    }
}

/** 
 * >javac Problem16.java
 * >java Problem16
 * >3
 * >15
 * 26
 * >128
 * 166
 * >1000
 * 1366
 */