//chaech whether a number divisible by 5 and 11


// import java.util.*;
// class Divisible{
//     void IsDivisible(int num)
//     {
//         if(num%5==0&&num%11==0)
//         {
//             System.out.println(num+" is divisible by 5 and 11");
//         }else{
//             System.out.println(num+"is not divisible by 5 and 11");
//         }
//     }
//     public static void main(String args[])
//     {
//         System.out.println("Enter the number:");
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         Divisible ob=new Divisible();
//         ob.IsDivisible(num);
//     }
// }


import java.util.*;
class Divisible{
    void IsDivisible(int num)
    {
        if(num%3==0||num%7==0)
        {
            System.out.println(num+" is Multiples of 3 or 7");
        }else{
            System.out.println(num+"is not Multiples of 3 or 7");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Divisible ob=new Divisible();
        ob.IsDivisible(num);
    }
}
