import java.util.*;
class Factorial{
    int factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        Factorial ob=new Factorial();
        int num=sc.nextInt();
        System.out.println("factorial of a given number is"+ob.factorial(num));
        

    }
}