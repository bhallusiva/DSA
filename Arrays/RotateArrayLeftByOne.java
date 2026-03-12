package DSA.Arrays;

import java.util.Arrays;

public class RotateArrayLeftByOne {
    int[] rotate(int arr[],int n,int k)

    {
        k=k%n;   //if k<n
        reverse(arr, 0, k-1);    //first k elements are reversed
        reverse(arr, k, n-1);           //remaining elements are reversed
        reverse(arr, 0, n-1);   //whole array is reversed
                 
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
    public static void main(String args[])
    {
        int[] arr={10,20,30,40};
        RotateArrayLeftByOne ob=new RotateArrayLeftByOne();
        System.out.println(Arrays.toString(ob.rotate(arr,arr.length,6 )));

    }
}
