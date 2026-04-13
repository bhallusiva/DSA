class MaxSubArray{
    int subArray(int[] arr)
    {
        int Max1=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            Max1=Math.max(Max1,sum);

            
            if(sum<0)
            {
                sum=0;
            }
                
            
        return Max1;
    }
    public static void main(String[] args) {
        int[] arr={5,4,-1,7,8};
        MaxSubArray ob=new MaxSubArray();
        System.out.print(ob.subArray(arr));
    }
}