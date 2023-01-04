/*
    Leaders in an array:

    Given an array A of positive integers.
    Task is to find the leaders in the array.
    An element of array is leader if it is greater than or equal to all the elements to its right side.
    The rightmost element is always a leader. \
    
    Example 1:
    Input:
    n = 6
    A[] = {16,17,4,3,5,2}
    Output: 17 5 2
    
    Example 2:
    Input:
    n = 5
    A[] = {1,2,3,4,0}
    Output: 4 0
*/

import java.io.*;
import java.util.*;
class Problem1{
    ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> revlist=new ArrayList<Integer>();
        int max=arr[n-1];
        list.add(max);
        for(int i=n-2;i>=0;i--){
            int temp=arr[i];
            if(temp>=max){
                max=temp;
                list.add(max);
            }
        }
        for(int i=list.size()-1 ; i>=0 ; i--){
            revlist.add(list.get(i));
        }
        return revlist;
    }
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Problem1 obj=new Problem1();
        int t=Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n=Integer.parseInt(br.readLine().trim());
            int arr[]=new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            StringBuffer str=new StringBuffer();
            ArrayList<Integer> res=new ArrayList<Integer>();

            res=obj.leaders(arr,n);

            for(int i=0;i<res.size();i++){
                str.append(res.get(i)+" ");
            }
            System.out.println(res);
        }
    }
}

/*
    Output:
    >javac Problem1.java
    >java Problem1
    >2
    >6
    >16 17 4 3 5 2
    [17, 5, 2]
    >5
    >1 2 3 4 0
    [4, 0]
*/