import java.util.*;
class LargestOfTwoNumbers{
    void large(int val1,int val2)
    {
        if(val1>val2)
        {
            System.out.println(val1+"is greate Numebr");
        }else{
            System.out.println(val2+"is greater Number");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int val1,val2;
        System.out.println("Enter value 1 :");
        val1=sc.nextInt();
        System.out.println("Enter Value 2:");
        val2=sc.nextInt();
        LargestOfTwoNumbers ob=new LargestOfTwoNumbers();
        ob.large(val1,val2);

    }
}