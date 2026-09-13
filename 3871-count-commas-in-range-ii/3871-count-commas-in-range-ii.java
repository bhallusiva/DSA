class Solution {
    public long countCommas(long n) {

        long num = n;
        int count = 0;
        while(num!=0)
        {
            long rem = num % 10;
            num = num/10;
            count++;
        }
        if(count < 4)
        {
            return 0;
        }
         long answer = 0;
         long power = 1000;
         while(power<=n)
         {
            answer += n-power+1;
            power = power*1000;
         }
         return answer;
    }
}