/*
    Longest Collatz sequence
    n → n/2 (n is even)
    n → 3n + 1 (n is odd)
    Starting with 13, we generate the following sequence:
    13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 :10
    Which starting number, under the given limit, produces the longest chain?

*/

//Add Memoization

import java.io.*;
class Problem14{
    int longestCollatzSeq(int num){
        int longest = 0,longestNum=0;
        int temp;
        //for(int i=num ; i<=num;i++)
        for(int i=num/2;i<=num;i++){
            temp = i;
            int count = 1;
            while(temp !=1){
                if(temp % 2 == 0){
                    count++;
                    temp = temp / 2;
                }else{
                    count++;
                    temp = 3*temp + 1;
                }
            }
            if(count > longest){
                longest =count;
                longestNum = i;
            }
        }
        return longestNum;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem14 obj =new Problem14();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(obj.longestCollatzSeq(n));
        }
    }
}
/*
    Output:
    >javac Problem14.java
    >java Problem14
    >6
    >14
    9
    >5847
    3711
    >46500
    35655
    >54512
    52527
    >100000
    77031
    >1000000
    ?837799
*/