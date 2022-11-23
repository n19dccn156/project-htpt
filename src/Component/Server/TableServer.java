package Component.Server;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import Const.MyConst;

public class TableServer {
    
    private JScrollPane scroll = new JScrollPane();
    private JTable tblHistory = new JTable();
    private String columnName[] = {"Index", "IP Client", "Name Client", "Time", "Description"};
    private String data[][] = {
        {"1", "111.23.43.11", "NguyenThanhSang", "11:30:42 27/10/2011", "SELECT data"},
        {"2", "255.255.255.0", "NguyenThiC", "08:12:38 28/10/2012", "INSERT data"}};

    public TableServer() {
        MyConst myConst = new MyConst();
        tblHistory = new JTable(data, columnName);
        tblHistory.setEnabled(false);
        tblHistory.setShowGrid(true);
        tblHistory.setShowHorizontalLines(true);
        tblHistory.setShowVerticalLines(true);
        tblHistory.setGridColor(myConst.BLACK);
        tblHistory.setRowHeight(50);
        // set header
        JTableHeader header = tblHistory.getTableHeader();
        header.setAlignmentX(30);
        header.setBackground(myConst.LIGHT_GREY);
        header.setForeground(myConst.BLACK);
        header.setPreferredSize(new Dimension(150, 50));

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
        TableColumnModel columnModel = tblHistory.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(0).setCellRenderer(centerRenderer2);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(1).setCellRenderer(centerRenderer);
        columnModel.getColumn(2).setPreferredWidth(120);
        columnModel.getColumn(2).setCellRenderer(centerRenderer);
        columnModel.getColumn(3).setPreferredWidth(120);
        columnModel.getColumn(3).setCellRenderer(centerRenderer);
        columnModel.getColumn(4).setPreferredWidth(300);
        columnModel.getColumn(4).setCellRenderer(centerRenderer);

        // panel.setPreferredSize(new Dimension(780, 485));
        // panel.setBorder(BorderFactory.createLineBorder(myConst.BLACK));

        scroll = new JScrollPane(tblHistory);
        scroll.setPreferredSize(new Dimension(800, 320));

        // panel.add(scroll);
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    
}
