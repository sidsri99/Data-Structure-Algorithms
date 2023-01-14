import java.io.*;
class Node{
    int data;
    Node next;
}
class LinkedList{
    void create(int value){
        Node obj=new Node();
        obj.data=value;
        obj.next=null;
    }
    void diplay(Node head){
        while(head != null){
            System.out.print(head.data+"  ");
            head=head.next;
        }
        System.out.println("");
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Enter you choice-\n
            1.Add element to list\n
            2.Delete element from list\n\
            3.Find element in list\n
            4.Display list\n
            5.Exit");
            int value = Integer.parseInt(br.readLine());
            switch(value){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: System.exit(0);
                default: System.out.println("Enter number between 1-5");
            }
        }
    }
}