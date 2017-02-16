public class BinarySearch {

        /** What I want to do is take a sorted array A
          * and use pointers that keep track of the lowest possible 
          * value and highest possible value and find something in the 
          * middle that might equal the value I'm trying to find.
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

