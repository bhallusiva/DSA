import java.util.*;
class Even{
    void isEven(int ele)
    {
        if(ele==0)
        {
            System.out.println("Zero");
        }
        else if(ele%2==0)
        {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[])
    {
        int val;
        Scanner sc=new Scanner(System.in);
        Even ob=new Even();
        System.out.println("Enter the value to ");
        val=sc.nextInt();
        ob.isEven(val);
        
    }
}