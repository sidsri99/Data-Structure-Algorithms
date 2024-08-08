/**

n = 7
* * * * * * *
* * *   * * *
* *       * *
*           *
* *       * *
* * *   * * *
* * * * * * *

*/

import java.io.*;
class Problem19{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = -1, star = num/2+1;
		
		for(int i = 1; i<= num; i++){
			if(i == 1 || i == num){
				System.out.print("* ");
				star--;
			}
			for(int j = 1; j<=star; j++){
				System.out.print("* ");
			}
			for(int j = 1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j = 1; j<=star; j++){
				System.out.print("* ");
			}
			if(i == 1 || i == num){
				star++;
			}
			if(i<=num/2){
				space+=2;
				star-=1;
			}else if(i>num/2){
				space-=2;
				star+=1;
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem19.java

>java Problem19
>7
* * * * * * *
* * *   * * *
* *       * *
*           *
* *       * *
* * *   * * *
* * * * * * *

>java Problem19
>9
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *

*/