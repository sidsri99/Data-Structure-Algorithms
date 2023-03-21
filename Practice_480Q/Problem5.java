/*
    Problem 5: Smallest multiple
    10:
    2520 = 2*3*2*5*7*2*3
*/

import java.io.*;
class Problem5{
    int gcd(int a,int b){
        if(b == 0)return a;
        return gcd(b,a%b);
    }
    int lcm(int a,int b){
        return (a*b / gcd(a,b));
    }
    int SmallMultiple(int num){
        int multiple = 1;
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

*/