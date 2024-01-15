package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      fun(2,3,4,5,6,7);
      multipile(2,3,"sai","prasana","kunal");
    }
    static void multipile(int a,int b, String...v)
    {
        System.out.println();
    }
    static  void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
