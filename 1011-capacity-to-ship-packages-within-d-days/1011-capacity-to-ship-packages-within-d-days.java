class Solution {
    private boolean canShip(int[] weights,int days,int capacity)
    {
        int currentWeight = 0;
        int dayCount = 1;
        for(int weight:weights){
        currentWeight+=weight;

        if(currentWeight>capacity)
        {
            dayCount++;
            currentWeight = weight;
        }
    }
        return dayCount<=days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight:weights)
        {
            low=Math.max(weight,low);
            high+=weight;
        }
        int ans = high;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(canShip(weights,days,mid))
            {
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}