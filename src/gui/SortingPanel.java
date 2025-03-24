package gui;

import javax.swing.*;
import java.awt.*;

public class SortingPanel extends JPanel {
    private int[] array;

    public SortingPanel() {
        array = generateRandomArray(50);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawArray(g);
    }

    private void drawArray(Graphics g) {
        int width = getWidth() / array.length;
        for (int i = 0; i < array.length; i++) {
            g.setColor(Color.BLUE);
            g.fillRect(i * width, getHeight() - array[i], width - 2, array[i]);
        }
    }

    public void setArray(int[] newArray) {
        this.array = newArray;
        repaint();
    }

    private int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 400 + 50);
        }
        return arr;
    }

    public int[] getArray() {
        return array;
    }
}
