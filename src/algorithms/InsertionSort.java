package algorithms;

import gui.SortingPanel;
import utils.DelayUtil;

public class InsertionSort {
    public static void sort(SortingPanel panel) {
        int[] arr = panel.getArray();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            panel.setArray(arr);
            DelayUtil.sleep(50);
        }
    }
}
