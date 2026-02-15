import java.util.*;
class Reverse{
    int countDigit(int num)
    {
        int count=0;
        while(num!=0)
        {
        count++;
        num=num/10;
        }
        return count;
    }
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        Reverse ob=new Reverse();
        System.out.println("Enter the number");
        num=sc.nextInt();
        System.out.println("the no of digits in "+num+" are "+ob.countDigit(num));
    }
}