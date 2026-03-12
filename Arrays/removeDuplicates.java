package Arrays;
import java.util.*;  //all the collection frameworks are available in in this package
public class removeDuplicates {
    public static void main(String args[])
    {
        int[] arr={10,29,10,30,20,20};
        // HashSet is class that implements set interface
        //we all know that the data in set are ordered and unique
        //HashSet internelly uses Hashing technique 
        //hashin means converting an into a number(hashcode)
        //suppose we have 5 buckets(this is some storage area in memory usually calculated with some hash fuction)
        //hashfuction=hashcode%no.of buckets  =>we get some bucket number here
        //we are storing some particular data in this bucket
        HashSet<Integer> set=new HashSet<>(); 
        for(int ele:arr)
        {
            set.add(ele);  //average complexity to add an element in hash set in O(1)
        }
        System.out.println(set);
        ArrayList<Integer> list=new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
