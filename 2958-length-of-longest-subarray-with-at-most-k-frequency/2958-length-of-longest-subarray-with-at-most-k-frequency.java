class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
         int left = 0;
         int maxLength = 0;
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int right = 0 ;right<nums.length;right++)
         {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.getOrDefault(nums[right],0)>k)
            {
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
            
         }  
         return maxLength;
    }
}