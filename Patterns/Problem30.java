/**

n = 5
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1

*/

import java.io.*;
class Problem30{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<= num; i++){
			for(int j = num; j>=1; j--){
			System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}
}


/**

s>javac Problem30.java

>java Problem30
>5
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1

>java Problem30
>8
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2 1

*/