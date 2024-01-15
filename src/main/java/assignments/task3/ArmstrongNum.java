package assignments.task3;

public class ArmstrongNum {
    public static void main(String[] args) {
//        Scanner nu= new Scanner(System.in);
//        int k= nu.nextInt();
//        int n=k;

//
        for(int i=100; i<=200;i++)
        {
            int s=0;
            int n=digits2(i);
            //System.out.println(n);
            while (i != 0)
            {
                int r = i % 10;
                s = (int) (s + Math.pow(r, n));
                i = i / 10;
            }
            //System.out.println("sum:"+s);
            if (s == i) {
                System.out.println(i+"armstrong");
////
            }
        }
    }
    static int digits2(int num)
    {
        return (int)(Math.log10(num))+1;
    }
}
