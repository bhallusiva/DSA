import java.util.*;
class LargestOfThreeNumbers{
    void large(int num1,int num2,int num3)            
    //   50,30,40
    {
        if(num1>num2)
        {
            if(num1>num3){
            System.out.println(num1+" is Great");
            }
            else{
                System.out.println(num3+" is Great");
            }
        }
        else if(num2>num3)
        {
            System.out.println(num2+" is Great");
        }else{
            System.out.println(num3+" is Great");
        }
    }
    public static void main(String args[])
    {
        int num1,num2,num3;
        LargestOfThreeNumbers ob=new LargestOfThreeNumbers();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        ob.large(num1,num2,num3);
    }
}