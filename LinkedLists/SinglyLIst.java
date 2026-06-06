package DSA.LinkedLists;

import java.util.Scanner;

class Node{
    int val;
    Node next;
    Node head=null;
    Node createNode(int val1)
    {
        Node newNode=new Node();
        newNode.val=val1;
        newNode.next=null;
        return newNode;
    }
    void insert_at_begin(int val1)
    {
        Node newNode=createNode(val1);
        if(head==null)
        {
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        
    }
    void insert_at_last(int val1)
    {
        Node newNode=createNode(val1);
        if(head==null)
        {
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            
        }
    }

    void insert_at_pos(int pos,int val1)
    {
        Node newNode=createNode(val1);
        Node prev=head;
        if(head==null)
        {
            head=newNode;
        }else{
            Node temp=head;
            while(temp.val!=pos)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    void display()
    {

        Node temp=head;
        if(head==null)
        {
            System.out.println("there are no elements in list");
        }else{
        while(temp!=null)
        {
            System.out.print(temp.val+"=>");
            
            temp=temp.next;

        }
    }
}
}

public class SinglyLIst {
    public static void main(String[] args) {
        Node ob=new Node();
        int ch;
        do{
            System.out.println("1.insert at begin 2.display 3.insert at last 4.insert at pos");
            System.out.println("Enter the choice");
            Scanner sc=new Scanner(System.in);
            ch=sc.nextInt();
            int val;
            int pos;
            switch (ch) {
                case 1:
                        System.out.println("Enter the value to be inserted");
                        val=sc.nextInt();
                        ob.insert_at_begin(val);
                    break;
            case 2:
                    System.out.println("the values are");
                    ob.display();
                    break;
            case 3:
                System.out.println("enter the values to be inserted ");
                val=sc.nextInt();
                ob.insert_at_last(val);
                break;
            case 4:
                System.out.println("enter the values to be inserted ");
                val=sc.nextInt();
                System.out.println("Enter position");
                pos=sc.nextInt();
                ob.insert_at_pos(pos, val);
                default:
                    break;
            }
        }while(ch!=0);
    }
}
