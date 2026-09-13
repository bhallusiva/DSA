class Solution {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        int first = s.length()-1;
        int second = s.length()-1;
        while(first>=0)
        {
            while(first >= 0 && s.charAt(first)==' ')
            {
                first--;
            }
            second = first;
            if(first<0)
            {
                break;
            }
            while(first >=0 && s.charAt(first)!=' ')
            {
                first--;
            }
            sb.append(s.substring(first+1,second+1));
            sb.append(" ");
        }
        if(sb.length()>0)
        {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}