package sorting;

import java.util.Arrays;

/**
 *  
 * @author Jonathan
 */
public class Sorting {

    //helper method to print the array
    private static void printArray(int[] array) {
        //print out the array
        for (int i : array) {

            System.out.print(i + " ");
        }
        //just adding a line break
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        MergeSort ms = new MergeSort();
        InsertionSort is = new InsertionSort();
        BubbleSort bs = new BubbleSort();
        QuickSort qs = new QuickSort();

        int[] testArray1 = {5, 4, 3, 2, 1, 10, 9, 8, 7, 6};
        int[] testArray2 = {5, 4, 9, 8, 7, 6};
        int[] testArray3 = {7986, 45, 1, -6, 368, 0, 12, 9};
        int[] testArray4 = {-4, 0, -96, 4, 78, 2, 32, 1};
        int[] testArray5 = {5,9,7,6,4,3,1,0,79,10,-5,11};

        //**************************************************************************
        printArray(testArray1);
        printArray(ss.selection(testArray1));

        System.out.println();

        printArray(testArray2);
        printArray(is.iSortIntArray(testArray2));

        System.out.println();

        printArray(testArray3);
        printArray(ms.mSort(testArray3));

        System.out.println();

        printArray(testArray4);
        printArray(bs.bSort(testArray4));
        
        System.out.println();

        printArray(testArray5);
        qs.qSort(testArray5);
        // different way to print arrays out without helper
        System.out.println(Arrays.toString(testArray5));

    }

}
