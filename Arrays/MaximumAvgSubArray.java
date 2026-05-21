public class MaximumAvgSubArray {
    void avgSubArray(int[] arr,int k)
    {
        double maxAvg=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k;i++)
        {
            double sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum = sum+arr[j];
            }
            double avg=sum/k;
            maxAvg=Math.max(maxAvg,avg);
        }
        System.out.println(maxAvg);
    }
    public static void main(String[] args) {
        MaximumAvgSubArray ob=new MaximumAvgSubArray();
        int[] arr={1,12,-5,-6,50,3};
        ob.avgSubArray(arr, 4);

    }
}
