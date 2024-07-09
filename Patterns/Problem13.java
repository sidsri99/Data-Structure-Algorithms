/**

n = 5
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/

import java.io.*;
class Problem13{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i =1; i <= num ; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i = num-1; i >= 1 ; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem13.java

>java Problem13
>5
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

>java Problem13
>8
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/