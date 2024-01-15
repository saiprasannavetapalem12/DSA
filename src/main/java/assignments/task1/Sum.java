package assignments.task1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println("enter two numbers to find the sum: ");

        Scanner s = new Scanner(System.in);
        int a = 2;
        int b = 3;
        //System.out.println(Math.addExact(a,b));
        System.out.println(addIterative(a,b));

    }
    //addition without using '+'
    public static int addIterative(int a, int b){
        while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
            System.out.println(carry);

            a = a ^ b; //SUM of two bits is A XOR B o/p 1 only when opposite symbols
            System.out.println(a);

            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;
    }
    //division without using '/' symbol:


}
