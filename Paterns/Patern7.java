package DSA.Paterns;

public class Patern7 {
    void patern(int row)

    {
        for(int itr=0;itr<row;itr++)
        {
            //spaces
            for(int spaces=row-itr-1;spaces>=0;spaces--)
            {
                System.out.print(" ");
            }



            //stars
            for(int stars=0;stars<2*itr+1;stars++)
            {
                System.out.print("*");
            }


            //spaces
             for(int spaces=row-itr-1;spaces>=0;spaces--)
            {
                System.out.print(" ");
            }
            System.out.println();
        
        }
    }
    public static void main(String[] args) {
        Patern7 ob=new Patern7();
        ob.patern(5);
    }
}
