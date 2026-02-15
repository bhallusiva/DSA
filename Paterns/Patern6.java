package DSA.Paterns;
import java.util.*;
public class Patern6 {
    void patern(int n)
    {
        for(int row=0;row<n;row++)
        {
            for(int col=1;col<=n-row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        Patern6 ob=new Patern6();
        ob.patern(n);
    }
}

