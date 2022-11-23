package Component.Client;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.net.Inet4Address;
import java.net.UnknownHostException;

import Const.MyConst;

public class RightClient {
    private JPanel panel = new JPanel();
    public MyConst myConst = new MyConst();
    JComboBox<String> cbbWeek = new JComboBox<>();
    JButton btnSearch = new JButton("Search");
    JTable tblSchedule = new JTable();
    JButton btnPrev = new JButton("Prev");
    JButton btnNext = new JButton("Next");
    JLabel btnIP = new JLabel("");
    JLabel btnName = new JLabel("");

    private String ipClient;
    private String nameClient;;
    
    private String[] columnNames = { "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
    private String[][] dataOfWeek = {
        {"<html>M<br>o<br>r<br>n<br>i<br>n<br>g</html>", "<html>Phát triển hệ thống thông minh<br><br>Phòng: 2A23</html>", "", "", "", "", "", ""},
        {"<html>A<br>f<br>t<br>e<br>r<br>n<br>o<br>o<br>n</html>", "", "<html>Phát triển hệ thống thông minh<br><br>Phòng: 2A23</html>", "", "", "", "", ""}};
    private String week[] = { 
        "-----------Choose a week----------",
        "Week 01 [15/08/2022 -- 21/08/2022]", 
        "Week 02 [22/08/2022 -- 28/08/2022]", 
        "Week 03 [29/08/2022 -- 04/09/2022]", 
        "Week 04 [05/09/2022 -- 11/09/2022]",
        "Week 05 [12/09/2022 -- 19/09/2022]",
        "Week 06 [19/09/2022 -- 25/09/2022]",
        "Week 07 [26/09/2022 -- 02/10/2022]",
        "Week 08 [03/10/2022 -- 09/10/2022]",
        "Week 19 [10/10/2022 -- 16/10/2022]",
        "Week 10 [17/10/2022 -- 23/10/2022]",
        "Week 11 [24/10/2022 -- 30/10/2022]",
        "Week 12 [31/10/2022 -- 06/11/2022]",
        "Week 13 [07/11/2022 -- 13/11/2022]",
        "Week 14 [14/11/2022 -- 20/11/2022]",
        "Week 15 [21/11/2022 -- 27/11/2022]",
        "Week 16 [28/11/2022 -- 04/12/2022]",
        "Week 17 [05/12/2022 -- 11/12/2022]",
        "Week 18 [12/12/2022 -- 18/12/2022]",
        "Week 19 [19/12/2022 -- 25/12/2022]",
        "Week 20 [26/12/2022 -- 01/01/2023]"};
    /***
        * Create the Panel, Label, TextField and Button
        * Use to setting default values of the component left above of client.
    */
    public RightClient() {

        cbbWeek = new JComboBox<>(week);
        LeftAboveClient leftAboveClient = new LeftAboveClient();
        
        // set btnIP and btnName;
        try {
            Inet4Address ipAddress = (Inet4Address) Inet4Address.getLocalHost();
            this.ipClient = ipAddress.getHostAddress();
            this.nameClient = ipAddress.getHostName();
            btnIP.setText("IP Address:   " + this.ipClient);
            btnName.setText("Name:   " + this.nameClient);
            btnIP.setEnabled(false);
            btnName.setEnabled(false);
            btnIP.setBorder(new EmptyBorder(85, 0, 0, 0));   
            btnName.setBorder(new EmptyBorder(85, 0, 0, 0));   
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // set table
        tblSchedule = new JTable(dataOfWeek, columnNames);
        tblSchedule.setEnabled(false);
        tblSchedule.setShowGrid(true);
        tblSchedule.setShowHorizontalLines(true);
        tblSchedule.setShowVerticalLines(true);
        tblSchedule.setGridColor(myConst.BLACK);
        tblSchedule.setRowHeight(140);
        // set header
        JTableHeader header = tblSchedule.getTableHeader();
        header.setAlignmentX(30);
        header.setBackground(myConst.LIGHT_GREY);
        header.setForeground(myConst.BLACK);
        header.setPreferredSize(new Dimension(120, 50));
        JLabel headerLabel = (JLabel) header.getDefaultRenderer();
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        // set column
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JTextField.CENTER);
        centerRenderer.setBackground(myConst.BEIGE);
        centerRenderer.setForeground(myConst.BLACK);
        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        centerRenderer2.setHorizontalAlignment(JLabel.CENTER);
        centerRenderer2.setBackground(myConst.LIGHT_GREY);
        centerRenderer2.setForeground(myConst.BLACK);
        // set column
        TableColumnModel columnModel = tblSchedule.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(0).setCellRenderer(centerRenderer2);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(1).setCellRenderer(centerRenderer);
        columnModel.getColumn(2).setPreferredWidth(120);
        columnModel.getColumn(2).setCellRenderer(centerRenderer);
        columnModel.getColumn(3).setPreferredWidth(120);
        columnModel.getColumn(3).setCellRenderer(centerRenderer);
        columnModel.getColumn(4).setPreferredWidth(120);
        columnModel.getColumn(4).setCellRenderer(centerRenderer);
        columnModel.getColumn(5).setPreferredWidth(120);
        columnModel.getColumn(5).setCellRenderer(centerRenderer);
        columnModel.getColumn(6).setPreferredWidth(120);
        columnModel.getColumn(6).setCellRenderer(centerRenderer);
        columnModel.getColumn(7).setPreferredWidth(120);
        columnModel.getColumn(7).setCellRenderer(centerRenderer);

        panel.setPreferredSize(new Dimension(930, 485));
        panel.setBorder(BorderFactory.createLineBorder(myConst.BLACK));

        JScrollPane scroll = new JScrollPane(tblSchedule);
        scroll.setPreferredSize(new Dimension(910, 335));

        if(!leftAboveClient.isConnect()) {
            cbbWeek.setEnabled(false);
            btnSearch.setEnabled(false);
            btnPrev.setEnabled(false);
            btnNext.setEnabled(false);
        }        

        // add in panel
        panel.add(cbbWeek);
        panel.add(btnSearch);
        panel.add(scroll);
        panel.add(btnIP);
        panel.add(btnPrev);
        panel.add(btnNext);
        panel.add(btnName);

    }

    public JPanel getPanel() {
        return panel;
    }

}