class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int first = 0;
        int second = 0;
        int count = 0;
        while(first<g.length&&second<s.length)
        {
            if(s[second]>=g[first])
            {
                count++;
                first++;
                second++;
            }else{
                second++;
            }
        }
        return count;
    }
}