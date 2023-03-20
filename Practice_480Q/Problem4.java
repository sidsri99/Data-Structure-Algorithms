/*
    Largest palindrome product
    from n digit number
*/

import java.io.*;
class Problem4{
    long LargestPalin(int num){
        int max = 0,min = 1 ;
        long largest = -1;
        for(int i=1; i<=num ;i++){
            max = max * 10 + 9;
            min = min * 10 + 0;
        }
        min = min/10;
        for(int i = max; i>min ; i--){
            for(int j = max; j>min ; j-- ){
                long prod = i*j;
                long temp= prod, prod2 = 0;
                while(temp != 0){
                    prod2 = prod2 * 10 +  temp % 10;
                    temp = temp / 10;
                }
                if(prod == prod2){
                    if(prod > largest)
                        largest = prod;
                    break;
                }
            }
        }
        return largest;
    }
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem4 obj=new Problem4();
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int num = Integer.parseInt(br.readLine());
            System.out.println(obj.LargestPalin(num));
        }
    }
}

/*
    Output:
    >javac Problem4.java
    >java Problem4
    >2
    >2
    9009
    >3
    906609

*/