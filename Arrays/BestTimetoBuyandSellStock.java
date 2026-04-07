package Arrays;
class BestTimetoBuyandSellStock{
    int computeProfit(int[] arr)
    {
         /*in the optimal solution we need yo find the minPrice (obviously every person intention is 
         to buy a stock with cheap price and sell it with maxProfit)
         -> finding the min profit
         -> check and calculate the profit for each element(price)
         ->update the max profit 

         */
        int minPrice=arr[0]; // intial minPrice is let say the 5
        int maxProfit=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<minPrice)
            {
                minPrice=arr[i];
            }else{
                int profit=arr[i]-minPrice; //calculating profit for each selling price
                maxProfit=Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static void main(String args[])
    {
        int[] arr={5,4,3,2,1};
        BestTimetoBuyandSellStock ob=new BestTimetoBuyandSellStock();
       System.out.println( ob.computeProfit(arr));
    }
}