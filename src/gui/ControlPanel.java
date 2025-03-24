package gui;

import algorithms.*;
//import utils.DelayUtil;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    
    public ControlPanel(SortingPanel sortingPanel) {
        setLayout(new FlowLayout());

        JButton bubbleSortBtn = new JButton("Bubble Sort");
        bubbleSortBtn.addActionListener(e -> new Thread(() -> BubbleSort.sort(sortingPanel)).start());

        JButton selectionSortBtn = new JButton("Selection Sort");
        selectionSortBtn.addActionListener(e -> new Thread(() -> SelectionSort.sort(sortingPanel)).start());

        JButton insertionSortBtn = new JButton("Insertion Sort");
        insertionSortBtn.addActionListener(e -> new Thread(() -> InsertionSort.sort(sortingPanel)).start());

        JButton mergeSortBtn = new JButton("Merge Sort");
        mergeSortBtn.addActionListener(e -> new Thread(() -> MergeSort.sort(sortingPanel)).start());

        JButton quickSortBtn = new JButton("Quick Sort");
        quickSortBtn.addActionListener(e -> new Thread(() -> QuickSort.sort(sortingPanel)).start());

        JButton heapSortBtn = new JButton("Heap Sort");
        heapSortBtn.addActionListener(e -> new Thread(() -> HeapSort.sort(sortingPanel)).start());

        JButton radixSortBtn = new JButton("Radix Sort");
        radixSortBtn.addActionListener(e -> new Thread(() -> RadixSort.sort(sortingPanel)).start());

        JButton shellSortBtn = new JButton("Shell Sort");
        shellSortBtn.addActionListener(e -> new Thread(() -> ShellSort.sort(sortingPanel)).start());

        add(bubbleSortBtn);
        add(selectionSortBtn);
        add(insertionSortBtn);
        add(mergeSortBtn);
        add(quickSortBtn);
        add(heapSortBtn);
        add(radixSortBtn);
        add(shellSortBtn);



        

    }
}
