/**

n = 5
5 4 3 2 *
5 4 3 * 1
5 4 * 2 1
5 * 3 2 1
* 4 3 2 1

*/

import java.io.*;
class Problem31{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<= num; i++){
			for(int j = num; j>=1; j--){
				if(i == j){
					System.out.print("* ");
				}
				else{
					System.out.print(j+" ");
				}
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem31.java

>java Problem31
5
5 4 3 2 *
5 4 3 * 1
5 4 * 2 1
5 * 3 2 1
* 4 3 2 1

>java Problem31
8
8 7 6 5 4 3 2 *
8 7 6 5 4 3 * 1
8 7 6 5 4 * 2 1
8 7 6 5 * 3 2 1
8 7 6 * 4 3 2 1
8 7 * 5 4 3 2 1
8 * 6 5 4 3 2 1
* 7 6 5 4 3 2 1

*/