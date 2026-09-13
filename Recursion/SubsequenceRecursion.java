import java.util.*;
class SubsequenceRecursion{
    void sequence(int ind,List<Integer>list,int[] arr,int sum,int k)
    {
        if(ind>=arr.length)
        {
            if(sum == k){
            System.out.println(list);
            return;
            }
            return;
        }
        list.add(arr[ind]);
        sum = sum+arr[ind];
        sequence(ind+1, list, arr,sum,k); // tale case
        list.remove(list.size()-1);
        sum = sum-arr[ind];
        sequence(ind+1, list, arr,sum,k); //not take case

    }
    public static void main(String arsg[])
    {
        int [] arr= {3,1,2};
        SubsequenceRecursion ob = new SubsequenceRecursion();
        ob.sequence(0,new ArrayList<>(),arr,0,4);
    }
}