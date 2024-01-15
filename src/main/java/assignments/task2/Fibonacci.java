package assignments.task2;

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n)
    {
        if(n==0)
        {
            return 0;
        } else if (n==1)
        {
            return 1;
        }
        else
        {
           return fib(n-2)+fib(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print( fib(i) + " ");
        }

    }
}
