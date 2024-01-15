package assignments.task3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        Scanner d = new Scanner(System.in);

        System.out.println("enter a year:");
        int n = d.nextInt();
        System.out.println(leap(n));
    }

    static boolean leap(int n) {
        boolean lp=true;

        if (n % 4 == 0) {
            if(n%100==0){
                if(n%400==0)
                    lp=true;
                else lp=false;

            }
            else {
                lp=true;
            }

        }
        else {
            lp= false;
        }
        return lp;
    }
}
