package DSA.Paterns;

public class patarn13 {
    public static void main(String args[])
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int num=1;num<=i;num++)
            {
                System.out.print(num);
            }
            for(int space=2*(n-i);space>0;space--)
            {
                System.out.print(" ");
            }
            for(int num=i;num>0;num--)
            {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
