package DSA.Arrays;



public class SingleOne {
    void findSingleOne(int[] arr)
    {
        
         for(int i=0;i<arr.length;i++)
         {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]);
            }
         }
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,1,3,4,3};
        SingleOne ob=new SingleOne();
        ob.findSingleOne(arr);
        
    }
}
