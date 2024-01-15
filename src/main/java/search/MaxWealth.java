package search;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] nums= {
                {1,2,3},{12,2,3,4},{6,7}
        };
        System.out.println("the max wealth is :"+maxwealth(nums));
    }
    static int maxwealth(int[][] accounts)
    {
        int ans= Integer.MIN_VALUE;
        for(int person=0;person < accounts.length;person++){
            int sum=0;
            for(int account =0; account<accounts[person].length;account++){
                sum+=accounts[person][account];

            }
            if(sum>ans){
                ans=sum;
            }

        }
        return  ans;
    }
}
