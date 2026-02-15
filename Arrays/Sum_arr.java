package Arrays;

public class Sum_arr {
    int sum(int[] arr,int n)
    {
        int Smallest_val=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>Smallest_val)
            {
                Smallest_val=arr[i];
            }
        }
        return Smallest_val;
    }
    public static void main(String args[])
    {
        Sum_arr ob=new Sum_arr();
        int[] arr={10,20,30};
        System.out.println(ob.sum(arr,arr.length));
    }
}
