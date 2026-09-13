class Solution {
    public int countCommas(int n) {

        int num = n;
        int count = 0;
        while(num!=0)
        {
            int rem = num % 10;
            num = num/10;
            count++;
        }
        if(count < 4)
        {
            return 0;
        }
        int numberOfValues = n-999;
        int possibleCounts = 1;
        int temp = count/3;
        if(temp>possibleCounts)
        {
            temp = temp-1;
        }

        return temp*numberOfValues;

    }
}