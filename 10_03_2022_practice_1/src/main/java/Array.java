import java.util.Arrays;

public class Array {
    public int[] startArr = new int[5];

    int capacity = 0;

    private int[] doubleArray(int[] startArr) {
        int[] array_2 = new int[startArr.length*2];
        for ( int i = 0; i < startArr.length; i++) {
            array_2[i] = startArr[i];
        }
            return array_2;
    }
    private int[] delete(int[] startArr, int idx) {
        int[] array_2 = new int[startArr.length-1];
        for (int i=0; i<idx; i++) {
            array_2[i] = startArr[i];
        }
        for (int i=idx; i<array_2.length; i++) {
            array_2[i] = startArr[i+1];
        }
        System.out.println(Arrays.toString(array_2));
        return array_2;
    }


    private int[] shiftRight(int[] startArr, int idx, int elem) {
        int[] array_2 = new int[startArr.length+1];
        array_2[idx] = elem;
        for (int i=0; i<idx; i++) {
            array_2[i] = startArr[i];
        }
        for (int i=idx+1; i<startArr.length; i++) {
            array_2[i] = startArr[i];
        }

        return array_2;
    }

    public void insert(int idx, int value){
        // увеличить или бросить экспшн
        if (idx > startArr.length-1) {
            startArr = doubleArray(startArr);
            startArr = shiftRight(startArr, idx, value);
        } else startArr = shiftRight(startArr, idx, value);
        System.out.println(Arrays.toString(startArr));
    }

    private int getElem(int idx) {
        int elem = 0;
        elem = startArr[idx];
        System.out.println("Элемент по индексу " + idx + " = "+ elem);
        return elem;
    }

    private int getSize(int[] startArr) {
        System.out.println("Длина данного массива = " + startArr.length);
        return startArr.length;
    }

    public static void main(String[] args) {

        Array arr = new Array();
        arr.insert(5, 4);
        arr.getElem(5);
        arr.startArr = arr.delete(arr.startArr, 5);
        arr.getSize(arr.startArr);

    }
}
