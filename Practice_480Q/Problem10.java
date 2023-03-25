/*
    Problem 10: Summation of primes
    sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
    Find sum of all the primes below n
*/
import java.io.*;
class Problem10{
    boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i == 0)return false;
        }
        return true;
    }
    long SumPrime(int n){
        long sum = 0;
        for(int i=2;i<n;i++){
            if(isPrime(i))
                sum = sum + i;
        }
        return sum;
    }
    public static void main(String args[])throws IOException{
        Problem10 obj=new Problem10();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int num=Integer.parseInt(br.readLine());
            System.out.println(obj.SumPrime(num));
        }
    }
}
/*
Output:
>javac Problem10.java
>java Problem10
>4
>17
41
>2001
277050
>140759
873608362
>2000000
142913828922
*/