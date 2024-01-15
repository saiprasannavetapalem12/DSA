package search;

public class Floor {
    public static void main(String[] args) {
        int[] arr={2,5,6,7,9,10};//ascending order
        int t=8;
        System.out.println(floor(arr,t));

    }
    //floor->greatestnumber <= target

    static int floor(int[] arr,int target)
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
        return end;

    }
}


