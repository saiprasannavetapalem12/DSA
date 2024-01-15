package search;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,10,6,3,2};
        System.out.println(peakIndex(arr));

    }

static int peakIndex(int[] arr)
{
    int start =0;
    int end = arr.length-1;
    while(start < end)
    {
        int mid = (start+end)/2;
        if(arr[mid]>arr[mid+1])
        {//you are un decreasing part of array
                //mid element>right side=> may be the mid answer but check left side
            //this is y end!=mid-1;
            end=mid;
        }else
        {
            //you are in ascending part of array
            start=mid+1;//because know that mid+1 > mid element
        }
    }
    //in the end start==end and pointing to the largest number because of above 2 checks.
    //start and end always try to find max elemnt in above 2 checks
    //hence when they are pointing to just one elment that is maximum one..
    return arr[start];//or end as both points to same element.

}

}
