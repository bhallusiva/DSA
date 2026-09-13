class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int large = nums[0];
        int small = nums[0];
         for(int num: nums)
         {
            set.add(num);
             if(num>=large)
             {
                large = num;
             }
             if(num<=small)
             {
                small = num;
             }
         }
         for(int i = small;i<=large;i++)
         {
            if(!set.contains(i))
            {
                list.add(i);
            }
         }
         return list;
    }
}