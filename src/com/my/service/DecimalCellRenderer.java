/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.service;

import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author User
 */
public class DecimalCellRenderer extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent
       (JTable table, Object value, boolean isSelected,
       boolean hasFocus, int row, int column) 
    {
//        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        
        DecimalFormat df = new DecimalFormat("0.00");
        value = df.format((Number)value);
        setHorizontalAlignment(JLabel.RIGHT);
        
//            Number qty = (Number)value;
//            Number qtyBal = (Number)(table.getModel().getValueAt(table.getSelectedRow(), 4));
//            if((Integer)qty>(Integer)qtyBal)
//               JOptionPane.showMessageDialog(this, "Cannot borrow more than balance");
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column );

    }
    
    
    
}
