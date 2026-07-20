import java.util.Arrays;

public class Task3_MedianElement {

    public static double median(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};

        double result = median(arr);

        if (result == Math.floor(result)) {
            System.out.println((long) result);
        } else {
            System.out.println(result);
        }
    }
}
