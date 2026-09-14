class Solution {
    private void find(int index,List<Integer> list,int[] arr,int target,List<List<Integer>> ans)
    {
        if(index == arr.length)
        {
            if(target == 0)
            {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[index]<=target)
        {
            list.add(arr[index]);
            find(index,list,arr,target-arr[index],ans);
            list.remove(list.size()-1);

        }
        find(index+1,list,arr,target,ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        find(0,new ArrayList<>(),candidates,target,ans);
        return ans;
    }
}