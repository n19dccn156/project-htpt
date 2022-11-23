package View;
import java.awt.*;

import javax.swing.*;

import Component.Server.MainServer;
// import Component.Server.BelowServer;

public class Server extends JFrame{
    private MainServer aboveServer = new MainServer();
    // private BelowServer belowServer = new BelowServer();
    final int WIDTH = 850;
    final int HEIGHT = 400;

    public Server() {
        this.add(aboveServer.getPanel());
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.pack();
        this.setVisible(true);
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.setTitle("Server Log");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Server();
    }
}
