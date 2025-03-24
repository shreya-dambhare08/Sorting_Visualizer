package gui;

import javax.swing.*;
import java.awt.*;

public class SortingVisualizer extends JFrame {
    public SortingVisualizer() {
        setTitle("Sorting Visualizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Ensure SortingPanel and ControlPanel are imported
        SortingPanel sortingPanel = new SortingPanel();
        ControlPanel controlPanel = new ControlPanel(sortingPanel);

        setLayout(new BorderLayout());
        add(sortingPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new SortingVisualizer();
    }
}
