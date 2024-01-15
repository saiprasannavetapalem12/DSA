package search;

public class TargetPosition {
    public static void main(String[] args) {
        int[] arr={1,4,5,7,9};
        int target=6;
        System.out.println(targetpos(arr,target));

    }
    static int targetpos(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else start = mid + 1;
        }
      return start;
    }
}
