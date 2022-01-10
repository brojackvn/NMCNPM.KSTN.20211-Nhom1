package views.swing.table;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import views.swing.scrollbar.ScrollBarCustom;
import models.ModelAction;
import models.ModelActionMove;
        
public class Table extends JTable {
    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                return header;
            }     
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1) { 
                if (o instanceof ModelAction) {
                    ModelAction data = (ModelAction) o;
                    Delete cell = new Delete(data);
                    if (selected) {
                        cell.setBackground(new Color(239,244,255));
                    } else {
                        cell.setBackground(Color.WHITE);
                    }
                    return cell;
                } 
//                else if (o instanceof ModelActionMove) {
//                    ModelActionMove data = (ModelActionMove) o;
//                    Move cell = new Move(data);
//                    if (selected) {
//                        cell.setBackground(new Color(239,244,255));
//                    } else {
//                        cell.setBackground(Color.WHITE);
//                    }
//                    return cell;
//                } 
                else {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);
                    setBorder(new EmptyBorder(10, 5, 10, 5));
//                    setBorder(noFocusBorder);
                    com.setForeground(new Color(102,102,102));
                    if (selected) {
                        com.setBackground(new Color(239,244,255));
                    } else {
                        com.setBackground(Color.WHITE);
                    }
                    return com;
                }
            }
        });
    }

    @Override
    public TableCellEditor getCellEditor(int row, int col) {
        if (col == 4) {
            return new TableCellAction();
        } else {
            return super.getCellEditor(row, col);
        }
    }
    
    public void addRow(Object[] row) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(row);
    }

    public void removeRow(int row) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.removeRow(row);
        mod.fireTableStructureChanged();
    }
    
    public void clearRow() {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.setRowCount(0);
    }
    
    public void fixTable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.white);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5,10,5,10));
    }
    
    public ArrayList<String> readTable() {
        ArrayList<String> arr = new ArrayList<>();
        DefaultTableModel mod = (DefaultTableModel) getModel();
        System.out.println(mod.getRowCount());
        System.out.println(mod.getColumnCount());
        for (int i = 0; i < mod.getRowCount(); ++i) {   
            for (int j = 0; j < mod.getColumnCount(); ++j) {
                arr.add(mod.getValueAt(i, j).toString());
            }
        }
        return arr;
    }
}
