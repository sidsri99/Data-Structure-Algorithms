/**

n = 5
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5

*/

import java.io.*;
class Problem28{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = num-1;
		
		for(int i = 1; i<= num; i++){
			int count = i;
			for(int j = 1; j<= num-i ; j++){
				System.out.print("  ");
			}
			for(int j = 1; j<=2*i-1; j++){
				System.out.print(" "+count);
				if(j<i)
					count++;
				else 
					count--;
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem28.java

>java Problem28
>5
         1
       2 3 2
     3 4 5 4 3
   4 5 6 7 6 5 4
 5 6 7 8 9 8 7 6 5

>java Problem28
>8
               1
             2 3 2
           3 4 5 4 3
         4 5 6 7 6 5 4
       5 6 7 8 9 8 7 6 5
     6 7 8 9 10 11 10 9 8 7 6
   7 8 9 10 11 12 13 12 11 10 9 8 7
 8 9 10 11 12 13 14 15 14 13 12 11 10 9 8

*/