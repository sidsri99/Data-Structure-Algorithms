/*
    Minimize the sum of product
    A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1]
    Suffling of elements of arrays A and B is allowed
*/

import java.io.*;
import java.util.*;
import java.lang.*;
class Problem8 {

    public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        long sum=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            sum += a[i]*b[a.length-1-i];
        }
        return sum;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n= Integer.parseInt(br.readLine().trim());
            long a[]=new long[(int)(n)];
            long b[]=new long[(int)(n)];

            String inputLine[]= br.readLine().trim().split(" ");
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(inputLine[i]);
            }
            String inputLine1[]= br.readLine().trim().split(" ");
            for(int i=0;i<n;i++){
                b[i]=Long.parseLong(inputLine1[i]);
            }

            Problem8 obj=new Problem8();
            System.out.println(obj.minValue(a,b,n));
        }
    }
}

/*
    Output-
    >javac Problem8.java
    >java Problem8
    >2
    >5
    >6 1 9 5 4
    >3 4 8 2 4
    80
    >3
    >3 1 1
    >6 5 4
    23
*/