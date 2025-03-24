package algorithms;

import gui.SortingPanel;
import utils.DelayUtil;

public class SelectionSort {
    public static void sort(SortingPanel panel) {
        int[] arr = panel.getArray();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            panel.setArray(arr);
            DelayUtil.sleep(50);
        }
    }
}
