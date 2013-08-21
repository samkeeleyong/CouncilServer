/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.ui;

import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author User
 */
public class ColorRenderer extends DefaultTableCellRenderer {
    int i = 0;
    public Component getTableCellRendererComponent
       (JTable table, Object value, boolean isSelected,
       boolean hasFocus, int row, int column){
        
        Boolean bool = (Boolean)table.getModel().getValueAt(row,column);
        
            
            if(bool)
                setBackground(Color.RED);

       
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column );

    }
    
}
