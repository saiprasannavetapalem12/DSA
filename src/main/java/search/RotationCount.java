package search;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot =findPivot(arr);
//        if(pivot==-1)
//        {//array mot rotated
//            return 0;}
            return pivot+1;

    }
    //for non duplicates:
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            //4cases:
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    //use this for duplicates:
    static int findPivotWithDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            if(mid>start && arr[mid] <arr[mid-1]) return mid-1;
            //if elements at start, end, middle are equal just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {
                //skip the duplicates
                //what if these elements at start and end were the pivot?
                //check if start is pivot
                if(arr[start]>arr[start+1]) return start;
                start++;
                //check whether end is pivot are not:
                if(arr[end]< arr[end-1]) return end-1;
                end--;
            }
            //left side is sorted pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid] >arr[end]))
            {
                start= mid+1;
            }
            else end=mid-1;
        }
        return -1;
    }
}
