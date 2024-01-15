package assignments.task3;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        System.out.println(perfect(v));
    }
    static boolean perfect(int n)
    {
        int sum=0; int i=1;
        while(i<n)
        {
            if(n%i==0)
            sum+=i;
            i++;
        }
        if(sum==n)
            return true;
        else
            return false;
    }
}

