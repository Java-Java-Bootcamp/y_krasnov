package ru.otus.java.arrays;

import ru.otus.java.arrays.util.ArrayUtil;

public class Arrays {

    public int[] reverseArray(int[] array) {
        ArrayUtil.printArray(array);

        for (int i=0, b=array.length-1; i<array.length/2; i++, b--) {
            int temp = array[i];
            array[i] = array[b];
            array[b] = temp;
        }

        return array;

    }

    public float average(int[] array) {
        ArrayUtil.printArray(array);
        float sum = array.length;

        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        sum /= array.length;

        return sum;
    }
}