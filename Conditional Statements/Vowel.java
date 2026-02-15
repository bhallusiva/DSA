import java.util.*;
class Vowel{
    void Isvowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+" :-Vowel");
        }else{
            System.out.println(ch+" :-Consonant");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Vowel ob=new Vowel();
        System.out.println("Enter Character");
        char ch=sc.next().charAt(0);
        ob.Isvowel(ch);
        

    }
}