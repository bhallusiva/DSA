import java.util.Arrays;
public class OperationsOnArray2460 {
    //our task is find apply the multiplication operation on same elements in an array
    //i.e if nums[i]=num[i+1]
    //multiply nums[i] by 2 and make nums[i+1] to 0
    //in last move all zeros to end
    void MoveZeros(int[] arr)
    {
        int first=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[first]=arr[i];
                first++;
            }
        }
        while(first<arr.length)
        {
            arr[first]=0;
            first++;
        }
    }
    int[] Operations(int[] arr)
    {
        int first=0;
        int second=first+1;
        while(second<arr.length)
        {
            if(arr[first]==arr[second])
            {
                arr[first]=arr[first]*2;
                arr[second]=0;
            }
            first++;
            second++;
        }
        MoveZeros(arr);
        return arr;
    }
    public static void main(String args[]) 
    {
        int[] arr={1,2,2,1,1,0};
        OperationsOnArray2460 ob=new OperationsOnArray2460();
        System.out.println(Arrays.toString( ob.Operations(arr)));
    }
}
