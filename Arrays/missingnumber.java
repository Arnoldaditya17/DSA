public class missingnumber {
    public static void main(String arg[]) {
        int array[] = { 1, 2, 4, 6, 7, 5 };
        int m = array.length;
        int arrsum = 0;

        int sum = (m + 1) * (m + 2) / 2;

        for (int i = 0; i < m; i++) {
            arrsum = arrsum + array[i];
        }
        int missing = sum - arrsum;
        System.out.println(missing);

    }

}