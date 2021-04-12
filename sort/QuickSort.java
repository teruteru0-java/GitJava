package sort;

import sort.basesrc.Util;
import sort.basesrc.RandomArray;

public class QuickSort {
    
    public static void main(String[] args){

        RandomArray r = new RandomArray();
        int[] array = r.getArray();

        Util.print(array);
        quickSort(array, 0, array.length - 1);
        Util.print(array);
    }

    public static void quickSort(int[] array, int left, int right){

        if (left <= right){
            int half = array[(left + right) / 2]; // 中央値を取得
            int l = left;
            int r = right;

            while (l <= r){
                // 右から調べて、halfより大きい数があるまで走査し、該当するインデックスを取得
                while(array[l] < half){
                    l++;
                }
                // 左から調べて、halfより小さい数があるまで走査し、該当するインデックスを取得
                while (array[r] > half){
                    r--;
                }

                // もし該当するインデックスが見つかったら値を交換する
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;

                    // 交換後はさらに探索を行う
                    l ++;
                    r --;
                }
            }

            // whileを抜けたら、分割した左側に同じような操作を行う
            quickSort(array, left, r);
            // 分割した右側に同じような操作を行う
            quickSort(array, l, right);
        }
    }
}
