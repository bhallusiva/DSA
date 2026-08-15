class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int zeroCount = 0;
         for(int num : nums)
         {
            xor = xor^num;
            if(num == 0)
            {
                zeroCount++;
            }
         }
         if(zeroCount == nums.length)
         {
            return 0;
         }
         if(xor!=0)
         {
            return nums.length;
         }
         return nums.length-1;
    }
}