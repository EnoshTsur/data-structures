package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {30, -2, 5, 11, 4, -5};


        for (int lastSorted = a.length - 1; lastSorted > 0; lastSorted--) {
            for (int i = 0; i< lastSorted; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i , i + 1);
                }
            }
        }

        System.out.println(Arrays.toString(a));

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
