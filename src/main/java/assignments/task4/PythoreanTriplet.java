package assignments.task4;

public class PythoreanTriplet {
    public static void main(String[] args) {
        int a[]={3,1,4,6,5};
        if(isTriplet(a)==true)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }


    }
    static boolean isTriplet(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j< a.length;j++)
            {
                for(int k=j+1;k<a.length;k++) {
                    int x = a[i] * a[i], y = a[j] * a[j], z = a[k] * a[k];
                    if(x==y+z || y== x+z || z == x + y  ) {
                            return true;
                        }
                    }
                }
        }
        return false;
    }
}
