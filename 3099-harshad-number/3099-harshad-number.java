class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
         int original = n;
        int sum = 0;
        while(n!=0)
        {
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        if( original % sum==0)
        {
            return sum;
        }
        return -1;
    }
}