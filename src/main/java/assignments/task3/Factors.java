package assignments.task3;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a num to list all the factors:");
        int a= s.nextInt();
        nfactors(a);
    }
    static void nfactors(int n)
    {
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
