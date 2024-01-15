package search;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int m=2;
        System.out.println(splitarray(arr,m));
    }
    static int splitarray(int[] nums, int m)
    {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++)
        {start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        //binary search
        while(start<end)
        {// try fot the potential answer
            int mid= (start+end)/2;
            //calculate how many pieces you can divide this in with max sum
            int sum=0;
            int pieces=1;
            for (int num:nums){
                if(sum+num>mid)
                {//you cannot add this in subarray make new one
                    // say u add this in new subarray,then sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }if(pieces>m)
            {start=mid+1;
            } else{
                end=mid;
            }}
        return start;// here start == end
    }
}
