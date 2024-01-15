package assignments.task2;
import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        System.out.println("enter two num:");
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b= s.nextInt();
        if(a>b)
        {
            System.out.println(a+" is a big number");
        }
        else
        {
            System.out.println(b+" is a big number");
        }

    }
}
