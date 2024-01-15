package search;
// Hard question...
import java.util.Arrays;

public class Sorted2DMatrix {
    public static void main(String[] args) {

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(searchsorted(arr,8)));
    }
    //search in th row provided.
    static int[] binarysearch(int[][] matrix,int target,int row,int cstart ,int cend)
    {
        while(cstart<=cend)
        {
            int mid=(cstart+cend)/2;
            if(matrix[row][mid]==target)
                return new int[]{row,mid};
            if(matrix[row][mid]<target)
                cstart=mid+1;
            else cend=mid-1;
        }
        return new int[]{-1,-1};
    }
    static int[] searchsorted(int[][] matrix,int target)
    {
        int rows=matrix.length;
        int cols=matrix[0].length;//be cautious matrix may be empty
        if(rows==1)
        {
            return binarysearch(matrix,0,0,cols-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        //run the loop till 2 rows are remaining
        while (rstart<(rend-1)){
            //while this is true it has more than 2 rows
            int mid= (rstart+rend)/2;
            if(matrix[mid][cmid]==target)
            {
                return new  int[]{mid,cmid};
            }
            if(matrix[mid][cmid]<target)
            {
                rstart=mid;
            }
            else rend=mid;
        }
        //now we have two rows:
        //check whether the target is in the column of two rows
        if(matrix[rstart][cmid]== target)
        {
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]==target)
        {
            return new int[]{rstart +1,cmid};
        }
        //search in 1st half
        if(target<= matrix[rstart][cmid-1]){
            return binarysearch(matrix,target,rstart,0,cmid-1);

        }
        //search in 2nd half:
        if(target>= matrix[rstart][cmid-1] && target<=matrix[rstart][cols-1]){
           return binarysearch(matrix,target,rstart,cmid+1,cols-1);
        }
        //search in 3rd half:
        if(target<= matrix[rstart][cmid-1]){
            return binarysearch(matrix,target,rstart+1,0,cmid-1);
        }
        else{
            return binarysearch(matrix,target,rstart+1,cmid+1,cols-1);
        }

    }
}
