package DSA.Arrays;

public class LongestConsecutiveSequence {

    int longestSequence(int[] arr)
    {
        int longest =1;
        for(int i=0;i<arr.length;i++)
        {
            int x= arr[i];
            while(linearSearch())
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        System.out.println(ob.longestSequence(arr));
    }
}
