/*
    Sum square difference
    10:
    (1 + 2 + ... + 10)^2 = 552 = 3025
    1^2 + 2^2 + ... + 10^2 = 385
    3025 − 385 = 2640
*/

import java.io.*;
class Problem6{
    long SumSquareDiff(long num){
        long sum = 0;
        for(long i=1;i<=num;i++){
            sum = sum + i*i;
        }
        sum = (num*(num+1)/2) * (num*(num+1)/2) -sum;
        return sum;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Problem6 obj=new Problem6();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            long num = Long.parseLong(br.readLine());
            System.out.println(obj.SumSquareDiff(num));
        }
    }
}

/*
Output:
>javac Problem6.java
>java Problem6
>3
>10
2640
>20
41230
>100
25164150
*/