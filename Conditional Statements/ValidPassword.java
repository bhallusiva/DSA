import java.util.*;
class ValidPassword{
    void IsValid(String pwd)
    {
        if(pwd.length()<8)
        {
            System.out.println("Not a valid Password");
        }else{
            System.out.println("Valid Password");
        }
    }
    public static void main(String args[])
    {
        String pwd;
        ValidPassword ob=new ValidPassword();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Password:");
        pwd=sc.nextLine();
        ob.IsValid(pwd);


    }
}