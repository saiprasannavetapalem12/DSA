package Functions;

public class Overloading {
    public static void main(String[] args) {
        fun(23);
        fun("Sai");

    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String n)
    {
        System.out.println(n);
    }
}
