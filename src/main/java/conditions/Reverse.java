package conditions;

import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

public class Reverse {
    public static int rev(int n)
    {
        int s = 0;
        while(n!=0) {
            int r = n % 10;
            s =(s* 10)+r;
            n = n / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        System.out.println(rev(a));

    }
}
