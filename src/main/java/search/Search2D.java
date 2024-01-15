package search;

import java.util.Arrays;

//searching given element in 2D array using binary search
public class Search2D {
    public static void main(String[] args) {
       int[][] arr={{10,20,30,40},{11,22,33,44},{12,24,34,45} };
       int target=20;
       System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0)
        {
            if(matrix[r][c] == target)
                return new int[]{r,c};
            if(matrix[r][c]<target) r++;
            else c--;
        }
        return new int[]{-1,-1};
    }

}
