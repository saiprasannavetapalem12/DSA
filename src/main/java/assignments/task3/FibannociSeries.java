package assignments.task3;

public class FibannociSeries {
    public static void main(String[] args) {
        fib(10);

    }
    static void fib(int target)
    {
        int n1=0;int n2=1;
        System.out.print(n1+" "+n2);
//        int n3;
//        for(int i=2;i<count;i++) {
//            n3 = n1 + n2;
//            System.out.print(" " + n3);
//            n1=n2;
//            n2=n3;
//        }
//using while loop impementing fib:
        int count=2;
        while(count<=target)
        {
            int temp=n2;
            n2=n1+n2;
            System.out.print(" "+n2);
            n1=temp;
            count++;

        }

    }
}
