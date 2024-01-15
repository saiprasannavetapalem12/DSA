package search;

public class MinimumNum {
    public static void main(String[] args) {
        int[] arr={12,2,3,4,55,-9,7};
        System.out.println(min(arr));

    }
    static int min(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
