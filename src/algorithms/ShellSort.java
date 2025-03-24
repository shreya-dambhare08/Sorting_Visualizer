package algorithms;

import gui.SortingPanel;
import utils.DelayUtil;

public class ShellSort {
    public static void sort(SortingPanel panel) {
        int[] arr = panel.getArray();
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
                panel.setArray(arr);
                DelayUtil.sleep(50);
            }
        }
    }
}
