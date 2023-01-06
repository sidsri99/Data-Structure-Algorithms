/*
    Kadane's Algorithm
    Maximum subarray with largest sum

    Examples:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    
    Example:
    Input: nums = [1]
    Output: 1
    Explanation: The subarray [1] has the largest sum 1.

    Example:
    Input: nums = [5,4,-1,7,8]
    Output: 23
    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
*/

import java.io.*;

class Problem2 {
    public int maxSubArray(int[] nums) {
        int maxhere=0, max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxhere = maxhere + nums[i];
            if(maxhere > max){
                max = maxhere;
            }
            if(maxhere < 0 )maxhere =0;
        }
        return max;
    }

    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem2 obj=new Problem2();
        System.out.println("Enter number of test cases");
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            System.out.println("Enter size of Array");
            int n=Integer.parseInt(br.readLine());
            int arr[]=new int[n];
            System.out.println("Enter array elements");
            String line[]=br.readLine().split(" ");
            for(int i=0;i< n;i++){
                arr[i]=Integer.parseInt(line[i]);
            }
            System.out.println(obj.maxSubArray(arr));
        }
    }
}

/*
Output:

>javac Problem2.java
>java Problem2
Enter number of test cases
>3
Enter size of Array
>9
Enter array elements
>-2 1 -3 4 -1 2 1 -5 4
6
Enter size of Array
>1
Enter array elements
>1
1
Enter size of Array
>5
Enter array elements
>5 4 -1 7 8
23

*/