class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
                map.put(num,map.getOrDefault(num,0)+1);
            
        }
        PriorityQueue<Integer> q = new PriorityQueue((a,b)->
            map.get(a)-map.get(b)
            );
        for(int num : map.keySet())
        {
             if(q.size()<k)
             {
                q.offer(num);
             }else{
                if(map.get(num)>map.get(q.peek()))
                {
                    q.poll();
                    q.offer(num);

                }
             }
        }
        int[] result = new int[k];
        for(int i = 0;i<k;i++)
        {
            result[i]=q.poll();
        }
        return result;
    }
}