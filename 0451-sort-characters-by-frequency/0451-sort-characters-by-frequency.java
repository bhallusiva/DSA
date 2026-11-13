class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //t -> 1 , r->1 , e -> 2
        PriorityQueue<Character> q = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(char ch : map.keySet())
        {
            q.offer(ch);
        }
        StringBuffer sb = new StringBuffer();
        while(!q.isEmpty())
        {
            char ch = q.poll();
            for(int i = 0;i<map.get(ch);i++)
            {
                sb.append(ch);
            }
        }
        return sb.reverse().toString();

    }
}