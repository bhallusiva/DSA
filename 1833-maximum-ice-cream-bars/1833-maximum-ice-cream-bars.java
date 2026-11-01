class Solution {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);   //11234
        int total_bars = 0;
        for(int i = 0; i< costs.length; i++)
        {
            if(coins>=costs[i])
            {
                total_bars++;
                coins = coins-costs[i];
            }else{
                break;
            }
        }
        return total_bars;

    }
}