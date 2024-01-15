package assignments.task3;

import java.util.Scanner;

public class SumUser {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = in.nextInt();
        int sum = 0;
//        while(a>0)
//        {
//            if(a>0) {
//            sum = sum + a;
//                 }
//            else{
//            System.out.println("no data");
//        }
//        a=in.nextInt();
//
//        }
//        System.out.println("sum is:"+sum);
        int max= Integer.MIN_VALUE;
        do {
            if (a > 0)
                if(a>max)
                {max=a;}
            a = in.nextInt();

        } while (a > 0);
        System.out.println("maximum is:"+max);


    }
}
