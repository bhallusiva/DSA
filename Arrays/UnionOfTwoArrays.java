import java.util.Arrays;

public class UnionOfTwoArrays {
    int[] Unions(int[] arr1,int[] arr2)
    {
       
        int i=0;
        int j=0;
        int n1=arr1.length;
        int n2=arr2.length;
        int k=0;
         int[] unionArr=new int[n1+n2];
        while(i<n1 && j<n2)
        {
            if(arr1[i]<=arr2[j])
            {
                if(k==0||unionArr[k-1]!=arr1[i])
                {
                    unionArr[k++]=arr1[i];
                    
                }
                i++;
            }else{
                if(k==0||unionArr[k-1]!=arr2[j])
                {
                    unionArr[k++]=arr2[j];
                    
                }
                j++;
            }
        }
        while(j<n2)
        {
           if(k==0||unionArr[k-1]!=arr2[j])
                {
                    unionArr[k++]=arr2[j];
                    
                }
                j++;
        }
        while(i<n1)
        {
          if(k==0||unionArr[k-1]!=arr1[i])
                {
                    unionArr[k++]=arr1[i];
                    
                }
            i++;
        }




        return unionArr;
    }
    public static void main(String args[])
    {
        int[] arr1={10,20,30,40};
        int[] arr2={10,20,30,40,50,80};
        UnionOfTwoArrays ob=new UnionOfTwoArrays();
        System.out.println(Arrays.toString(ob.Unions(arr1, arr2)));
    }
}
