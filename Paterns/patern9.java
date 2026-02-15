package DSA.Paterns;

public class patern9 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int space=n-i-1;space>0;space--)
            {
                System.out.print(" ");
            }
            for(int star=0;star<2*i+1;star++)
            {
                System.out.print("*");
            }
            for(int space=n-i-1;space>0;space--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int space=0;space<i;space++)
            {
                System.out.print(" ");
            }
            for(int star=2*n-(2*i+1);star>0;star--)
            {
                System.out.print("*");
            }
            for(int space=0;space<i;space++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
