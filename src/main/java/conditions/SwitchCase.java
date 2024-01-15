package conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
//        String fruit= s.next();
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Red fruit");
//            case "orange" -> System.out.println("Round fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("enter a valid fruit");
//        }


        while(true) {
            System.out.println("enter a num:");
            int n= s.nextInt();

//            switch (n) {
//                case 1 -> System.out.println("monday");
//                case 2 -> System.out.println("Tuesday");
//                case 3 -> System.out.println("wednesday");
//                case 4 -> System.out.println("Thursday");
//                case 5 -> System.out.println("Friday");
//                case 6 -> System.out.println("saturday");
//                case 7 -> System.out.println("sunday");
//                default -> System.out.println("enter valid input!!");
//            }
//            switch(n)
//            {
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                    System.out.println("weekday");
//                    break;
//                case 6:
//                case 7:
//                    System.out.println("weekend");
//                    break;
//            }
            switch (n) {
                case 1, 2, 3, 4, 5 -> System.out.println("weekday");
                case 6, 7 -> System.out.println("weekend");
                default -> System.out.println("valid i/p");
            }
        }
    }
}
