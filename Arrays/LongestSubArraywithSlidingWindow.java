public class LongestSubArraywithSlidingWindow {
    void compute(int[] arr,int k)
    {
        int sum=0;
        int start=0;
        int maxL=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            while(sum>k)
            {
                sum=sum-arr[start];
                start++;
            }
            if(sum==k)
            {
                maxL=Math.max(maxL,i-start+1);
                
            }
        }
        System.out.println(maxL);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,10,10};
        LongestSubArraywithSlidingWindow ob=new LongestSubArraywithSlidingWindow();
        ob.compute(arr,20);
    }
}
