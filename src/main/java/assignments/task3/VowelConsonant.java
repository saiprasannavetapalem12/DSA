package assignments.task3;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String ch=s.next();
        char c=ch.charAt(0);
//        if(ch.charAt(0)=='a'||ch.charAt(0)=='e'||ch.charAt(0)=='i'||ch.charAt(0)=='o'||ch.charAt(0)=='u' )
//        {
//            System.out.println("given character is vowel ");
//        }
//        else
//        {
//            System.out.println("given character is consonant");
//        }
        switch(c){
            case 'a'-> System.out.println("vowel");
            case 'e'-> System.out.println("vowel");
            case 'i'-> System.out.println("vowel");
            case 'o'-> System.out.println("vowel");
            case 'u'-> System.out.println("vowel");



        }
    }
}
