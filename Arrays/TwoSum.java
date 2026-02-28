 package Arrays;
import java.util.*;
// public class TwoSum {
//     int[] array_return(int arr[],int target)
//     {
//         int n=arr.length;
    
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 if(arr[i]+arr[j]==target)
//                 {
//                     return new int[] {i,j}; 
//                 }
//             }
//         }
//         return new int[]{-1,-1};
        
//     }
// public static void main(String args[])
// {
//     TwoSum ob=new TwoSum();
//     int arr[]={10,20,30};
//     int target=40;
//     System.out.println(Arrays.toString(ob.array_return(arr,target)));
// }    
// }


// Optimized Version


class TwoSum{
    int[] twosummm(int arr[],int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int need=target-arr[i];
            if(map.containsKey(need))
            {
                return new int[] {map.get(need),i};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[])
    {
        int arr[]={3,2,3};
        TwoSum ob=new TwoSum();
        System.out.println(Arrays.toString(ob.twosummm(arr,6)));
    }
}
