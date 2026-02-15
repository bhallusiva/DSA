import java.util.*;
class LeapYear{
    boolean IsLeap(int year)
    {
        if((year%4==0&&year%100!=100)||(year%400==0))
        {
             return true;
        }else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        LeapYear ob=new LeapYear();
        int year=sc.nextInt();
        if(ob.IsLeap(year))
        {
            System.out.println(year+"Leap Year");
        }else{
            System.out.println(year+"Not a leap Year");
        }
    }
}