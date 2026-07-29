class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS = new HashMap<>();
        
        if(s.length() != t.length())
        {
            return false;
        }

        for(int i = 0; i < s.length(); i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!mapST.containsKey(c1) && !mapTS.containsKey(c2))
            {
                mapST.put(c1,c2);
                mapTS.put(c2,c1);

            }else{
                if(mapST.getOrDefault(c1,'#')!=c2 || mapTS.getOrDefault(c2,'#')!=c1)
                {
                    return false;
                }
            }
        }


        return true;


    }
}