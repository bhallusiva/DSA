class Solution {
    private void sequence(int i,List<Integer> list,List<List<Integer>> ans,int[] nums)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]); // take 
        sequence(i+1,list,ans,nums);
        list.remove(list.size()-1);
        sequence(i+1,list,ans,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        sequence(0,new ArrayList<>(),ans,nums);
        return ans;

    }
}