/**

n = 5
* * * * *
* 		*
* 		*
* 		*
* * * * *

*/

import java.io.*;
class Problem7{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= num; j++){
				if(i == 1 || j == 1 || i == num || j == num){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem7.java

>java Problem7
5
* * * * *
*       *
*       *
*       *
* * * * *

>java Problem7
7
* * * * * * *
*           *
*           *
*           *
*           *
*           *
* * * * * * *

*/