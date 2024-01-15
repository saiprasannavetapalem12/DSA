package search;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,122,14,6787};
        System.out.println("No.of even digits:"+findNumbers(nums));

    }
    static int findNumbers(int[] nums)
    {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {count++;}
        }
        return count;
    }
    //Even no.of digits or not:
    static boolean even(int num)
    {
       return digits2(num)%2 == 0;

    }


    //No.of digits:
    static int digits2(int num)
    {
        return (int)(Math.log10(num))+1;
    }
    static int digits(int num)
    {
        int c =0;
            while(num>0)
            {
                c++;
                num/=10;
            }
        return c;
    }
}
