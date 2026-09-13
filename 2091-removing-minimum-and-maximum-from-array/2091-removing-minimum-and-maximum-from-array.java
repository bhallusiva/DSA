class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = 0;
        int max_index = 0;
        for(int k = 0;k<nums.length;k++)
        {
             if(nums[k]<min)
             {
                min = nums[k];
                min_index = k;
             }
             if(nums[k]>max)
             {
                max = nums[k];
                max_index = k;
             }
        }
             int i = Math.min(max_index,min_index);
             int j  = Math.max(max_index,min_index);

             int front = j+1;
             int back = nums.length - i;
             int both = (i+1)+(nums.length-j);
            return Math.min(front,Math.min(back,both));

        
        
    }
}