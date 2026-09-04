class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int stable = -1;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max = nums[i];
            int min = min_value(i,nums);
            int instabilityScore = max - min;
            if(instabilityScore <= k)
            {
                stable = i;
                break;
            }
        }
        return stable;

    }
    private int min_value(int start,int[] nums)
    {
        int min = Integer.MAX_VALUE;
        for(int i = start;i<nums.length;i++)
        {
            if(nums[i]<min)
                min = nums[i];
        }
        return min;
    }
}