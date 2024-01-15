package assignments.task2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter a num:");


        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s % 2 == 0) {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
