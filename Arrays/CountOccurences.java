package DSA.Arrays;

import java.util.HashMap;

public class CountOccurences {
    public static void main(String args[])
    {
        int[] arr={10,20,10,30,20};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr)
        {
            int count=1;    
            if(map.containsKey(ele))
            {
                count=map.get(ele);
                map.put(ele, count+1);
            }else{
                map.put(ele,count);
            }
        }
        System.out.println("no of occurences are"+map.get(10));
    }
}
