/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class InsertionSort extends Sorting{
    
    public int[] iSortIntArray(int[] mixedUpArray){
        int outer;
        int inner;
        int key;
        int temp;
        
        //outerLoop
        for(outer = 1; outer < mixedUpArray.length; outer++){
            key = mixedUpArray[outer];
            inner = outer - 1;
            
            while(inner >= 0 && key < mixedUpArray[inner]){
                temp = mixedUpArray[inner];
                mixedUpArray[inner] = mixedUpArray[inner + 1];
                mixedUpArray[inner + 1] = temp;
                inner--;
            }
        }

        return mixedUpArray;
    }
    
    public ArrayList<Integer> iSortIntArrayList(ArrayList<Integer>list){
        int outer;
        int inner;
        int key;
        int temp;
        
        for(outer = 1; outer < list.size(); outer++){
            key = list.get(outer);
            inner = outer - 1;
            
            while(inner >= 0 && key < list.get(inner)){
                temp = list.get(inner);
                list.set(inner,list.get(inner + 1));
                list.set(inner + 1, temp);
                inner--;
            }
        }
        
        return list;
    }
    
    
}
