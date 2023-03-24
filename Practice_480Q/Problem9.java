/*Problem 9 : Special Pythagorean triplet
    a < b < c
    a^2 + b^2 = c^2
    3^2 + 4^2 = 9 + 16 = 25 = 52
    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc such that a + b + c = n.
*/
import java.io.*;
class Problem9{
    long pyTriplet(int num){
        for(int a=0;a<num-a;a++){
            for(int b=a+1;b<num-a-b;b++){
                int c = (int)Math.sqrt(((a*a)+(b*b)));
                if((a*a+b*b == c*c) && (a+b+c == num)){
                    return (a*b*c);
                }
            }
        }
        return -1;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem9 obj=new Problem9();
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int num = Integer.parseInt(br.readLine());
            System.out.println(obj.pyTriplet(num));
        }
    }
}
/*
Output:
>javac Problem9.java
>java Problem9
>3
>24
480
>120
49920
>1000
31875000
*/