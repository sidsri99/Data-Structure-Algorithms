/**

n = 5
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

*/

import java.io.*;
class Problem27{
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

>javac Problem27.java

>java Problem27
>5
         1
       1 2 1
     1 2 3 2 1
   1 2 3 4 3 2 1
 1 2 3 4 5 4 3 2 1

>java Problem27
>8
               1
             1 2 1
           1 2 3 2 1
         1 2 3 4 3 2 1
       1 2 3 4 5 4 3 2 1
     1 2 3 4 5 6 5 4 3 2 1
   1 2 3 4 5 6 7 6 5 4 3 2 1
 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1

*/