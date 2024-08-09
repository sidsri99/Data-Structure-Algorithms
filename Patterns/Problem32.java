/**

n = 5
1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
5 * 5 * 5 * 5 * 5
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1

*/

import java.io.*;
class Problem32{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int star = 0, count = 1;
		for(int i = 1; i< 2*num; i++){
			for(int j = 1; j <= count; j++){
				if(j%2 == 0){
					System.out.print("* ");
				}
				else{
					System.out.print((star+1)+" ");
				}
			}
			if(i < num){
				star++;
				count += 2;
			}else{
				star--;
				count -= 2;
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem32.java

>java Problem32
>5
1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
5 * 5 * 5 * 5 * 5
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1

>java Problem32
>8
1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
5 * 5 * 5 * 5 * 5
6 * 6 * 6 * 6 * 6 * 6
7 * 7 * 7 * 7 * 7 * 7 * 7
8 * 8 * 8 * 8 * 8 * 8 * 8 * 8
7 * 7 * 7 * 7 * 7 * 7 * 7
6 * 6 * 6 * 6 * 6 * 6
5 * 5 * 5 * 5 * 5
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1

*/