/** The Binary Search over a sorted list of values works similar to 
  * the way it works over a Binary Search Tree.
  * \theta(n) = log(n)
  * This search will check the element in the middle of the current
  * high and low bounds and see if that value is greater than, less than
  * or equal to the value we're seeking: the key. If it's greater than, 
  * it will set the high bound to the middle so that it can search 
  * for smaller numbers instead. If the number is less than, the 
  * algorithm will adjust the low bound so that it can search for elements
  * greater than the midpoint. It then repeats. If the midpoint is equal to 
  * the key value, then the algorithm returns the index at which the key was 
  * found. 
 **/

public class BinarySearch {

        /** What I want to do is take a sorted array A
          * and use pointers that keep track of the lowest possible 
          * value and highest possible value and find something in the 
          * middle that might equal the value I'm trying to find.(Iterative Solution).
          **/ 
        public static int targetIndex(int target, int[] inp) {
            /** The lowest possible index that TARGET could 
              * be at. 
            **/
            int low = 0;

            /** The highest possible index that TARGET could
              * be at. 
            **/
            int high = inp.length - 1; 

            /** Iterate over array and reassign a variable MIDPOINT 
              * that holds a reference as to whether we change our HIGH
              * pointer or LOW pointer. 
             **/
            while (low <= high) {
                /** Find a midpoint half the length of the 
                  * array greater than the lowest point. 
                **/
               int middle = low + (high - low) / 2;
               if (inp[middle] > inp[high]) {
                    low = middle;
                } else if (inp[middle] < inp[high]) {
                    high = middle;
                } else {
                    return middle;
                }
            }
            return -1;
        }
}

