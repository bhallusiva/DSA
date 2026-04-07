// package DSA.Arrays;

// public class LogestSubArrayWithSumK {
//     int computeArray(int[] arr,int k)
//     {
//         int max=0;
         
//         for(int i=0;i<arr.length;i++)
//         {
//             int sum=0;
//             for(int j=i;j<arr.length;j++)
//             {
//                 sum=sum+arr[j];
//                 if(sum==k)
//                 {
//                     max=Math.max(max, j-i+1);
//                 }
//             }
//         }
//         return max;
//     }
//     public static void main(String args[])
//     {
//         int[] arr={10,5,2,7,1,9};
//         int k=15;
//         LogestSubArrayWithSumK ob=new LogestSubArrayWithSumK();
//         System.out.println(ob.computeArray(arr, k));
        
//     }
// }

package Arrays;
 class LogestSubArrayWithSumK{
    int computeArray(int[] arr,int k)
    {
        int first=0;
        int second=0;
        int sum=0;
        int maxLength=0;
        while(second<arr.length-1)
        {
            
            if(second<arr.length)sum=sum+arr[second];
            if(sum>k)
            {
                sum=sum-arr[first];
                first++;
            }else if(sum==k)
            {
                maxLength=Math.max(maxLength, second-first+1);
                second++;
            }else{
                second++;
            }
        }
        return maxLength;

    }
    public static void main(String[] args) {
        int[] arr={10,5,2,7,1,9};
        int k=15;
        LogestSubArrayWithSumK ob=new LogestSubArrayWithSumK();
        System.out.println(ob.computeArray(arr, k));
    }
 }
