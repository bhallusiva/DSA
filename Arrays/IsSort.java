package Arrays;

public class IsSort {
    boolean isSort_arr(int[] arr,int n)
    {
        int first=0;
        int second=first+1;
        while(second<n){
            if(arr[first]>arr[second])
            {
                return false;
            }
            first++;
            second++;
        }
        return true;
    }
    public static void main(String args[])
    {
        int[] arr={12,1,13,34};
        IsSort ob=new IsSort();
        System.out.println(ob.isSort_arr(arr,arr.length));
    }
}
