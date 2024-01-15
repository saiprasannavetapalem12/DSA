package assignments.task3;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner b= new Scanner(System.in);
        int s= b.nextInt();
        System.out.println("sum of digits:"+digitssum(s));
    }
    static int digitssum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r= n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
}
