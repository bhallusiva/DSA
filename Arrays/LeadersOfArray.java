import java.util.*;
public class LeadersOfArray {
    List<Integer> leaders(int[] arr)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    break;
                }
                
            }
            list.add(arr[i]);
            
        }
        return list;

    }
    public static void main(String asrg[])
    {
        int[] arr={1,2,5,3,1,2};
        LeadersOfArray ob=new LeadersOfArray();
        System.out.println(ob.leaders(arr));

    }
}
