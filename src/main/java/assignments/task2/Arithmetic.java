package assignments.task2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("enter 2 numbers:");
        Scanner s= new Scanner(System.in);
        int a =s.nextInt();
        int b=s.nextInt();
        char sign;
        System.out.println("enter a sign:");
        sign= s.next().charAt(0);
        if(sign=='+')
        {
            System.out.println("the addition is: "+a+b);
        } else if (sign=='*')
        {
            System.out.println("the multiplication is: "+a*b);
        }
        else if (sign=='/')
        {
            System.out.println("the multiplication is: "+a/b);
        }
        else if (sign=='-')
        {
            //System.out.println("the subtraction is:"+a-b);
        }
        else
        {
            System.out.println("Invalid input");
        }

    }
}
