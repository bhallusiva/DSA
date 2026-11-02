class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->Integer.compare(
            a[0]-a[1],b[0]-b[1]
        ));
        int length = costs.length/2;
        int min_cost = 0;
        for(int i = 0;i<length;i++)
        {
            min_cost += costs[i][0];
        }
        for(int i = length; i< costs.length;i++)
        {
            min_cost += costs[i][1];
        }
        return min_cost;
    }
}