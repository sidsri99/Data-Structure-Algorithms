/*

    Array Pivot point
    Sum of element to the left strictly equal to sum of elements towards right

    Example:
    Input: nums = [1,7,3,6,5,6]
    Output: 3

    Example:
    Input: nums = [1,2,3]
    Output: -1

    Example:
    Input: nums = [2,1,-1]
    Output: 0

*/

import java.io.*;
class Problem3{
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for(int i=1;i<nums.length;i++){
            rightSum += nums[i]; 
        }
        for(int i=0;i<nums.length;i++){
            if(i != 0){
                leftSum += nums[i-1];
                rightSum -= nums[i];
            }
            if(leftSum == rightSum)
                return i;
        }
        return -1;
    }

    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem3 obj=new Problem3();
        System.out.println("Enter Size of Array: ");
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        String line[]=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(line[i]);
        }
        System.out.println(obj.pivotIndex(arr));
    }
}

/*
    Output:

    >javac Problem3.java

    >java Problem3
    Enter Size of Array:
    >6
    Enter array elements:
    >1 7 3 6 5 6
    3

    >java Problem3
    Enter Size of Array:
    >3
    Enter array elements:
    >1 2 3
    -1

    >java Problem3
    Enter Size of Array:
    >3
    Enter array elements:
    >2 1 -1
    0
*/