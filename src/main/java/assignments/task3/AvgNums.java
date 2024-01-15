package assignments.task3;

import java.util.Scanner;

public class AvgNums {
    public static void main(String[] args) {
        int i=1;
        int sum=0;

        Scanner s= new Scanner(System.in);
        int count=s.nextInt();
        while(i<=count)
        {
            int a=s.nextInt();
            sum=sum+a;
            i++;
        }
        System.out.println("sum: "+sum+" "+"i: "+i);
        System.out.println("avg is:"+(double)((sum)/(i-1)));
    }
}
