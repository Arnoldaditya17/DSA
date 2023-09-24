import java.util.Arrays;

public class SelectionSort {
    public static void SelectionSort(int[] arr, int n) {
        
        
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[min_idx] > arr[j]) {
                    min_idx = j;

                }
            }
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;

        }

    }

    public static void main(String arg[]) {
        int arr[] = { 7, 8, 3, 1, 2 };
        int n = arr.length;
        SelectionSort(arr, n);
        System.out.println(Arrays.toString(arr));

    }

}
