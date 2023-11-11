import java.io.*;
class Matrix
{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int row,column;
        System.out.println("Enter number of rows");
        row=Integer.parseInt(br.readLine());
        System.out.println("Enter number of columns");
        column=Integer.parseInt(br.readLine());        
        int matrix[][]=new int[row+1][column+1];
    }
}