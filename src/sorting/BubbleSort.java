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
public class BubbleSort {
    
    public int[] bSort(int[] list){
        int i;
        int j;
        int temp = 0;
        
        for(i = 0; i < list.length -1; i++){
            for(j = 0; j < list.length -1; j++){
                if(list[j]> list[j + 1]){
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        return list;
    }
}
