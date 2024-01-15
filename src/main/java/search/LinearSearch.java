package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] n={1,2,3,4,56};
        int target=0;
        System.out.println("the element is at index:"+linearsearch(n,target));

    }
    static  int linearsearch(int[]arr, int target) {
        if (arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return Integer.MAX_VALUE;
    }

}
