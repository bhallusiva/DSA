package Arrays;
import java.util.*;
public class Copy_arr {
    int[] replica(int[] arr)
    {
        int[] copy=arr;
        return copy;
    }
    public static void main(String args[])
    {
        int[] arr={20,30,40};
        Copy_arr ob=new Copy_arr();
        System.out.println(Arrays.toString(ob.replica(arr)));
    }
}
