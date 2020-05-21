package arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {30, -2, 5, 11, 4, -5};

        for (int firstUnsorted = 1; firstUnsorted < a.length; firstUnsorted++) {
            int element = a[firstUnsorted];

            int i;
            for (i = firstUnsorted; i > 0 && a[i - 1] > element; i--) {
                a[i] = a[i - 1];
            }

            a[i] = element;
        }
    }
}
