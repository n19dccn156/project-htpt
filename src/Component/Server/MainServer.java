package Component.Server;

import java.awt.*;
import java.net.Inet4Address;
import java.net.UnknownHostException;

import javax.swing.*;

import Const.MyConst;

public class MainServer {
    
    private JPanel panel = new JPanel();
    private JLabel lblIpAddress = new JLabel("IP Address:");
    private JLabel lblName = new JLabel("Name:");
    private JLabel lblStateName = new JLabel("State:");
    private JLabel lblStateValue = new JLabel("OFF");
    private JButton btnIpAddress = new JButton();
    private JButton btnName = new JButton();
    private JButton btnState = new JButton("ON");
    private boolean state = false;
    private String ipServer = "";
    private String nameServer = "";


    public MainServer() {
        MyConst myConst = new MyConst();
        TableServer tblHistory = new TableServer();
        
        lblStateValue.setText(state ? "ON" : "OFF");
        lblStateValue.setForeground(state ? myConst.DARK_GREEN : myConst.DARK_RED);

        try {
            Inet4Address ipAddress = (Inet4Address) Inet4Address.getLocalHost();
            this.ipServer = ipAddress.getHostAddress();
            this.nameServer = ipAddress.getHostName();
            btnIpAddress.setText(ipServer);
            btnName.setText(nameServer);
            btnIpAddress.setEnabled(false);
            btnName.setEnabled(false);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        if(state)   btnState.setText("OFF");
        else    btnState.setText("ON");
        
        panel.add(lblIpAddress);
        panel.add(btnIpAddress);
        panel.add(lblName);
        panel.add(btnName);
        panel.add(lblStateName);
        panel.add(lblStateValue);
        panel.add(btnState);
        panel.add(tblHistory.getScroll());
    }

    public void setLblStateValue(String state, Color color) {
        this.lblStateValue.setForeground(color);
        this.lblStateValue.setText(state);
    }

    public void setBtnState(String state) {
        this.btnState.setText(state);
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public JPanel getPanel() {
        return panel;
    }


    
}
