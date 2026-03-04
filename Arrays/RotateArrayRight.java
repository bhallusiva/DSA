package DSA.Arrays;

import java.util.Arrays;

public class RotateArrayRight {
    int[] rotate(int arr[],int n)
    {
       int last=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        return arr;
    }
    public static void main(String arsg[])
    {
        int[] arr={10,20,30};
        RotateArrayRight ob=new RotateArrayRight();
        System.out.println(Arrays.toString(ob.rotate(arr, arr.length)));
    }
}
