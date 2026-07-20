class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase();
         int first = 0;
         int last = s.length()-1;
         while(first<last)
         {
            if(!Character.isLetterOrDigit(s.charAt(first)))
            {
                first++;
            }else if(!Character.isLetterOrDigit(s.charAt(last)))
            {
                last--;
            }else{
                if(s.charAt(first)!=s.charAt(last))
                {
                    return false;
                }
                first++;
                last--;
            }
         }
         return true;
    }
}