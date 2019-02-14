package sorting;

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

        int[] testArray1 = {5, 4, 3, 2, 1, 10, 9, 8, 7, 6};
        int[] testArray2 = {5, 4, 9, 8, 7, 6};
        int[] testArray3 = {7986, 45, 1, -6, 368, 0, 12, 9};
        int[] testArray4 = {-4, 0, -96, 4, 78, 2, 32, 1};

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

    }

}
