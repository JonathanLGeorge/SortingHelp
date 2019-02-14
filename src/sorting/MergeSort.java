/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Jonathan
 */
public class MergeSort extends Sorting {

    // array, set counter, right or left of the set
    public  int[] mSort(int[] merge) {
        int midpoint = merge.length / 2;
        int[] left = new int[midpoint];
        int[] right;

        if (merge.length <= 1) {
            return merge;
        }

        //if array is even 
        if (merge.length % 2 == 0) {
            right = new int[midpoint];
        } // if array is odd
        else {
            right = new int[midpoint + 1];
            //in example this is array size 3 
        }

        //left side of array
        for (int i = 0; i < midpoint; i++) {
            left[i] = merge[i];
        }
       
        // right side of array
        for (int j = 0; j < right.length; j++) {
            right[j] = merge[midpoint + j];
        }
       
        int[] result = new int[merge.length];

        
        //recursive call for the left and then right side
        left = mSort(left);
        right = mSort(right);

   
        for (int j : left) {
            System.out.print(j + " ");
        }
        
        result = merge(left, right);
        return result;
    }

    public static int[] merge(int[] left, int[] right) {

        int[] sorted = new int[left.length + right.length];

        int resultsP = 0;
        int rightP = 0;
        int leftP = 0;

        while (leftP < left.length || rightP < right.length) {
            // imaging different arrays being merged together
            if (leftP < left.length && rightP < right.length) {

                if (left[leftP] < right[rightP]) {
                    sorted[resultsP++] = left[leftP++];
                } else {
                    sorted[resultsP++] = right[rightP++];
                }
             
            } //if only elements in left array, take element in left array asign
            //it to sorted with resultsP. incriment resultP and leftP
            else if (leftP < left.length) {

                sorted[resultsP++] = left[leftP++];
            } else if (rightP < right.length) {
                sorted[resultsP++] = right[rightP++];
            }

        }
        return sorted;
    }

}
