package partition;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PartitionAlgorithmsTest {

    @Test
    void testLomutoOnGivenArray() {
        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};
        int pivotIndex = PartitionAlgorithms.lomutoPartition(arr, 0, arr.length - 1);

        for (int i = 0; i < pivotIndex; i++) {
            assertTrue(arr[i] <= arr[pivotIndex]);
        }

        for (int i = pivotIndex + 1; i < arr.length; i++) {
            assertTrue(arr[i] >= arr[pivotIndex]);
        }
    }

    @Test
    void testHoareOnGivenArray() {
        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};
        int index = PartitionAlgorithms.hoarePartition(arr, 0, arr.length - 1);

        for (int i = 0; i <= index; i++) {
            assertTrue(arr[i] <= arr[index + 1] || arr[i] <= arr[0]);
        }
    }

    @Test
    void testSortedArray() {
        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        assertDoesNotThrow(() ->
            PartitionAlgorithms.lomutoPartition(arr, 0, arr.length - 1)
        );
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertDoesNotThrow(() ->
            PartitionAlgorithms.lomutoPartition(arr, 0, 0)
        );
    }
}

