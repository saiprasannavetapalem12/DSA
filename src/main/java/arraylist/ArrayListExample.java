package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(23);
//        list.add(22);
//        list.add(90);
//        System.out.println(list.contains(22));
//        list.set(0,1);
//        list.remove(2);

        for(int i=0;i<5;i++)
        {
            list.add(in.nextInt());
        }
        System.out.println(list);
        for(int i=0;i<5;i++) {
            System.out.println(list.get(i));
        }


        }
}
