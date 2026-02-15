package DSA.Paterns;

public class patern11 {
    public static void main(String args[])
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int space=n-i;space>0;space--)
            {
                System.out.print(" ");
            }
            for(int star=i;star>0;star--)
            {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
