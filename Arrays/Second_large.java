package Arrays;
class Second_large{
    int sec_large(int[] arr)
    {
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>large)
            {
                large=num;
            }
        }
        for(int num:arr)
        {
            if(num>second_large&&num!=large)
            {
                second_large=num;
            }
        }
        return second_large;
    }
    public static void main(String args[])
    {
        int[] arr={20,-1,90,47,78};
        Second_large ob=new Second_large();
        System.out.println(ob.sec_large(arr));

    }
 }