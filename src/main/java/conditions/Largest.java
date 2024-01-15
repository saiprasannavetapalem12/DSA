package conditions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
//        if(a>b && a>c)
//        {
//            System.out.println("a is large"+a);
//        } else if (b>c)
//        {
//            System.out.println("b is large"+b);
//
//        }
//        else
//        {
//            System.out.println("c is large"+c);
//        }
        int max= Math.max(c,Math.max(a,b));
        System.out.println("max is:"+max);

    }
}
