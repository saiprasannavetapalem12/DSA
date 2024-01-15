package assignments.task3;

public class ElectricityBill {
    public static void main(String[] args) {
        int units = 400;
        //double billtopay = 0;
        System.out.println("the bill is:"+getbill(units));
    }
    static double getbill(int units) {
        double billtopay=0;
        if (units < 100) {
            billtopay = (units * 1.5);
        } else if (units < 200) {
            billtopay = 100 * 1.5 + (units - 100) * 2;
        } else if (units > 300) {
            billtopay = 100 * 1.5 + 200 * 2 + (units - 300) * 3;
        }
        return billtopay;
    }
}
