class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int first = 0;
        int second = 0;
        int count = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(first<players.length && second < trainers.length)
        {
            if(players[first]<=trainers[second])
            {
                count++;
                first++;
                second++;
            }else{
                second++;
            }
        }
        return count;
    }
}