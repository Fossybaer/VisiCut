/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t_oster.uicomponents;

import com.t_oster.liblasercut.platform.Util;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JRadioButton;

/**
 *
 * @author Thomas Oster <thomas.oster@rwth-aachen.de>
 */
public class AncorPointPanel extends javax.swing.JPanel implements ActionListener
{

  @Override
  protected void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    
    // draw a nice rectangle to symbolize the object
    int x1,x2,y1,y2;
    x1=rTopLeft.getX()+rTopLeft.getWidth()/2;
    y1=rTopLeft.getY()+rTopLeft.getHeight()/2;
    x2=rBottomRight.getX()+rBottomRight.getWidth()/2;
    y2=rBottomRight.getY()+rBottomRight.getHeight()/2;
    
    g.setColor(Color.LIGHT_GRAY); // TODO get color from Look-and-feel
    g.fill3DRect(x1,y1,x2-x1,y2-y1, true);
    
    g.setColor(getForeground());
    g.draw3DRect(x1,y1,x2-x1,y2-y1, true);
    

  }
  
  public void actionPerformed(ActionEvent ae)
  {
    for (Entry<Position, JRadioButton> e : buttons.entrySet())
    {
      if (e.getValue().equals(ae.getSource()) && e.getValue().isSelected())
      {
        this.setPosition(e.getKey());
      }
    }
  }

  public enum Position
  {
    TOP_LEFT,
    TOP_CENTER,
    TOP_RIGHT,
    CENTER_LEFT,
    CENTER_CENTER,
    CENTER_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_CENTER,
    BOTTOM_RIGHT,
  }

  public static final String PROP_POSITION = "position";
  private Position position = Position.TOP_LEFT;
  private Map<Position,JRadioButton> buttons;

  /**
   * Get the value of position
   *
   * @return the value of position
   */
  public Position getPosition()
  {
    return position;
  }

  /**
   * Set the value of position
   *
   * @param position new value of position
   */
  public void setPosition(Position position)
  {
    if (Util.differ(this.position, position))
    {
      Position oldPosition = this.position;
      this.position = position;
      buttons.get(this.position).setSelected(true);
      firePropertyChange(PROP_POSITION, oldPosition, position);
    }
  }

  /**
   * Creates new form AncorPointPanel
   */
  public AncorPointPanel()
  {
    initComponents();
    buttons = new EnumMap<Position,JRadioButton>(Position.class);
    buttons.put(Position.TOP_LEFT, rTopLeft);
    buttons.put(Position.TOP_CENTER, rTopCenter);
    buttons.put(Position.TOP_RIGHT, rTopRight);
    buttons.put(Position.CENTER_LEFT, rCenterLeft);
    buttons.put(Position.CENTER_CENTER, rCenterCenter);
    buttons.put(Position.CENTER_RIGHT, rCenterRight);
    buttons.put(Position.BOTTOM_LEFT, rBottomLeft);
    buttons.put(Position.BOTTOM_CENTER, rBottomCenter);
    buttons.put(Position.BOTTOM_RIGHT, rBottomRight);
    for (JRadioButton b: buttons.values())
    {
      b.addActionListener(this);
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    radioButtonGroup = new javax.swing.ButtonGroup();
    rTopLeft = new javax.swing.JRadioButton();
    rTopCenter = new javax.swing.JRadioButton();
    rTopRight = new javax.swing.JRadioButton();
    rCenterLeft = new javax.swing.JRadioButton();
    rCenterCenter = new javax.swing.JRadioButton();
    rCenterRight = new javax.swing.JRadioButton();
    rBottomCenter = new javax.swing.JRadioButton();
    rBottomLeft = new javax.swing.JRadioButton();
    rBottomRight = new javax.swing.JRadioButton();

    radioButtonGroup.add(rTopLeft);
    rTopLeft.setSelected(true);

    radioButtonGroup.add(rTopCenter);

    radioButtonGroup.add(rTopRight);

    radioButtonGroup.add(rCenterLeft);

    radioButtonGroup.add(rCenterCenter);

    radioButtonGroup.add(rCenterRight);

    radioButtonGroup.add(rBottomCenter);

    radioButtonGroup.add(rBottomLeft);

    radioButtonGroup.add(rBottomRight);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(rTopLeft)
        .addGap(18, 18, 18)
        .addComponent(rTopCenter)
        .addGap(18, 18, 18)
        .addComponent(rTopRight))
      .addGroup(layout.createSequentialGroup()
        .addComponent(rCenterLeft)
        .addGap(18, 18, 18)
        .addComponent(rCenterCenter)
        .addGap(18, 18, 18)
        .addComponent(rCenterRight))
      .addGroup(layout.createSequentialGroup()
        .addComponent(rBottomLeft)
        .addGap(18, 18, 18)
        .addComponent(rBottomCenter)
        .addGap(18, 18, 18)
        .addComponent(rBottomRight))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(rTopRight)
          .addComponent(rTopCenter)
          .addComponent(rTopLeft))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(rCenterLeft)
          .addComponent(rCenterCenter)
          .addComponent(rCenterRight))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(rBottomRight)
          .addComponent(rBottomCenter)
          .addComponent(rBottomLeft)))
    );
  }// </editor-fold>//GEN-END:initComponents
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JRadioButton rBottomCenter;
  private javax.swing.JRadioButton rBottomLeft;
  private javax.swing.JRadioButton rBottomRight;
  private javax.swing.JRadioButton rCenterCenter;
  private javax.swing.JRadioButton rCenterLeft;
  private javax.swing.JRadioButton rCenterRight;
  private javax.swing.JRadioButton rTopCenter;
  private javax.swing.JRadioButton rTopLeft;
  private javax.swing.JRadioButton rTopRight;
  private javax.swing.ButtonGroup radioButtonGroup;
  // End of variables declaration//GEN-END:variables
}
