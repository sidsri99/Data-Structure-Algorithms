/**

n = 5
           1
         2 3 4
       5 6 7 8 9
   10 11 12 13 14 15 16
17 18 19 20 21 22 23 24 25

*/

import java.io.*;
class Problem25{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = num-1, count = 1;
		
		for(int i = 1; i<= num; i++){
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

>javac Problem25.java

>java Problem25
>5
         1
       2 3 4
     5 6 7 8 9
   10 11 12 13 14 15 16
 17 18 19 20 21 22 23 24 25

>java Problem25
>8
               1
             2 3 4
           5 6 7 8 9
         10 11 12 13 14 15 16
       17 18 19 20 21 22 23 24 25
     26 27 28 29 30 31 32 33 34 35 36
   37 38 39 40 41 42 43 44 45 46 47 48 49
 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64

*/