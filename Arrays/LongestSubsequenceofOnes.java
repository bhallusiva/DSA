package DSA.Arrays;

import java.util.Arrays;

class LongestSubsequenceofOnes{
    int max(int num1,int num2)
    {
        if(num1>num2)
        {
            return num1;
        }
        return num2;
    }
    int longest(int[] arr)
    {
        int count=0;
        int max1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
                max1=max(max1, count);
            }else{
                count=0;
            }
           
        
        }
        return max1;
    }
    public static void main(String args[])
    {
        int arr[]={1,1,0,1,1,1};
        LongestSubsequenceofOnes ob=new LongestSubsequenceofOnes();
        System.out.println(ob.longest(arr));

    }
}