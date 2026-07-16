class Solution {
    private boolean canPosition(int dist,int[] pos,int m)
    {
        int count = 1;
        int lastPosition = pos[0];
        for(int i = 1;i < pos.length;i++)
        {
            if(pos[i]-lastPosition >= dist)
            {
                count++;
                lastPosition = pos[i];
                if(count==m)
                    return true;
            }

        }
        return false;
         
    }
    
    public int maxDistance(int[] position, int m) { 
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1]-position[0];
        int ans = 0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(canPosition(mid,position,m))
            {
                ans = mid;
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}