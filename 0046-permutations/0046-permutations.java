class Solution {
    private void permutation(int[] arr,List<List<Integer>> ans, List<Integer> list,boolean[] freq)
    {
        if(list.size()==arr.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i<arr.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                list.add(arr[i]);
                permutation(arr,ans,list,freq);
                list.remove(list.size()-1);
                freq[i]= false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutation(nums,ans,new ArrayList<>(),freq);
        return ans;

    }
}