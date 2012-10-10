/**
 * This file is part of VisiCut.
 * Copyright (C) 2012 Thomas Oster <thomas.oster@rwth-aachen.de>
 * RWTH Aachen University - 52062 Aachen, Germany
 * 
 *     VisiCut is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * 
 *    VisiCut is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 * 
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with VisiCut.  If not, see <http://www.gnu.org/licenses/>.
 **/

/*
 * EditMaterialsDialog.java
 *
 * Created on 06.09.2011, 14:03:48
 */
package com.t_oster.visicut.gui;

import com.t_oster.visicut.gui.beans.EditableTableProvider;
import com.t_oster.visicut.model.*;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Thomas Oster <thomas.oster@rwth-aachen.de>
 */
public class EditMaterialsDialog extends javax.swing.JDialog implements EditableTableProvider
{

  protected List<MaterialProfile> currentMaterials = null;
  public static final String PROP_CURRENTMATERIALS = "currentMaterials";

  /**
   * Get the value of currentMaterials
   *
   * @return the value of currentMaterials
   */
  public List<MaterialProfile> getCurrentMaterials()
  {
    return currentMaterials;
  }

  /**
   * Set the value of currentMaterials
   *
   * @param currentMaterials new value of currentMaterials
   */
  public void setCurrentMaterials(List<MaterialProfile> currentMaterials)
  {
    List<MaterialProfile> oldCurrentMaterials = this.currentMaterials;
    this.currentMaterials = currentMaterials;
    firePropertyChange(PROP_CURRENTMATERIALS, oldCurrentMaterials, currentMaterials);
  }
  protected List<MaterialProfile> materials = null;
  public static final String PROP_MATERIALS = "materials";

  /**
   * Get the value of materials
   *
   * @return the value of materials
   */
  public List<MaterialProfile> getMaterials()
  {
    return materials;
  }

  /**
   * Set the value of materials
   *
   * @param materials new value of materials
   */
  public void setMaterials(List<MaterialProfile> materials)
  {
    List<MaterialProfile> oldMaterials = this.materials;
    this.materials = materials;
    firePropertyChange(PROP_MATERIALS, oldMaterials, materials);
    List<MaterialProfile> cur = new LinkedList<MaterialProfile>();
    if (materials != null)
    {
      cur.addAll(materials);
    }
    this.setCurrentMaterials(cur);
  }
  
  /** Creates new form EditMaterialsDialog */
  public EditMaterialsDialog(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

    jLabel1 = new javax.swing.JLabel();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    editableTablePanel1 = new com.t_oster.visicut.gui.beans.EditableTablePanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setName("Form"); // NOI18N

    org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.t_oster.visicut.gui.VisicutApp.class).getContext().getResourceMap(EditMaterialsDialog.class);
    jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
    jLabel1.setName("jLabel1"); // NOI18N

    jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
    jButton4.setName("jButton4"); // NOI18N
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jButton5.setText(resourceMap.getString("jButton5.text")); // NOI18N
    jButton5.setName("jButton5"); // NOI18N
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
      }
    });

    editableTablePanel1.setName("editableTablePanel1"); // NOI18N
    editableTablePanel1.setProvider(this);

    org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentMaterials}"), editableTablePanel1, org.jdesktop.beansbinding.BeanProperty.create("objects"), "materials");
    bindingGroup.addBinding(binding);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(editableTablePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
          .addComponent(jLabel1)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jButton5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton4)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(editableTablePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jButton4)
          .addComponent(jButton5))
        .addContainerGap())
    );

    bindingGroup.bind();

    pack();
  }// </editor-fold>//GEN-END:initComponents

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  this.setMaterials(this.getCurrentMaterials());
  this.setVisible(false);
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  this.setMaterials(null);
  this.setVisible(false);
}//GEN-LAST:event_jButton5ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private com.t_oster.visicut.gui.beans.EditableTablePanel editableTablePanel1;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JLabel jLabel1;
  private org.jdesktop.beansbinding.BindingGroup bindingGroup;
  // End of variables declaration//GEN-END:variables

  public Object getNewInstance()
  {
    MaterialProfile np = new MaterialProfile();
    return np;
  }

  public Object editObject(Object o)
  {
    EditMaterialDialog d = new EditMaterialDialog(null, true);
    d.setMaterial((MaterialProfile) o);
    d.setVisible(true);
    return d.getMaterial();
  }
}
