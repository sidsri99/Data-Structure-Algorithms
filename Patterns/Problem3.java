/**

n = 5
* * * * *
* * * *
* * *
* *
*

*/

import java.io.*;
class Problem3{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= num-i+1; j++){
			System.out.print("* ");
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem3.java

>java Problem3
5
* * * * *
* * * *
* * *
* *
*

>java Problem3
7
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/