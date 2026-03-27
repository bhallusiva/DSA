package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MedianofTwoSortedArrays {
    double median(int[] list)
    {
        int low=0;
        int high=list.length-1;
        int mid=low+(high-low)/2;
        if(list.length%2!=0)
        {
            return list[mid];
        }
        return (list[mid]+list[mid+1])/2;
        
    }
    double merge(int[] arr1,int[] arr2)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                 list.add(arr1[i]);
                 i++;
            }else{
                 list.add(arr2[j]);
                 j++;
            }
        }
        while(i<arr1.length)
        {
             list.add(arr1[i]);
             i++;
        }
        while (j<arr2.length) {
             list.add(arr2[j]);
             j++;
            
        }

        return median(list.toArray());
        
    }
    public static void main(String arsg[])
    {
        int[] arr1={1,3,4};
        int[] arr2={2};
        MedianofTwoSortedArrays ob=new MedianofTwoSortedArrays();
        System.out.println(ob.merge(arr1,arr2));
    }
}
