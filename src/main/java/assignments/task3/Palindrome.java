package assignments.task3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        System.out.println("enter a string:");
        String str=s.next();
        System.out.println(reverse(str));
//        int sum=0;
//        int a=n;
//        while (a!=0)
//        {
//            int r= a%10;
//            sum=sum*10+r;
//            a/=10;
//        }
//        System.out.println("sum:"+sum);
//        if(sum==n)
//        {
//            System.out.println("palindrome");
//        }
//        else
//        {
//            System.out.println("Not palindrome");
//        }

    }
    static String reverse(String sr)
    {
        String r="";
        for(int i=sr.length()-1;i>=0;i--)
        {
            r=r+sr.charAt(i);
        }
       // System.out.println(r);
        return r;
    }
}
