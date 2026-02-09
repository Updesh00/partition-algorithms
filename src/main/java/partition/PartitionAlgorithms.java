package partition;

/**
 * Implements Lomuto and Hoare partition schemes.
 * These methods are used by QuickSort.
 */
public class PartitionAlgorithms {

    /**
     * Lomuto partition scheme.
     */
    public static int lomutoPartition(int[] arr, int low, int high) {

        if (arr == null || arr.length == 0 || low >= high) {
            return low;
        }

        int pivot = arr[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    /**
     * Hoare partition scheme.
     */
    public static int hoarePartition(int[] arr, int low, int high) {

        if (arr == null || arr.length == 0) {
            return low;
        }

        int pivot = arr[low]; // first element as pivot
        int i = low - 1;
        int j = high + 1;

        while (true) {

            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }

            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

