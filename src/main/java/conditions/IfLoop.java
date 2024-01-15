package conditions;

public class IfLoop {
    public static void main(String[] args) {
        int s= 3009990;
        if(s>1000000)
        {
            s=s+2000;
        }
        else if(s>2000000){
            s=s+1000;
        }
        else {
            s+=100;
        }
        System.out.println(s);
    }
}
