package search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={12,3,4,5,67,7};
        int target= 4;
        int start=2;
        int end=4;
        System.out.println(searchrange(arr,target,start,end));
    }
    static int searchrange(int[] arr, int target, int start,int end )
    {
        if(arr.length==0)
            return  -1;
        for(int i=start;i<end;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
