/*
    Find nth Prime number
    Prime Numbers: 2, 3, 5, 7, 11, and 13
    6th prime no: 13
*/
import java.io.*;
class Problem7{
    boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num % i == 0)return false;
        }
        return true;
    }
    int nPrime(int num){
        int count = 0;
        for(int i=2;;i++){
            if(isPrime(i)){
                count++;
            }
            if(count == num)
                return i;
        }
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem7 obj = new Problem7();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int num=Integer.parseInt(br.readLine());
            System.out.println(obj.nPrime(num));
        }
    }
}

/*
Output:
>javac Problem7.java
>java Problem7
>5
>6
13
>10
29
>100
541
>1000
7919
>10001
104743
*/