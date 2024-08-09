/**

n = 5
        1
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5

*/

import java.io.*;
class Problem24{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = num-1;
		
		for(int i = 1; i<= num; i++){
			for(int j = 1; j<= num-i ; j++){
				System.out.print("  ");
			}
			for(int j = 1; j<=2*i-1; j++){
				System.out.print(" "+i);
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem24.java

>java Problem24
>5
         1
       2 2 2
     3 3 3 3 3
   4 4 4 4 4 4 4
 5 5 5 5 5 5 5 5 5

>java Problem24
>8
               1
             2 2 2
           3 3 3 3 3
         4 4 4 4 4 4 4
       5 5 5 5 5 5 5 5 5
     6 6 6 6 6 6 6 6 6 6 6
   7 7 7 7 7 7 7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8

*/