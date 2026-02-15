package Arrays;

import java.util.Scanner;

public class Basic_arr {
    public static void main(String args[])
    {
        int n;
        java.util.Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        System.out.println("The entered Array Elements are");
        for(int i=0;i<n;i++)
        {
              System.out.println(arr[i]);
        }
        sc.close();
    }
}
