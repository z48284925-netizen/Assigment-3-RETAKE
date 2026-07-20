import java.util.Arrays;

public class Task2_KthSmallestElement {

    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1, 5};
        int k = 3;

        System.out.println(kthSmallest(arr, k));
    }
}
