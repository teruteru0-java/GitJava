package sort.basesrc;

import java.util.*;

public class RandomArray {

    private Random random = new Random();
    private int[] array;

    // コンストラクタ(引数なし)
    public RandomArray(){
        resetArray();
    }

    // コンストラクタ(引数あり)
    public RandomArray(int len){
        resetArray(len);
    }

    public int[] getArray(){
        return this.array;
    }

    public void resetArray(){
        this.array = new int[10];

        for (int i = 0; i < this.array.length; i++){
            this.array[i] = this.random.nextInt(100);
        }
    }    

    public void resetArray(int len){
        this.array = new int[len];

        for (int i = 0; i < this.array.length; i++){
            this.array[i] = this.random.nextInt(100);
        }
    }
}
