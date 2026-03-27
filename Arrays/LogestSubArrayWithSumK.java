package DSA.Arrays;

public class LogestSubArrayWithSumK {
    int computeArray(int[] arr,int k)
    {
        int max=0;
         
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==k)
                {
                    max=Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int[] arr={10,5,2,7,1,9};
        int k=15;
        LogestSubArrayWithSumK ob=new LogestSubArrayWithSumK();
        System.out.println(ob.computeArray(arr, k));
        
    }
}
