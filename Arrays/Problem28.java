/**

	P28: Max Chunks To Make Sorted
	
	Example 1:
	Input: arr = [4,3,2,1,0]
	Output: 1
	Explanation:
	Splitting into two or more chunks will not return the required result.
	For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.

	Example 2:
	Input: arr = [1,0,2,3,4]
	Output: 4
	Explanation:
	We can split into two chunks, such as [1, 0], [2, 3, 4].
	However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.
	
*/
import java.io.*;
import java.util.*;
class Problem28{
	
	public int maxChunksToSorted(int[] arr) {
        int count  = 0, currentSum = 0 , sortedSum = 0;
        for(int i = 0; i<arr.length;i++){
            currentSum += arr[i];
            sortedSum  += i;
            if(currentSum == sortedSum)
                count++;
        }
        return count;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem28 obj = new Problem28();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int arr[] =new int[line.length];
			for(int i=0; i<line.length; i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			System.out.println(obj.maxChunksToSorted(arr));
		}
	}
}

/*

Output:
>javac Problem28.java
>java Problem28
>3
>4 3 2 1 0
1
>1 0 2 3 4
4
>2 0 1
1

*/