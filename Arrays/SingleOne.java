package DSA.Arrays;



public class SingleOne {
    int findSingleOne(int[] arr)
    { 
        // we know that 
        // 0 XOR 2 = 2
        // 2 XOR 2 = 0
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            xor=xor^arr[i]; 

            // 0^1^2^2^1^3^4^3

        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,1,3,4,3};
        SingleOne ob=new SingleOne();
        System.out.println(ob.findSingleOne(arr));
        
    }
}
