package conditions;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int empID = in.nextInt();
        String dept= in.next();
        switch (empID) {
            case 1 -> System.out.println("sai prasanna");
            case 2 -> System.out.println("charan");
            case 3 -> {
                switch (dept) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("no valid department");
                }
            }
            default -> System.out.println("enter correct ID");
        }
    }
}
