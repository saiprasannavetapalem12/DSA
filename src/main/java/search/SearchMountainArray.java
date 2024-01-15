package search;
//for the given mountain array first found the peak element and then divided the search as left and right based on the target
public class SearchMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,8,9,16,3,2};
        int target=2;
        System.out.println(search(arr,target));

    }
    static int search(int[] arr,int target)
    {
        int peak=peakIndex(arr);
        int firstTry= orderbsearch(arr,target,0,peak);
        if(firstTry!=-1) return firstTry;
        return orderbsearch(arr,target,peak+1,arr.length-1);


    }
    public static int peakIndex(int[] arr)
    {
        int start=0; int end=arr.length-1;
        while(start<end){
            int mid= (start+end)/2;
            if(arr[mid]>arr[mid+1]) end=mid;
            else start=mid+1;
        }
        return start;
    }
    static int orderbsearch(int[] arr,int target, int start, int end)
    {
        boolean isAsc=arr[start]<arr[end];
        while (start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==target) return mid;
            if(isAsc){
                if(target<arr[mid]) end=mid-1;
                else start=mid+1;
            }
            else{
                if(target>arr[mid]) end=mid-1;
                else start=mid+1;
            }
        }
        return -1;
    }



}
