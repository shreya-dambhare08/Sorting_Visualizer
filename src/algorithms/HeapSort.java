package algorithms;

import gui.SortingPanel;
import utils.DelayUtil;

public class HeapSort {
    public static void sort(SortingPanel panel) {
        int[] arr = panel.getArray();
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i, panel);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            panel.setArray(arr);
            DelayUtil.sleep(50);
            heapify(arr, i, 0, panel);
        }
    }

    private static void heapify(int[] arr, int n, int i, SortingPanel panel) {
        int largest = i; 
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            panel.setArray(arr);
            DelayUtil.sleep(50);
            heapify(arr, n, largest, panel);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
