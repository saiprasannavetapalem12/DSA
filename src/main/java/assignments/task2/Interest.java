package assignments.task2;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        System.out.println("enter rate, principle, time:");
        Scanner sc= new Scanner(System.in);
        int p= sc.nextInt();
        float r= sc.nextFloat();
        int t = sc.nextInt();
        float I= (p*r*t)/100;
        System.out.println("the simple interest is: "+I);

    }
}
