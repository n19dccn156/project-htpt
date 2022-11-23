package View;
import java.awt.*;

import javax.swing.*;

import Component.Client.LeftAboveClient;
import Component.Client.LeftBelowClient;
import Component.Client.RightClient;
import Const.MyConst;

public class Client extends JFrame{
    public MyConst myConst = new MyConst();
    public LeftAboveClient leftAboveClientView = new LeftAboveClient();
    public LeftBelowClient leftBelowClientView = new LeftBelowClient();
    public RightClient rightClient = new RightClient();

    public final int WIDTH = 1250;
    public final int WIDTH_LEFT= 300;
    public final int WIDTH_RIGHT = 950;
    public final int HEIGHT = 500;

    public Client() {

        JPanel pnlLeft = new JPanel();
        pnlLeft.setBackground(myConst.LIGHT_GREY);
        pnlLeft.setPreferredSize(new Dimension(WIDTH_LEFT, HEIGHT));
        // pnlLeft.setBorder(BorderFactory.createLineBorder(myConst.BLACK));
        pnlLeft.add(leftAboveClientView.getPanel());
        pnlLeft.add(leftBelowClientView.getPanel());

        JPanel pnlRight = new JPanel();
        pnlRight.setBackground(myConst.LIGHT_GREY);
        pnlRight.setPreferredSize(new Dimension(WIDTH_RIGHT, HEIGHT));
        // pnlRight.setBorder(BorderFactory.createLineBorder(myConst.BLACK));
        pnlRight.add(rightClient.getPanel());

        this.add(pnlLeft, BorderLayout.WEST);
        this.add(pnlRight, BorderLayout.EAST);

        this.pack();
        this.setVisible(true);
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.setTitle("Schedule");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }    

    public LeftAboveClient getLeftAboveClientView() {
        return leftAboveClientView;
    }

    public LeftBelowClient getLeftBelowClientView() {
        return leftBelowClientView;
    }

    public RightClient getRightClient() {
        return rightClient;
    }

    public static void main(String[] args) {
        new Client();
    }
    
}
