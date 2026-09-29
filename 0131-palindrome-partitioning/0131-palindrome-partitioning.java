class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();

        solve(0,s,path,res);
        return res;
    }
    void solve(int index,String s,List<String> path,List<List<String>> res)
    {
        if(index == s.length())
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index;i<s.length();i++)
        {
            if(isPossible(index,i,s))
            {
                path.add(s.substring(index,i+1));
                solve(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    boolean isPossible(int start, int last, String s)
    {
        while(start<last)
        {
            if(s.charAt(start)!=s.charAt(last))
            {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}