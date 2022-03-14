import java.util.Arrays;

public class BubbleSort {
    public static int[] unsortedArr = {21, 5, 2, 9, 10, 12, 4, 5, 7};

    public static int[] bubbleSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int b=arr.length-1; b>=i+1; b--) {
                if (arr[i] > arr[b]) {
                    int temp = b;
                    arr[b] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        bubbleSort(unsortedArr);
        System.out.println(Arrays.toString(unsortedArr));
    }
}
