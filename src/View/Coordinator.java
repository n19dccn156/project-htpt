package View;

import java.awt.*;

import javax.swing.*;

import Component.Coordinator.MainCoordinator;

public class Coordinator extends JFrame{
    private MainCoordinator coordinator = new MainCoordinator();
    final int WIDTH = 850;
    final int HEIGHT = 350;

    public Coordinator() {
        this.add(coordinator.getPanel());
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.pack();
        this.setVisible(true);
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.setTitle("Coordinate Server");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Coordinator();
    }
}
