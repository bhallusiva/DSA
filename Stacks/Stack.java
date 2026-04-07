package DSA.Arrays.Stacks;

import java.util.Scanner;

class Stack{
    int top=-1;
    int[] stack=new int[20];
    void push(int val)
    {
        if(top==stack.length-1)
        {
            System.out.println("OverFlow");
        }else{
            stack[++top]=val;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.print("Underflow");
        }else{
            System.out.print("pop Element"+stack[top--]);
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("Underflow");
        }else{
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[top]);
            }
        }
    }
    public static void main(String args[])
    {
        int choice;
        Stack ob=new Stack();
        int n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter Choice");
            System.out.println("1.push\n2.pop\n3.Display");
            choice=sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("enter value to be push1");
                    n=sc.nextInt();
                    ob.push(n);
                    break;

            case 2:ob.pop();
                    break;
            case 3: ob.display();
                    break;
            default: System.out.println("Invalid option");
                        break;

        }
        
    }while(choice<=2);
sc.close();
    }

}