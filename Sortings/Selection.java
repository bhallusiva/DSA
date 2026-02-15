package DSA.Sortings;

import java.util.Scanner;

public class Selection {
    void selection_sort(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            int min_val=i;
            for(int j=i+1;j<n;j++)
            {
                count++;
                if(arr[j]<arr[min_val])
                {
                    min_val=j;
                }
                

            }
            if(i!=min_val)
                {
                    int temp=arr[i];
                    arr[i]=arr[min_val];
                    arr[min_val]=temp;
                }
            
        }
        System.out.println("count: "+count);
    }
    public static void main(String args[])
    {
        Selection ob=new Selection();
        int n=5;
        int[ ] a={10,20,1,4,7};
        
        ob.selection_sort(a, n);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
