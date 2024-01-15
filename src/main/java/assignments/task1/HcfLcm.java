package assignments.task1;

import java.util.Scanner;

//To find hcf and lcm of a num
public class HcfLcm {
    public static void main(String[] args) {
        System.out.println("enter 2 numbers:");
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int t,t1,t2;
        t1=a;
        t2=b;
        while(t2!=0)
        {
            t=t2;
            t2=t1%t2;
            t1=t;
        }
        int hcf= t1;
        int lcm= (a*b)/hcf;
        System.out.println("The hcf and Lcm is:"+hcf+", "+lcm);

    }
}
