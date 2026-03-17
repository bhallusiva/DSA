import java.util.Arrays;

public class MoveZeros{
    public int[] move(int arr[],int n)
    {
         int first=0;
         for(int i=0;i<n;i++)
         {
            if(arr[i]!=0)
            {
                arr[first]=arr[i];
                first++;
            }
         }
         while(first<n)
         {
            arr[first]=0;
            first++;

         }
         return arr;
    }
    public static void main(String arsg[])
    {
        MoveZeros ob=new MoveZeros();
        int arr[]={10,8,0,7,0,5,0};
        System.out.print(Arrays.toString(ob.move(arr,arr.length)));

    }
}