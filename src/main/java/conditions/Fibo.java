package conditions;

import java.util.Scanner;
//printing the value of the index in the series
public class Fibo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count <= n)
        {
            int temp= b;
            b=b+a;
            a=temp;
            count++;

        }
        System.out.print(b+" ");

    }
}
