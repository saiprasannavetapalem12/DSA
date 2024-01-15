package assignments.task1;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int d= s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(d+" * "+i+ " = "+d*i);
        }
    }
}
