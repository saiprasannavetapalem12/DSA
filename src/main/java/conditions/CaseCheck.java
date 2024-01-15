package conditions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner n=  new Scanner(System.in);
        char ch= n.next().trim().charAt(0);
        //System.out.println(ch);
        if(ch>='a' && ch <='z')
        {
            System.out.println("lower case!");
        }
        else
        {
            System.out.println("Upper case!!");
        }
    }
}
