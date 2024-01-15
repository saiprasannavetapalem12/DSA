package assignments.task3;

public class Areas {
    public static void main(String[] args) {
        System.out.println("circle:"+area(7));
        System.out.println("triangle:"+area_t(3,4));

    }
    static double area(int r)
    {
        return Math.PI*r*r;
    }
    static double area_t(int b, int h)
    {
        return 0.5*b*h;
    }
}
