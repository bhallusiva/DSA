import java.util.Arrays;

public class RearrangeArrayBySign {
    int[] arrange(int[] arr)
    {
        int pIndex=0;
        int nIndex=1;
        int[] result=new int[arr.length];
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]<0)
            {
                result[nIndex]=arr[i];
                nIndex=nIndex+2;
            }else{
                result[pIndex]=arr[i];
                pIndex=pIndex+2;
            }
         }
         return result;
    }
    public static void main(String args[])
    {
        int[] arr={2, 4, 5, -1, -3, -4};
        RearrangeArrayBySign ob=new RearrangeArrayBySign();
        
        System.out.print(Arrays.toString(ob.arrange(arr)));   
    }
}
