import java.util.ArrayList;
import java.util.List;

public class OneSubsequenceOfSumK {
    boolean sequence(int index,List<Integer> list,int[] arr,int sum,int k)
    {
        if(index == arr.length)
        {
            if(sum == k)
            {
                System.out.println(list);
                 return true;
            }
            return false;
        }
        list.add(arr[index]);
        sum = sum + arr[index];
        if(sequence(index+1, list, arr, sum, k)) return true;
        list.remove(list.size()-1);
        sum = sum - arr[index];
        if(sequence(index+1, list, arr, sum, k)) return true;
        return  false;
        
    }
    public static void main(String arsg[])
    {
        int [] arr= {3,1,2};
        OneSubsequenceOfSumK ob =new OneSubsequenceOfSumK();
        ob.sequence(0,new ArrayList<>(),arr,0,4);
    }
}
