public class Task4_OptimalShippingCapacity {

    private static int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                days++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        return days;
    }

    public static int minimumCapacity(int[] weights, int days) {
        int lo = 0;
        int hi = 0;

        for (int w : weights) {
            lo = Math.max(lo, w);
            hi += w;
        }

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (daysNeeded(weights, mid) <= days) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        System.out.println(minimumCapacity(weights, days));
    }
}
