class Solution {

     private void find(int index,List<Integer> list,int[] arr,int target,List<List<Integer>> ans)
    {
        
            if(target == 0)
            {
                ans.add(new ArrayList<>(list));
                return;
            }
            
        for(int i = index;i<arr.length;i++)
        {
            if(i>index && arr[i]==arr[i-1]){

                continue;
            }
            if(arr[i]>target)
            {
                break;
            }

            list.add(arr[i]);
            find(i+1,list,arr,target-arr[i],ans);
            list.remove(list.size()-1);
            

        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(candidates);
        find(0,new ArrayList<>(),candidates,target,ans);
        return ans;
    }
}