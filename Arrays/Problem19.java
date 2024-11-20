/**
	P19: Median of two sorted array
	
	Example 1:
	Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.
	
	Example 2:
	Input: nums1 = [1,2], nums2 = [3,4]
	Output: 2.50000
	Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

*/

import java.io.*;
import java.util.*;

class Problem19{
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int size1 = nums1.length;
     int size2 = nums2.length;
     int count = 0, i=0,j=0,num=0,ind1 = (size1+size2-1) >> 1, ind2 = -1;
     if((size1+size2)%2 == 0)ind2 = ind1+1;

     while(i<size1 && j<size2 && (count<=ind1|| count <=ind2)){
        if(nums1[i]<nums2[j]){
            if(count == ind1 || count == ind2){
                num += nums1[i];
            }
            i++;
        }else{
            if(count == ind1 || count == ind2){
                num += nums2[j];
            }
            j++;
        }
        count++;
     }
     while(i<size1 && (count<=ind1|| count <=ind2)){
        if(count == ind1 || count == ind2){
            num += nums1[i];
        }
        i++;
        count++;
     }
     while(j<size2 && (count<=ind1|| count <=ind2)){
        if(count == ind1 || count == ind2){
            num += nums2[j];
        }
        j++;
        count++;
     }
     if(ind2 == -1)
        return num;
     return num/2.0;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem19 obj = new Problem19();
		
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			 String line1[] = br.readLine().split(" ");
			 int nums1[] = new int[line1.length];
			 for(int i = 0; i<line1.length; i++)
				 nums1[i] = Integer.parseInt(line1[i]);
			 
			 String line2[] = br.readLine().split(" ");
			 int nums2[] = new int[line2.length];
			 for(int i = 0; i<line2.length; i++)
				 nums2[i] = Integer.parseInt(line2[i]);
			 
			 System.out.println(obj.findMedianSortedArrays(nums1,nums2));
		}
	}
}

/*

>javac Problem19.java
>java Problem19
>3
>1 3
>2
2.0
>1 2
>3 4
2.5
>
>1 2 3 4 5 6
3.5

*/