package assignments.task3;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {


        Scanner n = new Scanner(System.in);
        int n1=n.nextInt();
        int n2= n.nextInt();
        int temp1=n1;
        int temp2 =n2;
        while(temp2 !=0)
        {
            int temp=temp2;
            temp2=temp2%temp1;
            temp1=temp;
        }
        System.out.println("HCF:"+temp1);
        System.out.println("Lcm:"+(n1*n2)/temp1);
    }

}
