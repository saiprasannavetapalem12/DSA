package assignments.task2;

import java.util.Scanner;

public class InrUsd {
    public static void main(String[] args) {
        System.out.println("enter value in rupees:");
        Scanner in= new Scanner(System.in);
        float r;
        r=in.nextFloat();
        float d= r/84;
        System.out.println("dollars value:"+d);
    }
}
