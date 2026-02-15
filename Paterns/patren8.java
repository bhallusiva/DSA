package DSA.Paterns;
public class patren8 {
    void patern_valid(int n)
    {
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
    public static void main(String args[])
    {
        int n=5;
        patren8 ob=new patren8();
        ob.patern_valid(n);

    }
}
