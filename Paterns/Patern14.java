package DSA.Paterns;

public class Patern14 {
    public static void main(String args[])
    {
        int n=5;
        for(int row=0;row<n;row++)
        {
            for(char ch='A';ch<'A'+row;ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}


/*
A
AB
ABC
ABCD


 */