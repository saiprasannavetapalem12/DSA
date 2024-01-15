package search;

public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr={4,2,1,-10,-100};//descending order
        int[] k={23,22,20,12,1};
        int target=-10;
        int tt=1;
        System.out.println(binarysearch(arr,target));
    System.out.println(binarysearch(k,tt));
    }


static int binarysearch(int[] arr, int target)
    {
        int start=0;
        int end= arr.length-1;
        boolean isAsc= arr[start] < arr[end];

        while(start<=end)
        {
            int mid=(start+end)/2;
           if(target==arr[mid])
               return mid;
           if(isAsc)
           {
               if(target>arr[mid])
               {start= mid+1;}
               else {end= mid-1;}
           }
           else {
               if (target > arr[mid])
                   end = mid - 1;

               else
                   start = mid + 1;
           }
        }
        return -1;

    }

}
