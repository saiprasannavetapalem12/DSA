package search;

public class InfiniteArray {
    public static void main(String[] args) {
        //start with size 2
        int[] arr={1,2,3,4,5,6,7,22,23,24,35,45,55,56,67,89,90};
        int target=7;
        System.out.println(findingRange(arr,target));

    }
    static int findingRange(int[] arr, int target)
    {
        //find the range:
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int temp= end+1;
            end= end+(end-start+1)*2;
            start=temp;
        }
        return bsearch(arr,target,start,end);

    }
    static int bsearch(int[] arr, int target,int start,int end)
    {
        while(start<=end)
        {
            int mid= (start+end)/2;
            if(target<arr[mid]) end= mid-1;
            else if (target>arr[mid]) start=mid+1;
            else return mid;
        }
        return -1;
    }
}
