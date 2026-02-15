import java.util.*;
class Count{
    void reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            
        }
        System.out.println("reverse value would be "+rev);
    }

    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        Count ob=new Count();
        ob.reverse(num);
    }
}