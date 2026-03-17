package DSA.Arrays;

import java.util.Arrays;

public class RotateArrayRight {
    int[] rotate(int arr[],int n,int k)
    {
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        
        return arr;
    }

    void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String arsg[])
    {
        int[] arr={10,20,30};
        RotateArrayRight ob=new RotateArrayRight();
        System.out.println(Arrays.toString(ob.rotate(arr, arr.length,k)));
    }
}
