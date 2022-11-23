package Component.Coordinator;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import Const.MyConst;

public class TableCoordinator {
    
    private JScrollPane scroll = new JScrollPane();
    private JTable tblCoordinate = new JTable();
    private String columnName[] = {"Index", "IP Client", "Name Client", "IP Server", "Name Server", "Time"};
    private String data[][] = {
        {"1", "111.23.43.11", "NguyenThanhSang", "255.255.255.0", "NguyenThanhSang", "11:30:42 27/10/2011"},
        {"2", "255.255.255.0", "NguyenThiC", "111.23.43.11", "NguyenThanhSang", "08:12:38 28/10/2012"},
        {"3", "255.255.255.0", "NguyenThiC", "111.23.43.11", "NguyenThanhSang", "08:12:38 28/10/2012"},
        {"4", "255.255.255.0", "NguyenThiC", "111.23.43.11", "NguyenThanhSang", "08:12:38 28/10/2012"},
        {"5", "255.255.255.0", "NguyenThiC", "111.23.43.11", "NguyenThanhSang", "08:12:38 28/10/2012"},
        {"6", "255.255.255.0", "NguyenThiC", "111.23.43.11", "NguyenThanhSang", "08:12:38 28/10/2012"},
        {"7", "255.255.255.0", "NguyenThiC", "111.23.43.11", "NguyenThanhSang", "08:12:38 28/10/2012"},
        {"8", "255.255.255.0", "NguyenThiC", "111.23.43.11", "NguyenThanhSang", "08:12:38 28/10/2012"},
        {"9", "255.255.255.0", "NguyenThiC", "111.23.43.11", "NguyenThanhSang", "08:12:38 28/10/2012"},
        {"10", "255.255.255.0", "NguyenThiC", "111.23.43.11", "NguyenThanhSang", "08:12:38 28/10/2012"}};

    public TableCoordinator() {
        MyConst myConst = new MyConst();

        DefaultTableModel model = new DefaultTableModel(data, columnName);
    
        // set table
        tblCoordinate = new JTable(model);
        tblCoordinate.setEnabled(false);
        tblCoordinate.setShowGrid(true);
        tblCoordinate.setShowHorizontalLines(true);
        tblCoordinate.setShowVerticalLines(true);
        tblCoordinate.setGridColor(myConst.BLACK);
        tblCoordinate.setRowHeight(50);
        // set header
        JTableHeader header = tblCoordinate.getTableHeader();
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
        TableColumnModel columnModel = tblCoordinate.getColumnModel();
        columnModel.getColumn(0).setCellRenderer(centerRenderer2);
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setCellRenderer(centerRenderer);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setCellRenderer(centerRenderer);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setCellRenderer(centerRenderer);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setCellRenderer(centerRenderer);
        columnModel.getColumn(4).setPreferredWidth(150);
        columnModel.getColumn(5).setCellRenderer(centerRenderer);
        columnModel.getColumn(5).setPreferredWidth(150);

        JScrollPane scroll = new JScrollPane(tblCoordinate);
        scroll.setPreferredSize(new Dimension(800, 250));
        
        this.scroll = scroll;
    }

    public JScrollPane getScroll() {
        return scroll;
    }
    
}
