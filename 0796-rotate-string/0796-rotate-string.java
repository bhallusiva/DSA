class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuffer sb = new StringBuffer(s);
        int left = 0;
        while(left<s.length()){

        char ch = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(ch);
        if(goal.contentEquals(sb))
        {
            return true;
        }
        left++;

        }
        return false;
    }
}