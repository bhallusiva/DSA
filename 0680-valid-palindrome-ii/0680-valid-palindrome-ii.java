class Solution {
    public boolean validPalindrome(String s) {
        int first = 0;
        int last = s.length()-1;
        int count = 0;
        while(first<=last)
        {
            if(s.charAt(first)!=s.charAt(last))
            {
                return isPalindrome(s,first+1,last)||isPalindrome(s,first,last-1);
            }
            first++;
            last--;
             
        }
        return true;
         
    }
    private boolean isPalindrome(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}