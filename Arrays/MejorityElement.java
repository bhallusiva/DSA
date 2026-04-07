public class MejorityElement {


    //we are using Mores voting algorithm 
    //start with first elemnet assume it as mejority element
    //declare a count variable to 0
    //iterate the loop through array if you find any same element i.e assumed majority element
    //increment count value by one
    //other wise decrement the count value by one
    //untill you got count value is zero
    //check upto we got count 0 ,that assumed value is occuring greater than 
    int mejority(int arr[])
    {
        int count=0;
        int ele=0;
        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            {
                count=1;
                ele=arr[i];
            }else if(arr[i]==ele){
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele){
                count1++;
            } 
        }
        if(count1>arr.length/2)
        {
            return ele;
        }
        
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,30,10,20,10,10};
        MejorityElement ob=new MejorityElement();
        int x=ob.mejority(arr);
        System.out.println(x);
    }
}
