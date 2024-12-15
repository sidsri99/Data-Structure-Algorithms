/**

	P25: Maximum Average Pass Ratio

	Example 1:
	Input: classes = [[1,2],[3,5],[2,2]], extraStudents = 2
	Output: 0.78333
	Explanation: You can assign the two extra students to the first class. The average pass ratio will be equal to (3/4 + 3/5 + 2/2) / 3 = 0.78333.

	Example 2:
	Input: classes = [[2,4],[3,9],[4,5],[2,10]], extraStudents = 4
	Output: 0.53485
	
*/
import java.io.*;
import java.util.*;
class Problem25{

	public double getDiff(int[] num){
        double current = 1.0*num[0]/num[1];
        double newRatio = (num[0]+1.0)/(num[1]+1.0);
        return (newRatio - current);
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double avgRatio = 0.0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Double.compare(getDiff(b),getDiff(a))
        );
        for(int eachClass[] :classes){
            pq.offer(eachClass);
        }
        for(int i=1; i<=extraStudents; i++){
            int eachClass[] = pq.poll();
            eachClass[0]++;
            eachClass[1]++;
            pq.offer(eachClass);
        }
        for(int eachClass[]: classes){
            avgRatio += (1.0*eachClass[0]/eachClass[1]);
        }

        return avgRatio/classes.length;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem25 obj = new Problem25();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			int count= Integer.parseInt(br.readLine());
			int classes[][] =new int[count][2];
			for(int i=0; i<count; i++){
				String line[] = br.readLine().split(" ");
				classes[i][0] = Integer.parseInt(line[0]);
				classes[i][1] = Integer.parseInt(line[1]);
			}
			
			int extraStudents = Integer.parseInt(br.readLine());
			System.out.println(obj.maxAverageRatio(classes,extraStudents));
		}
	}
}

/*

Output:

>javac Problem25.java
>java Problem25
>2
>3
>1 2
>3 5
>2 2
>2
0.7833333333333333
>4
>2 4
>3 9
>4 5
>2 10
>4
0.5348484848484849

*/