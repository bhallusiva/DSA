package Arrays;
import java.util.*;
public class Returning {
    int[] array_return(int arr[],int target)
    {
        int n=arr.length;
    
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return new int[] {i,j}; 
                }
            }
        }
        return new int[]{-1,-1};
        
    }
public static void main(String args[])
{
    Returning ob=new Returning();
    int arr[]={10,20,30};
    int target=40;
    System.out.println(Arrays.toString(ob.array_return(arr,target)));
}    
}

