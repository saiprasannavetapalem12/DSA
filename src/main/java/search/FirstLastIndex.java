package search;//revise**

import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,6,6,6,8};
        int target=6;
        searchRange(arr,target);
    }
    static void searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        //System.out.println("ans[0]"+ans[0]);
        if(ans[0]!=-1)
        {
        ans[1]= search(nums, target, false);}
       // System.out.println("ans[1]:"+ans[1]);
        System.out.println(Arrays.toString(ans));

    }
    //returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex)
    {
        int ans=-1;
        int start=0; int end=nums.length-1;
        while(start<=end)
        {int mid=(start+end)/2;
            if(target<nums[mid])
                end= mid-1;

            else if (target > nums[mid])
                start = mid + 1;
            else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
       return ans;
    }
}
