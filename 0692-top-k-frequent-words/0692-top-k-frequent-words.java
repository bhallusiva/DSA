class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        } 
        PriorityQueue<String> q = new PriorityQueue<>((a,b)->{
        if (!map.get(a).equals(map.get(b))) {
            return Integer.compare(map.get(a), map.get(b));
        }
        return b.compareTo(a);
});
    
        for(String word:map.keySet())
        {
            if(q.size()<k)
            {
                q.offer(word);
            }else{
                String top = q.peek();
                if((map.get(word)>map.get(top)||map.get(word).equals(map.get(top)) && word.compareTo(top)<0))
                {
                    q.poll();
                    q.offer(word);
                }
            }
        }
        List<String> result = new ArrayList<>();
         while (!q.isEmpty()) {
            result.add(q.poll());
        }
         Collections.reverse(result);
         return result;
    }
}