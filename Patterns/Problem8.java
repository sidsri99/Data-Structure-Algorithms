/**

n = 5
*       *
  *   *
    *
  *   *
*       *

*/

import java.io.*;
class Problem8{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= num; j++){
				if( (i == j) || (i+j == num+1)){
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

>javac Problem8.java

>java Problem8
>5
*       *
  *   *
    *
  *   *
*       *

>java Problem8
>7
*           *
  *       *
    *   *
      *
    *   *
  *       *
*           *

*/