package search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,5,6,7,9,10};//ascending order
        int t=11;
        System.out.println(ceiling(arr,t));

    }
    //ceiling-> Smallest large number after the target

static int ceiling(int[] arr,int target)
{
    int start=0; int end=(arr.length)-1;
    if(target>arr[arr.length-1])
    {
        return -1;
    }
    while (start<=end)
    {
        int mid= (start+end)/2;
        if(target==arr[mid])
        {
            return mid;
        } else if (target>arr[mid])
        {
            start =mid+1;
        }
        else {
            end=mid-1;
        }

    }
    return start;

}
}
