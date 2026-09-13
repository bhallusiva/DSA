class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        
        // Edge Case: If the total time allowed is less than or equal to 
        // the minimum integer hours needed for the first n-1 trains.
        if (hour <= n - 1) {
            return -1;
        }
        
        int low = 1;
        int high = 10_000_000; // 10^7 as specified by the problem constraints
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canReachOnTime(dist, hour, mid)) {
                ans = mid;         // Record the current feasible minimum speed
                high = mid - 1;    // Try to find a smaller valid speed
            } else {
                low = mid + 1;     // Increase the speed
            }
        }
        
        return ans;
    }
    
    private boolean canReachOnTime(int[] dist, double hour, int speed) {
        double totalTime = 0.0;
        int n = dist.length;
        
        // For all legs except the last one, round up to the next integer hour
        for (int i = 0; i < n - 1; i++) {
            // Integer arithmetic for ceiling: (a + b - 1) / b
            totalTime += (dist[i] + speed - 1) / speed;
        }
        
        // For the final leg, use precise floating-point division
        totalTime += (double) dist[n - 1] / speed;
        
        return totalTime <= hour;
    }
}