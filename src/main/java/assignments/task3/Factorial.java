package assignments.task3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner i =new Scanner(System.in);
        System.out.println("enter a num:");
        int n= i.nextInt();
        System.out.println("factorial is:"+fact(n));
    }
    static int fact(int n)
    {
        if(n==0)
            return 1;
        else {
            return n*fact(n-1);
        }

    }
}
