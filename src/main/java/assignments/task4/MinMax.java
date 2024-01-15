package assignments.task4;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args)
    {
        Scanner n= new Scanner(System.in);
//        int a = n.nextInt();
//        int b = n.nextInt();
//        int c = n.nextInt();
        int age=n.nextInt();
//        System.out.println(min(a,b,c));
//        System.out.println(max(a,b,c));
        System.out.println(iseligible(age));

    }
    static boolean iseligible(int age)
    {
        if(age>=18)
        {
            return true;
        }
        return false;
    }
    static int min(int a, int b, int c){
        int min= a;
        if(b<min)
           min=b;
        if(c<min)
            min=c;
        return min;
    }
    static int max(int a, int b, int c){
        int max= a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
        return max;
    }
}
