import java.util.Arrays;

public class Insertionsort {
    public static int[] InsertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;

            }

        }
        return arr;
    }

    public static void main(String arg[]) {
        int arr[] = { 4, 8, 2, 6, 7, 9 };
        int n = arr.length;

        InsertionSort(arr, n);
        System.out.println(Arrays.toString(arr));

    }

}
