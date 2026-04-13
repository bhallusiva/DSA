import java.util.Arrays;

public class RearrangeArrayBySign {
    void arrange(int[] arr)
    {
        int[] possitive=new int[arr.length/2];
        int[] negetive=new int[arr.length/2];
        int pi=0;
        int ni=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                possitive[pi++]=arr[i];
            }else{
                negetive[ni++]=arr[i];
            }
        }
         
        for(int i=0;i<arr.length/2;i++)
        {
            arr[2*i]=possitive[i];
            arr[2*i+1]=negetive[i];
        }
        
    }
    public static void main(String args[])
    {
        int[] arr={2, 4, 5, -1, -3, -4};
        RearrangeArrayBySign ob=new RearrangeArrayBySign();
        ob.arrange(arr);
        System.out.print(Arrays.toString(arr));   
    }
}
