package DSA.Arrays;

import java.util.Arrays;

public class RotateArrayLeftByOne {
    int[] rotate(int arr[],int n)
    {
        
        int k=5;
         
        for(int j=0;j<k;j++)
        {  
            int temp=arr[0];
            for(int i=0;i<n-1;i++)
            { 
                 
                arr[i]=arr[i+1];
            }
            arr[n-1]=temp;
        }
        return arr;
    }
    public static void main(String args[])
    {
        int[] arr={10,20,30,40};
        RotateArrayLeftByOne ob=new RotateArrayLeftByOne();
        System.out.println(Arrays.toString(ob.rotate(arr,arr.length )));

    }
}
