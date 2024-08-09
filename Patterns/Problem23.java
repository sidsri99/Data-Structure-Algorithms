/**

n = 5
	    1
      1 1 1
    1 1 1 1 1
  1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1


*/

import java.io.*;
class Problem23{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = num-1;
		
		for(int i = 1; i<= num; i++){
			for(int j = 1; j<= num-i ; j++){
				System.out.print("  ");
			}
			for(int j = 1; j<=2*i-1; j++){
				System.out.print(" 1");
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem23.java

>java Problem23
>5
         1
       1 1 1
     1 1 1 1 1
   1 1 1 1 1 1 1
 1 1 1 1 1 1 1 1 1

>java Problem23
>8
               1
             1 1 1
           1 1 1 1 1
         1 1 1 1 1 1 1
       1 1 1 1 1 1 1 1 1
     1 1 1 1 1 1 1 1 1 1 1
   1 1 1 1 1 1 1 1 1 1 1 1 1
 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1

*/