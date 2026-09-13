package LinkedLists;

import java.util.Scanner;

class Sample {
    public static void main(String[] args) {

        String data = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter data");
        data = sc.next();
        String divisor ="";
        int version;
        System.out.println("enter version 16 0r 32");
        version = sc.nextInt();
        if(version == 16)
        {
            divisor = "1101";
            sender(data,divisor);
        }else if(version == 32){
            divisor = "1011";
            sender(data, divisor);
        }else{
            System.out.println("invalid version");
        }

}
public static void sender(String data,String divisor)
{
    StringBuffer originalData = new StringBuffer(data);
    StringBuffer codeWord = remainder(data, divisor);
    StringBuffer recieverCodeWord = originalData.append(codeWord);
    reciever(recieverCodeWord.toString(),divisor);
}
public static void reciever(String recieverCodeWord,String divisor)
{
    StringBuffer finalCode = remainder(recieverCodeWord, divisor);
    if(finalCode.toString().equals("000"))
    {
        System.out.println("No Error");
    }else{
        System.out.println("there is an error -> check this"+finalCode.toString());
    }
}
public static StringBuffer remainder(String data,String divisor)
{
    StringBuffer sb = new StringBuffer(data);
    for(int i = 0 ; i<divisor.length()-1;i++)
    {
        sb.append('0');
    }
    int i;
    for(i = 0; i<=sb.length()-divisor.length();i++)
    {
        StringBuffer remainder = new StringBuffer(sb.substring(i,i+divisor.length()));
        
        if(remainder.charAt(0)=='1')
        {
        remainder = xor(divisor,remainder);
        }
        sb.replace(i, i+divisor.length(), remainder.toString());
         
    }
    return new StringBuffer(sb.substring(sb.length()-divisor.length()+1));
}
public static StringBuffer xor(String divisor,StringBuffer remainder)
{
    if (divisor.length()!=remainder.length()) {
        System.out.println("take remainder properly -> go to substring logic");
        return null;
    }
    for(int i = 0;i<remainder.length();i++)
    {
        remainder.setCharAt(i, divisor.charAt(i)!=remainder.charAt(i)?'1':'0');
    }

    return remainder;
}
}