package sort;

import sort.basesrc.Util;
import sort.basesrc.RandomArray;

public class BubbleSort {

    public static void main(String[] args){

        RandomArray r = new RandomArray();
        int[] array = r.getArray();
        
        Util.print(array);
        bubbleSort(array);
        Util.print(array);
    }
    
    public static void bubbleSort(int[] array){

        for (int i = 0; i < array.length; i++){
            for (int j = array.length - 1; j > i; j--){
                if (array[j - 1] > array[j]){
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
