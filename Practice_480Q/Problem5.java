/*
    Problem 5: Smallest multiple
    10:
    2520 = 2*3*2*5*7*2*3
*/

import java.io.*;
class Problem5{
    long gcd(long a, long b){
        if(a == 0)return b;
        return gcd(b%a,a);
    }
    long lcm(long a,long b){
        return (a*b / gcd(a,b));
    }
    long SmallMultiple(int num){
        long multiple = 1;
        for( int i = 2; i<=num ; i++ ){
            multiple = lcm(multiple, i); 
        }
        return multiple;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem5 obj = new Problem5();
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int num = Integer.parseInt(br.readLine());
            System.out.println(obj.SmallMultiple(num));
        }
    }
}
/*
Output:
>javac Problem5.java
>java Problem5
>5
>5
60
>7
420
>10
2520
>13
360360
>20
232792560
*/