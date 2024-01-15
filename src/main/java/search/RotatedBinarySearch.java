package search;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(findPivot(arr));
        System.out.println(search(arr,target));

    }
    static int search(int[] nums, int target)
    {
        int pivot =findPivot(nums);
        //if no pivot then array is not rotated
        if(pivot==-1){
            //just do normal search.
            return binarysearch(nums,target,0,nums.length-1);
        }
        //if pivot found we got 2 ascending sorted arrays
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(target>=nums[0])
        {
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }
    static int binarysearch(int[] arr, int target,int start, int end)
    {

        while(start<=end) {
            int mid = (start + end) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else return mid;
        }
        return -1;
    }
    static int findPivot(int[] arr)
    {
        int start=0; int end=arr.length-1;
        while(start<=end)
        {
            int mid= (start+end)/2;
            //4cases:
            if(mid < end && arr[mid]>arr[mid+1]) return mid;
            if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            if(arr[mid]<=arr[start])
            {
                end= mid-1;
            }
            else
            { start= mid+1;
            }
        }
        return -1;
    }

}
