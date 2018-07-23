/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimagesorter;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author James
 */
public class SetClassesTableRenderer extends DefaultTableCellRenderer{
    private int defaultClassRow;
    
    public SetClassesTableRenderer(int defaultClassRow) {
        this.defaultClassRow = defaultClassRow;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component r = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(defaultClassRow != -1 && row == defaultClassRow) {
            setBackground(Color.YELLOW);
            setForeground(Color.BLACK);
        } else {
            setBackground(table.getBackground());
            setForeground(table.getForeground());
        }       
        return r;    
    }
     
    public void setDefaultClass(int defaultClassRow){
        this.defaultClassRow = defaultClassRow;
    }
}
