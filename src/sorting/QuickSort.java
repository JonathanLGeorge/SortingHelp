/*
Divide and conquer!
use for larg data sets
recursive
Worst case is O(n^2) 

if you pick a bad pivot
if you pick first element orlast in a list thats already sorted youwill 
get worst case
we couldpick middle or median of first last or middle elements
random is best for large lists though so 
we should implement random into our code
giving us the best and Average case O(nlogn)
 */
package sorting;
import java.util.Arrays;
import java.util.Random;
        

public class QuickSort {
    
    //to make things simple, just get the array from user
   public void qSort(int[] list){
       //just calls the over loaded method with first and last index 
       qSort(list, 0, list.length-1);
   }
   
   private void qSort(int[] list, int low, int high){
       if(low < high+1){
           int p = partition(list, low, high);
           qSort(list, low, p-1);
           qSort(list, p + 1, high);
       }
   }
    
    private void swap(int[] list, int indexA, int indexB){
        int temp = list[indexA];
        list[indexA] = list[indexB];
        list[indexB] = temp;
    }
    
    //this will return a random pivot point to index between high and low
    private int pivot(int low, int high){
        Random r = new Random();
        
        return r.nextInt((high - low) + 1) + low;
    }
    
    private int partition(int[] list, int low, int high){
        swap(list, pivot(low, high), low);
        int pointer = low + 1;
        for(int i = pointer; i <= high; i++){
            if (list[i] < list[low]){
                swap(list, pointer++,i);
            }
        }
        swap(list, pointer-1, low);
        return pointer -1;
    }
    
}
