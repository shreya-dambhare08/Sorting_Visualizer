package algorithms;

import gui.SortingPanel;
import utils.DelayUtil;

public class QuickSort {
    public static void sort(SortingPanel panel) {
        int[] arr = panel.getArray();
        quickSort(arr, 0, arr.length - 1, panel);
    }

    private static void quickSort(int[] arr, int low, int high, SortingPanel panel) {
        if (low < high) {
            int pi = partition(arr, low, high, panel);

            quickSort(arr, low, pi - 1, panel);
            quickSort(arr, pi + 1, high, panel);
        }
    }

    private static int partition(int[] arr, int low, int high, SortingPanel panel) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                panel.setArray(arr);
                DelayUtil.sleep(50);
            }
        }

        swap(arr, i + 1, high);
        panel.setArray(arr);
        DelayUtil.sleep(50);
        
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
