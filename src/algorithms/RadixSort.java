package algorithms;

import gui.SortingPanel;
import utils.DelayUtil;
import java.util.Arrays;

public class RadixSort {
    public static void sort(SortingPanel panel) {
        int[] arr = panel.getArray();
        int max = Arrays.stream(arr).max().orElse(0);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp, panel);
        }
    }

    private static void countSort(int[] arr, int exp, SortingPanel panel) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
        panel.setArray(arr);
        DelayUtil.sleep(100);
    }
}
