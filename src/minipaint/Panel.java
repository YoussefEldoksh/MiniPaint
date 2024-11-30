/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package minipaint;


import backend.Shape;
import java.awt.Graphics;
import java.util.ArrayList;


/**
 *
 * @author malak
 */
public class Panel extends javax.swing.JPanel implements DrawingEngine
{

    private ArrayList<Shape> shapes=new ArrayList<>();
    private ArrayList<Shape> circles =new ArrayList<>();
    /**
     * Creates new form panel
     */
    public Panel() {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    @Override
    protected void paintComponent(Graphics shape)
    {
        super.paintComponent(shape);
        System.out.println("paint component");
        for (Shape x : circles) {
            x.draw(shape);

        }
        
        for (Shape x : shapes) {
            x.draw(shape);
            
        }
    }
            
    
    @Override
    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }
    public void addCircle(Shape shape)
    {
        circles.add(shape);
    }
    @Override
    public void removeShape(Shape shape) {

        for (int i = 0; i < shapes.size(); i++) {
            if(shapes.get(i) == shape)
            {
                shapes.remove(i);
            }
        }
      
        
        
    }

    @Override
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public ArrayList<Shape> getCircles()
    {
        return circles;
    }
    @Override
    public void refresh(Graphics canvas) {
       this.repaint();
    }

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
