import java.util.*;
class Palindrome{
    void isPalindrome(int num)
    {
        int rev=0;
        int temp=num;
        while(num!=0)
        {
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        }
        if(temp==rev)
        {
            System.out.println(temp+" Is Palindrome number");
        }else{
            System.out.println(temp+" is not Palindrome number");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        Palindrome ob=new Palindrome();
        ob.isPalindrome(num);
        sc.close();
    }
}