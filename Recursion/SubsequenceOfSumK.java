import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfSumK {
    void sequence(int index,List<Integer> list,int[] arr,int sum,int k)
    {
        if(index == sum)
        {
            if(sum == k)
            {
                System.out.println(list);
                return;
            }
            return;
        }
        list.add(arr[index]);
        sequence(index+1, list, arr, sum, k);
        list.remove(arr[index]);
        sequence(index+1, list, arr, sum, k);
        
    }
    public static void main(String arsg[])
    {
        int [] arr= {3,1,2};
        SubsequenceRecursion ob = new SubsequenceRecursion();
        ob.sequence(0,new ArrayList<>(),arr,0);
    }
}
