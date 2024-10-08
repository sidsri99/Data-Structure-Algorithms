/**
	P4: Geeks Training
	Example:
	Input: n=3 and arr[]= [[1,2,5],[3,1,1],[3,3,3]]
	Output:11
	
	
	
*/
import java.util.*;
import java.io.*;
class Problem4{
	
	public int maximumPoints(int arr[][], int N) {
        // code here
        int dp[][]=new int[N][arr[0].length+1];
        for(int i = 0; i < N ; i++){
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = Math.max(arr[0][1],arr[0][2]);
        dp[0][1] = Math.max(arr[0][0],arr[0][2]);
        dp[0][2] = Math.max(arr[0][0],arr[0][1]);
        dp[0][3] = Math.max(dp[0][0], dp[0][2]);
        for(int days = 1; days< N; days++){
            for(int last = 0; last< arr[0].length+1; last++){
                dp[days][last] = 0;
                for(int task = 0; task < arr[0].length; task++){
                    if(last !=task)
                        dp[days][last] = Math.max(arr[days][task]+dp[days-1][task],dp[days][last]);
                }
            }
        }
        
        return dp[N-1][arr[0].length];
    }
	
	public static void main(String args[])throws Exception{
		Problem4 obj = new Problem4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			int no = Integer.parseInt(br.readLine());
			int arr[][]= new int[no][3];
			for(int a = 0; a<no; a++){
				String line[] = br.readLine().split(" ");
				for(int i=0; i<line.length; i++){
					arr[a][i] = Integer.parseInt(line[i]);
				}
			}
			System.out.println(obj.maximumPoints(arr,no));
		}
	}
}

/*

>javac Problem4.java

>java Problem4
>1
>3
>1 2 5
>3 1 1
>3 3 3
11

*/