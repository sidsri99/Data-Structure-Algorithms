/**

n = 5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/

import java.io.*;
class Problem1{
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= num; j++){
			System.out.print("* ");
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem1.java
>java Problem1
>5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

>java Problem1
>7
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *

*/