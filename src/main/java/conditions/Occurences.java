package conditions;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int o = s.nextInt();
        int count = 0;
        while (a != 0) {
            int r = a % 10;
            a = a / 10;
            if (r == o) {
                count++;
            }
        }
        System.out.println(count);

    }
}
