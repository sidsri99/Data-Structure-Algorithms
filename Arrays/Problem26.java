/**

	P26: Final Array State After K Multiplication Operations I
	
	Example 1:
	Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
	Output: [8,4,6,5,6]
	Explanation:
	Operation			Result
	After operation 1	[2, 2, 3, 5, 6]
	After operation 2	[4, 2, 3, 5, 6]
	After operation 3	[4, 4, 3, 5, 6]
	After operation 4	[4, 4, 6, 5, 6]
	After operation 5	[8, 4, 6, 5, 6]

	Example 2:
	Input: nums = [1,2], k = 3, multiplier = 4
	Output: [16,8]
	Explanation:
	Operation			Result
	After operation 1	[4, 2]
	After operation 2	[4, 8]
	After operation 3	[16, 8]
	
*/
import java.io.*;
import java.util.*;
class Problem26{
	public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
            (a,b)->(
                ( 0 == Integer.compare(a[0],b[0]) ?
                    Integer.compare(a[1],b[1]) : Integer.compare(a[0],b[0])
                )
            )
        );
        for(int i = 0; i <nums.length; i++ ){
            int ar[]=new int[2];
            ar[0] = nums[i];
            ar[1] = i;
            pq.offer(ar);
        }
        for(int i = 1; i <= k ; i++){
            int ar[]=pq.poll();
            ar[0]= ar[0]*multiplier;
            nums[ar[1]]= ar[0];
            pq.offer(ar);
        }
        return nums;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem26 obj = new Problem26();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int nums[] =new int[line.length];
			int ans[] =new int[line.length];
			for(int i=0; i<line.length; i++){
				nums[i] = Integer.parseInt(line[i]);
			}
			int k = Integer.parseInt(br.readLine());
			int multiplier = Integer.parseInt(br.readLine());
			ans = obj.getFinalState(nums,k,multiplier);
			for(int i=0; i<line.length; i++){
				System.out.print(ans[i]+" ");
			}
			System.out.println("");
		}
	}
}

/*

Output:

>javac Problem26.java
>java Problem26
>2
>2 1 3 5 6
>5
>2
8 4 6 5 6
>1 2
>3
>4
16 8

*/