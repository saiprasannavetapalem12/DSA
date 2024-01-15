package search;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr={'c','d','f','j'};//ascending order
        char t='f';
        System.out.println(smallletter(arr,t));

    }
    //ceiling-> Smallest large number after the target

    static char smallletter(char[] arr,char target)
    {
        int start=0; int end=(arr.length)-1;
        while (start<=end)
        {
            int mid= (start+end)/2;
            if (target<arr[mid])
            {
                end=mid-1;
            }
            else
            {

                start =mid+1;
            }

        }
        return arr[start % (arr.length)];

    }

}
