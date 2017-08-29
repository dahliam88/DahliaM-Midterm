package math;
import java.util.*;
/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int n;
        n = missing(array, 0, array.length);
        System.out.println(n);
    }

    private static int missing(int[] array, int f, int l) {

        int mid = (l + f) / 2;

        if (array.length - 1 == f) {
            System.out.println("Find missing number ");
            return 0;
        }

        if (mid == f) {
            System.out.println(array[mid] + 1);
            return array[mid] + 1;
        }

        if ((mid + 1) == array[mid])
            return missing(array, mid, l);
        else
            return missing(array, f, mid);

    }

    }




