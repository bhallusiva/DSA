class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0; right < s.length(); right++)
        {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

            while(map.getOrDefault(s.charAt(right),0)>2)
            {
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
            
        }

        return maxLength;
    }
}