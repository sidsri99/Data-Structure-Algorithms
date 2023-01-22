import java.io.*;
import java.util.*;
class Tree{
    public class Node{
        Node left;
        int value;
        Node right;
        Node(){
            left = null;
            value = 0;
            right = null;
        }
        Node(int value){
            left = null;
            this.value = value;
            right = null;
        }
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Node head = new Node();
    }
}