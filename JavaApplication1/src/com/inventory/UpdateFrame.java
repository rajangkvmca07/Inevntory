/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inventory;

/**
 *
 * @author rajan.chaturvedi
 */
import com.inventory.beans.Inventory;
import com.inventory.dao.InventryMgmtDao;
import javax.swing.JOptionPane;
public class UpdateFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateFrame
     */
    private InventorySystem parentFrame;
    private Inventory obj;
    private InventryMgmtDao dao;
    public UpdateFrame( InventorySystem parentFrame,Inventory obj,InventryMgmtDao dao) {
        this.parentFrame=parentFrame;
        this.obj=obj;
        this.dao=dao;
        initComponents();
        setText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        batteryModel = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        polarity = new javax.swing.JTextField();
        pinDetail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        batteryType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        connectorType = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        capacity = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onWindowClosed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        batteryModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batteryModelActionPerformed(evt);
            }
        });
        batteryModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                batteryModelKeyPressed(evt);
            }
        });
        jPanel3.add(batteryModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 12, 291, -1));

        brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                brandKeyPressed(evt);
            }
        });
        jPanel3.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 43, 291, -1));

        model.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modelKeyPressed(evt);
            }
        });
        jPanel3.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 80, 289, -1));

        polarity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                polarityKeyPressed(evt);
            }
        });
        jPanel3.add(polarity, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 111, 289, -1));

        pinDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinDetailKeyPressed(evt);
            }
        });
        jPanel3.add(pinDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 149, 289, -1));

        jLabel1.setText("Battery Model");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 15, -1, -1));

        jLabel2.setText("Brand");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 46, -1, -1));

        jLabel3.setText("Model");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 83, -1, -1));

        jLabel5.setText("Pin Detail");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 152, -1, -1));

        jLabel4.setText("Polarity");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 114, -1, -1));

        batteryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batteryTypeActionPerformed(evt);
            }
        });
        batteryType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                batteryTypeKeyPressed(evt);
            }
        });
        jPanel3.add(batteryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 190, 289, -1));

        jLabel6.setText("Battery Type");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 193, -1, -1));

        connectorType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                connectorTypeKeyPressed(evt);
            }
        });
        jPanel3.add(connectorType, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 228, 289, -1));

        jLabel7.setText("Connector Type");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 231, -1, -1));

        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeKeyPressed(evt);
            }
        });
        jPanel3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 266, 289, -1));

        jLabel8.setText("Type");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 269, -1, -1));

        jLabel9.setText("Capacity");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 308, -1, -1));

        capacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                capacityKeyPressed(evt);
            }
        });
        jPanel3.add(capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 305, 289, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Update");
        jButton1.setActionCommand("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 0, 93, 34));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 0, 90, 34));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 0, 93, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batteryModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batteryModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batteryModelActionPerformed

    private void batteryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batteryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batteryTypeActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
         this.parentFrame.enable();
         this.parentFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          // TODO add your handling code here:
        try{
        obj.setBatteryModel(batteryModel.getText());
        obj.setBrand(brand.getText());
        obj.setBatteryType(batteryType.getText());
        obj.setConnectortype(connectorType.getText());
        obj.setCapacity(capacity.getText());
        obj.setMobileModel(model.getText());
        obj.setPinDetail(pinDetail.getText());
        obj.setPolarity(polarity.getText());
        obj.setType(type.getText());
        dao.updateInventory(obj);
         this.setVisible(false);
         this.parentFrame.updateTable();
         this.parentFrame.enable();
         this.parentFrame.setVisible(true);
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void onWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowClosed
        // TODO add your handling code here:
         this.parentFrame.enable();
         this.parentFrame.setVisible(true);

    }//GEN-LAST:event_onWindowClosed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
             int response = JOptionPane.showConfirmDialog(null, "Do you want to Delete?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
             if (response == JOptionPane.YES_OPTION) {  
             dao.deleteRecord(obj.getId());
             this.setVisible(false);
             this.parentFrame.updateTable();
             this.parentFrame.enable();
             this.parentFrame.setVisible(true);
           }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void batteryModelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_batteryModelKeyPressed
       int key = evt.getKeyCode();
              if (key == evt.VK_ENTER){
               batteryModel.transferFocus();
              }
    }//GEN-LAST:event_batteryModelKeyPressed

    private void brandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandKeyPressed
        int key = evt.getKeyCode();
              if (key == evt.VK_ENTER){
               brand.transferFocus();
              }
    }//GEN-LAST:event_brandKeyPressed

    private void modelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelKeyPressed
        int key = evt.getKeyCode();
              if (key == evt.VK_ENTER){
               model.transferFocus();
              }
    }//GEN-LAST:event_modelKeyPressed

    private void polarityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_polarityKeyPressed
        int key = evt.getKeyCode();
              if (key == evt.VK_ENTER){
               polarity.transferFocus();
              }
    }//GEN-LAST:event_polarityKeyPressed

    private void pinDetailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinDetailKeyPressed
        int key = evt.getKeyCode();
              if (key == evt.VK_ENTER){
               pinDetail.transferFocus();
              }
    }//GEN-LAST:event_pinDetailKeyPressed

    private void batteryTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_batteryTypeKeyPressed
        int key = evt.getKeyCode();
              if (key == evt.VK_ENTER){
               batteryType.transferFocus();
              }
    }//GEN-LAST:event_batteryTypeKeyPressed

    private void connectorTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_connectorTypeKeyPressed
        int key = evt.getKeyCode();
              if (key == evt.VK_ENTER){
               connectorType.transferFocus();
              }
    }//GEN-LAST:event_connectorTypeKeyPressed

    private void typeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeKeyPressed
        int key = evt.getKeyCode();
              if (key == evt.VK_ENTER){
               type.transferFocus();
              }
    }//GEN-LAST:event_typeKeyPressed

    private void capacityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capacityKeyPressed
        int key = evt.getKeyCode();
              if (key == evt.VK_ENTER){
               capacity.transferFocus();
              }
    }//GEN-LAST:event_capacityKeyPressed

   private void setText(){
    batteryModel.setText(obj.getBatteryModel());
    brand.setText(obj.getBrand());
    batteryType.setText(obj.getBatteryType());
    connectorType.setText(obj.getConnectortype());
    capacity.setText(obj.getCapacity());
    model.setText(obj.getMobileModel());
    pinDetail.setText(obj.getPinDetail());
    polarity.setText(obj.getPolarity());
    type.setText(obj.getType());
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batteryModel;
    private javax.swing.JTextField batteryType;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField capacity;
    private javax.swing.JTextField connectorType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField model;
    private javax.swing.JTextField pinDetail;
    private javax.swing.JTextField polarity;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
