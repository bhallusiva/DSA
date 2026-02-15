package Arrays;
import java.util.*;
public class Reverse_arr {
    int[] reverse(int[] arr,int n)
    {
        int first=0;
        int last=n-1;
        while(first<last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        return arr;
    }
    public static void main(String args[])
    {
        int[] arr={10,20,30};
        Reverse_arr ob=new Reverse_arr();
        System.out.print(Arrays.toString(ob.reverse(arr,arr.length)));
    }
}
