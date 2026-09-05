class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] suffixMin = new int[nums.length];
        suffixMin[nums.length-1] = nums[nums.length - 1]; // there is no longer we can find smaller value
        //we are finding at every is there any smaller element far away
        for(int i = nums.length-2;i>=0;i--)
        {
            suffixMin[i] = Math.min(suffixMin[i+1],nums[i]);
        }
        int max = Integer.MIN_VALUE;
        int stable = -1;
        for(int i = 0; i<nums.length;i++)
        {
             max = Math.max(max,nums[i]);
            int instabilityScore = max - suffixMin[i];
            if(instabilityScore <= k)
            {
                stable = i;
                break;
            }
        }
        return stable;
    }
}