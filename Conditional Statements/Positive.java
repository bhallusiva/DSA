import java.util.*;
class Positive{
    void isPositive(int val)
    {
        if (val==0){
            System.out.println("Zero");
        }
        else if(val>0)
        {
            System.out.println("Possitive");
        }else{
            System.out.println("Negetive");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int val;
        System.out.println("Enter a value");
        val=sc.nextInt();
        Positive ob=new Positive();
        ob.isPositive(val);

    }
}