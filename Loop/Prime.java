import java.util.Scanner;

public class Prime {
    boolean IsPrime(int num)
    {
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0){
                return false;
            } 
        }
        return true;
         
    }
    public static void main(String args[])
    {
        java.util.Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Prime ob=new Prime();
        for(int i=0;i<num;i++)
        {
            if(ob.IsPrime(i))
            {
                System.out.println(i+" ");
            }
        }
    }
}

