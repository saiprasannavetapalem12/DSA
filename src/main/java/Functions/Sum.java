package Functions;

import java.util.Scanner;

public class Sum {
    public static int add(int m,int n)
    {
        return m+n;
    }
    public static void main(String[] args) {
        Scanner i= new Scanner(System.in);
        int n1=i.nextInt();
        int n2=i.nextInt();
        System.out.println("The sum is:"+add(n1,n2));
    }
}
