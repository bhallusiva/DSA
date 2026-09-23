class Solution {

    private void sequence(int index,List<Integer> list,int[] arr,List<List<Integer>> ans)
    {
         
            ans.add(new ArrayList<>(list));
         
        for(int i = index;i<arr.length;i++)
        {
            if(i>index && arr[i]==arr[i-1])
            {
                continue;
            }
        
        list.add(arr[i]);
        sequence(i+1,list,arr,ans);
        list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        sequence(0,new ArrayList<>(),nums,ans);
        return ans;
    }
}