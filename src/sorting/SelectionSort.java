
package sorting;

/**
 * @author Jonathan
 */


/*

Selection sort is O(n^2) but only has a key number of swaps 
n-1 times or O(n)

n(n-1)/2
*/

public class SelectionSort extends Sorting{
Sorting s;
    public int[] selection(int[] list) {

        int inner, outer, minIndex, minVal;
        int temp = 0;

        for (inner = 0; inner < list.length; inner++) {
            minVal = list[inner];
            minIndex = inner;

            for (outer = inner; outer < list.length; outer++) {
                if (list[outer] < minVal) {
                    minVal = list[outer];
                    minIndex = outer;
                }
            }

            if (minVal < list[inner]) {
                temp = list[inner];
                list[inner] = list[minIndex];
                list[minIndex] = temp;
            }

        }

        return list;
    }
    
}
