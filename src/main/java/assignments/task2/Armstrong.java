package assignments.task2;

import java.util.Scanner;

public class Armstrong {
    static void arm(int low,int high)
    {
        for(int i=low+1;i<high;++i)
        {
            int x= i;
            int n=0;
            while(x!=0)
            {
                x=x/10;++n;
            }
            int s=0;
            x=i;
            while(x!=0)
            {
                int digit= x%10;
                s+= (int) Math.pow(digit,n);
                x=x/10;
            }
            if(s==i)
            {
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner b= new Scanner(System.in);
        System.out.println("enter two numbers to list out armstrons b/w them:");
        int p= b.nextInt();
        int q= b.nextInt();
        arm(p,q);
        System.out.println();
    }
}
