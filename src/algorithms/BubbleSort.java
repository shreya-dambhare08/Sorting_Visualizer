package algorithms;

import gui.SortingPanel;
import utils.DelayUtil;

public class BubbleSort {
    public static void sort(SortingPanel panel) {
        int[] arr = panel.getArray();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    panel.setArray(arr);
                    DelayUtil.sleep(50);
                }
            }
        }
    }
}
