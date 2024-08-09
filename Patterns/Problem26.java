/**

n = 5
        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9


*/

import java.io.*;
class Problem26{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = num-1;
		
		for(int i = 1; i<= num; i++){
			int count = 1;
			for(int j = 1; j<= num-i ; j++){
				System.out.print("  ");
			}
			for(int j = 1; j<=2*i-1; j++){
				System.out.print(" "+count++);
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem26.java

>java Problem26
>5
         1
       1 2 3
     1 2 3 4 5
   1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8 9

>java Problem26
>8
               1
             1 2 3
           1 2 3 4 5
         1 2 3 4 5 6 7
       1 2 3 4 5 6 7 8 9
     1 2 3 4 5 6 7 8 9 10 11
   1 2 3 4 5 6 7 8 9 10 11 12 13
 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

*/