/**
	P18: Trapping Rain Water
*/
import java.io.*;
import java.util.*;
class Problem18{
	
	public int trap(int[] height) {
        int maxRight[] = new int[height.length];
        int maxLeft[] = new int[height.length];
        int rainWater = 0;

        maxLeft[0] = height[0];
        maxRight[height.length-1] = height[height.length-1];
        
        for(int i = height.length-2; i>=0;i--){
            if(maxRight[i+1] >= height[i]){
                maxRight[i] = maxRight[i+1];
            }else{
                maxRight[i] = height[i];
            }
        }
        for(int i = 1; i< height.length-1;i++){
            if(maxLeft[i-1] >= height[i] ){
                maxLeft[i] = maxLeft[i-1];
            }
            else{
                maxLeft[i] = height[i];
            }
            rainWater = rainWater + Math.min(maxLeft[i], maxRight[i]) - height[i];
        }
        return rainWater;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem18 obj=new Problem18();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int arr[]=new int[line.length];
			for(int i=0;i<line.length;i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			System.out.println(obj.trap(arr));
		}
	}
}
/*

>javac Problem18.java
>java Problem18
>2
>0 1 0 2 1 0 1 3 2 1 2 1
6
>4 2 0 3 2 5
9

*/