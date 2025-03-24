package algorithms;

import gui.SortingPanel;
import utils.DelayUtil;

public class MergeSort {
    public static void sort(SortingPanel panel) {
        int[] arr = panel.getArray();
        mergeSort(arr, 0, arr.length - 1, panel);
    }

    private static void mergeSort(int[] arr, int left, int right, SortingPanel panel) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid, panel);
            mergeSort(arr, mid + 1, right, panel);
            merge(arr, left, mid, right, panel);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, SortingPanel panel) {
        int[] temp = arr.clone();
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) arr[k++] = temp[i++];
            else arr[k++] = temp[j++];
        }

        while (i <= mid) arr[k++] = temp[i++];
        while (j <= right) arr[k++] = temp[j++];

        panel.setArray(arr);
        DelayUtil.sleep(100);
    }
}
