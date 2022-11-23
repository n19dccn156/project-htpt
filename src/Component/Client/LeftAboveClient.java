package Component.Client;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

import Const.MyConst;

public class LeftAboveClient {
    private JPanel panel = new JPanel();
    private JLabel lblTitle = new JLabel();
    private JLabel lblState = new JLabel();
    private JLabel lblStateValue = new JLabel();
    private JLabel lblIpAddress = new JLabel();
    private JLabel lblPort = new JLabel();
    private JTextField tfIpAddress = new JTextField();
    private JTextField tfPort = new JTextField();
    private JButton btnStop = new JButton();
    private JButton btnConnect = new JButton();
    private boolean isConnect = false;
    public MyConst myConst = new MyConst();
    /***
        * Create the Panel, Label, TextField and Button
        * Use to setting default values of the component left above of client.
    */
    public LeftAboveClient() {
        JPanel panelTitle = new JPanel();
        JPanel panelState = new JPanel();
        JPanel panelIP = new JPanel();
        JPanel panelPort = new JPanel();
        JPanel panelAction = new JPanel();

        // set label
        lblTitle.setText("Connect Coordinator Server");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        
        lblState.setText("Connected");

        lblStateValue.setText(isConnect ? "TRUE" : "FALSE");
        lblStateValue.setForeground(isConnect ? myConst.DARK_GREEN : myConst.DARK_RED);

        lblIpAddress.setText("IP Address");

        lblPort.setText("Port");

        // set textfields
        if(this.isConnect) {
            tfIpAddress.setEnabled(false);
            tfPort.setEnabled(false);
            btnConnect.setEnabled(false);
        }
        tfIpAddress.setText("255.255.255.255");

        tfPort.setText("8081");

        // set button
        btnStop.setText("Stop");
        btnStop.setEnabled(isConnect);

        btnConnect.setText("Connect");
        btnConnect.setEnabled(!isConnect);

        // set panel
        panelTitle.setLayout(new GridLayout(1, 1));
        panelTitle.setBorder(new EmptyBorder(10, 20, 10, 10));        
        panelState.setLayout(new GridLayout(1, 2));
        panelState.setBorder(new EmptyBorder(10, 10, 10, 10));        
        panelIP.setLayout(new GridLayout(1, 2));   
        panelIP.setBorder(new EmptyBorder(10, 10, 10, 10));             
        panelPort.setLayout(new GridLayout(1, 2));  
        panelPort.setBorder(new EmptyBorder(10, 10, 10, 10));              
        panelAction.setLayout(new GridLayout(1, 2));
        panelAction.setBorder(new EmptyBorder(10, 10, 10, 10));                
        panel.setLayout(new GridLayout(5, 1));
        panel.setPreferredSize(new Dimension(280, 250));

        panelTitle.add(lblTitle);
        panelState.add(lblState);
        panelState.add(lblStateValue);
        panelIP.add(lblIpAddress);
        panelIP.add(tfIpAddress);
        panelPort.add(lblPort);
        panelPort.add(tfPort);
        panelAction.add(btnStop);
        panelAction.add(btnConnect);
        panel.add(panelTitle);
        panel.add(panelState);
        panel.add(panelIP);
        panel.add(panelPort);
        panel.add(panelAction);
        panel.setBorder(BorderFactory.createLineBorder(myConst.BLACK));
    }

    public void setLblStateValue(JLabel lblStateValue) {
        this.lblStateValue = lblStateValue;
    }

    public void setTfIpAddress(JTextField tfIpAddress) {
        this.tfIpAddress = tfIpAddress;
    }

    public void setTfPort(JTextField tfPort) {
        this.tfPort = tfPort;
    }

    public void setBtnStop(JButton btnStop) {
        this.btnStop = btnStop;
    }

    public void setBtnConnect(JButton btnConnect) {
        this.btnConnect = btnConnect;
    }

    public void setStateConnect(boolean isConnect) {
        this.isConnect = isConnect;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JLabel getLblTitle() {
        return lblTitle;
    }

    public JLabel getLblState() {
        return lblState;
    }

    public JLabel getLblStateValue() {
        return lblStateValue;
    }

    public JLabel getLblIpAddress() {
        return lblIpAddress;
    }

    public JLabel getLblPort() {
        return lblPort;
    }

    public JTextField getTfIpAddress() {
        return tfIpAddress;
    }

    public JTextField getTfPort() {
        return tfPort;
    }

    public JButton getBtnStop() {
        return btnStop;
    }

    public JButton getBtnConnect() {
        return btnConnect;
    }

    public boolean isConnect() {
        return isConnect;
    }

    public MyConst getMyConst() {
        return myConst;
    }

}
