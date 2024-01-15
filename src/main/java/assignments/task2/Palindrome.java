package assignments.task2;

import java.util.Scanner;

public class Palindrome {
    public static boolean ispol(String s)
    {
        String rev = "";
        boolean ans= false;
        for(int i=s.length()-1;i>=0;i--)
        {
            rev= rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            ans= true;
        }
        return ans;

    }

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        String sr= s.next();
        System.out.println(ispol(sr));

    }
}
