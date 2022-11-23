package Component.Client;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import java.awt.*;

import Const.MyConst;

public class LeftBelowClient {
    private JPanel panel = new JPanel();
    private JLabel lblTitle = new JLabel();
    private JLabel lblIndex = new JLabel();
    private JLabel lblIpAddress = new JLabel();
    private JLabel lblName = new JLabel();
    private JTable tblHistory = new JTable();
    private String[] columnNames = { "Index", "IP Address", "Name" };
    private String[][] data = {
        {"1", "192.168.13.53", "nguyenthanhsang"},
        {"2", "192.168.13.53", "nguyenthanhsang"},
        {"3", "192.168.13.53", "nguyenthanhsang"},
        {"4", "192.168.13.53", "nguyenthanhsang"},
        {"5", "192.168.13.53", "nguyenthanhsang"}};
    public MyConst myConst = new MyConst();
    /***
        * Create the Panel, Label, TextField and Button
        * Use to setting default values of the component left above of client.
    */
    public LeftBelowClient() {
        JPanel line1 = new JPanel();
        // JTable tblHistory = new JTable(data, columnNames);

        // set table
        tblHistory = new JTable(data, columnNames);
        tblHistory.setEnabled(false);
        tblHistory.setRowHeight(30);
        tblHistory.getTableHeader().setBackground(myConst.LIGHT_GREY);
        tblHistory.getTableHeader().setForeground(myConst.DARK_GREY);

        JTableHeader header = tblHistory.getTableHeader();
        JLabel headerLabel = (JLabel) header.getDefaultRenderer();
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        header.setBackground(myConst.BEIGE);
        header.setForeground(myConst.BLACK);

        TableColumnModel columnModel = tblHistory.getColumnModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );

        columnModel.getColumn(0).setPreferredWidth(15);
        columnModel.getColumn(0).setCellRenderer(centerRenderer);
        columnModel.getColumn(1).setCellRenderer(centerRenderer);
        columnModel.getColumn(2).setCellRenderer(centerRenderer);

        // set label
        lblTitle.setText("History Server Connect");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setPreferredSize(new Dimension(280, 50));
        lblTitle.setBorder(new EmptyBorder(10, 40, 10, 0));        

        lblIndex.setText("Index");
        lblIndex.setBorder(new EmptyBorder(10, 20, 10, 0));        

        lblIpAddress.setText("IP Address");
        lblIpAddress.setBorder(new EmptyBorder(10, 20, 10, 0));        

        lblName.setText("Name");
        lblName.setBorder(new EmptyBorder(10, 30, 10, 0));        

        // set panel
        line1.setPreferredSize(new Dimension(280, 50));
        line1.setLayout(new GridLayout(1, 1));
        line1.setBorder(new EmptyBorder(10, 40, 10, 10));        

        panel.setLayout(new GridLayout(2, 1));
        panel.setPreferredSize(new Dimension(280, 230));
        line1.add(lblTitle);

        // set Scroll
        JScrollPane scroll = new JScrollPane(tblHistory);
        // scroll.setBounds(0, 0, 280, 200);
        panel.add(lblTitle);
        panel.add(scroll, BorderLayout.CENTER);
        panel.setBorder(BorderFactory.createLineBorder(myConst.BLACK));
    }

    public void setData(String name, String ipAddress) {
        this.data[4][0] = this.data[1][0];
        this.data[4][1] = this.data[1][1];
        this.data[4][2] = this.data[1][2];

        this.data[3][0] = this.data[2][0];
        this.data[3][1] = this.data[2][1];
        this.data[3][2] = this.data[2][2];

        this.data[2][0] = this.data[1][0];
        this.data[2][1] = this.data[1][1];
        this.data[2][2] = this.data[1][2];

        this.data[1][0] = this.data[0][0];
        this.data[1][1] = this.data[0][1];
        this.data[1][2] = this.data[0][2];

        this.data[0][0] = "1";
        this.data[0][1] = ipAddress;
        this.data[0][2] = name;
    }

    public JPanel getPanel() {
        return panel;
    }

    
}
