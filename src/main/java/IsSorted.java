// import 'Arrays' class from java.util package
import java.util.Arrays;

public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        // Arrays.sort(arr);
        // if(Arrays.compare(arr, Arrays.sort(arr))){

        // }

        // boolean defValue = false;
        
        // initialize iterator 'i' for while loop below
        int i = 1;
        // loop through given array 'arr' of integers
        while(i < arr.length){
            // if current index value is greater than last
            if(arr[i-1] < arr[i]){
                // continue on
            }
            // otw array 'arr' is not in Array.sort() fashion
            else{
                // return false (implicitly break out of loop in doing so)
                return false;
            }
            // increment by 1  to continue loop
            ++i;
        }
        // if reach end of 'arr' w/o throwing out an 'false' anywhere --- array 'arr' is sorted
        return true;
    }
}
