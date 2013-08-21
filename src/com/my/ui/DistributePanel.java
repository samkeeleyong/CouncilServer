/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.ui;

import com.my.model.Student;
import com.my.service.DistributeService;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author User
 */
public class DistributePanel extends javax.swing.JPanel {
    Student student = new Student();
    
    /**
     * Creates new form DistributePanel
     */
//    DistributeService ds = new DistributeService();;
    public DistributePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        colorRenderer1 = new com.my.ui.ColorRenderer();
        attendStudentDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        tffilterStudentId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbReceived = new javax.swing.JCheckBox();
        tffilterStudentCourse = new javax.swing.JTextField();
        tfFilterStudentName = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        studentList = ObservableCollections.observableList(new LinkedList<Student>());
        jButton1 = new javax.swing.JButton();

        colorRenderer1.setText("colorRenderer1");

        attendStudentDialog.setMinimumSize(new java.awt.Dimension(500, 500));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, studentList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${course}"));
        columnBinding.setColumnName("Course");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${received}"));
        columnBinding.setColumnName("Received");
        columnBinding.setColumnClass(Boolean.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(colorRenderer1);

        jButton2.setText("Finish");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tffilterStudentId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tffilterStudentIdKeyPressed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Name:");

        jLabel3.setText("Course:");

        jLabel4.setText("Received:");

        cbReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReceivedActionPerformed(evt);
            }
        });

        tffilterStudentCourse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tffilterStudentCourseKeyPressed(evt);
            }
        });

        tfFilterStudentName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfFilterStudentNameKeyPressed(evt);
            }
        });

        jButton3.setText("Filter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout attendStudentDialogLayout = new javax.swing.GroupLayout(attendStudentDialog.getContentPane());
        attendStudentDialog.getContentPane().setLayout(attendStudentDialogLayout);
        attendStudentDialogLayout.setHorizontalGroup(
            attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendStudentDialogLayout.createSequentialGroup()
                .addGroup(attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attendStudentDialogLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(attendStudentDialogLayout.createSequentialGroup()
                                .addGroup(attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tffilterStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(tfFilterStudentName)
                                    .addComponent(tffilterStudentCourse)))
                            .addGroup(attendStudentDialogLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbReceived))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(attendStudentDialogLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(attendStudentDialogLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        attendStudentDialogLayout.setVerticalGroup(
            attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendStudentDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tffilterStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfFilterStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tffilterStudentCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbReceived)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(attendStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton1.setText("Distribute [F1]");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        studentList.clear();
        studentList.addAll(new DistributeService().getAllStudents());
        jTable1.setRowSelectionInterval(0, 0);
        attendStudentDialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        student = studentList.get(jTable1.getSelectedRow());
        System.out.println(student.getName());
    }//GEN-LAST:event_jTable1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new DistributeService().studentGetDistributable(student);
        JOptionPane.showMessageDialog(this, student.getName()+" has received Distributable!", "Success!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbReceivedActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        filterDistributeStudents();
    }//GEN-LAST:event_jButton3ActionPerformed
    private void filterDistributeStudents(){
        Map param = new HashMap();
            param.put("id",tffilterStudentId.getText());
            param.put("name",tfFilterStudentName.getText());
            param.put("course",tffilterStudentCourse.getText());
            param.put("received",cbReceived.isSelected());
        studentList.clear();
        studentList.addAll(new DistributeService().filterStudents(param));
    }
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F1)
              jButton1ActionPerformed(null);
    }//GEN-LAST:event_jButton1KeyPressed

    private void tffilterStudentIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffilterStudentIdKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            filterDistributeStudents();
    }//GEN-LAST:event_tffilterStudentIdKeyPressed

    private void tfFilterStudentNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFilterStudentNameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            filterDistributeStudents();
    }//GEN-LAST:event_tfFilterStudentNameKeyPressed

    private void tffilterStudentCourseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffilterStudentCourseKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            filterDistributeStudents();
    }//GEN-LAST:event_tffilterStudentCourseKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        attendStudentDialog.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog attendStudentDialog;
    private javax.swing.JCheckBox cbReceived;
    private com.my.ui.ColorRenderer colorRenderer1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<Student> studentList;
    private javax.swing.JTextField tfFilterStudentName;
    private javax.swing.JTextField tffilterStudentCourse;
    private javax.swing.JTextField tffilterStudentId;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
