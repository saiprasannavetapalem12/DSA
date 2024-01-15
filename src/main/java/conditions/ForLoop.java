package conditions;

public class ForLoop {
    public static void main(String[] args) {
        int a=10;
        int d=10;
        int b=a++;
        int c=++d;
        System.out.println();
        for(int i=0;i<=5;++i)
        {
            System.out.println(i);
        }
        System.out.println(b);
        System.out.println("the a is:"+a);
        System.out.println(c);

        int n = 0;
        while(n<=5)
        {
            System.out.println(n);
            n++;
        }
        int r=1;
        do {
            System.out.println(r);
            r++;
        }
        while(r>=0);

    }
}
