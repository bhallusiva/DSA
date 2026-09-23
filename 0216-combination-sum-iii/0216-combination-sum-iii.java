class Solution {
    void sequence(int index,int k,int target,List<Integer> list,List<List<Integer>> ans)
    {
        if(k == 0)
        {
            if(target == 0)
            {
                ans.add(new ArrayList<>(list));
                
            }
            return;
        }
        for(int i = index;i<=9;i++)
        {
            if(i>target)
            {
                break;
            }
            list.add(i);
            sequence(i+1,k-1,target-i,list,ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        sequence(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
}