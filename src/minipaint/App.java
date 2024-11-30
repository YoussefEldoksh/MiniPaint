/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minipaint;

import backend.Controls;
import backend.Circle;
import backend.LineSeg;
import backend.Square;
import backend.Shape;
import backend.Rectangle;
import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author malak
 */
public class App extends javax.swing.JFrame {
    
    int circles = 0;
    int rectangles = 0;
    int squares = 0;
    int lines = 0;

    /**
     * Creates new form App
     */
    
  
    public App() {
        initComponents();
        setTitle("Art Space");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        colorizeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        circleButton = new javax.swing.JButton();
        lineSegButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();
        panel1 = new minipaint.Panel();
        loadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        resizeButton = new javax.swing.JButton();
        positionButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        brushButton = new javax.swing.JButton();
        brushColorButton = new javax.swing.JButton();
        EraserButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        colorizeButton.setText("Colorize");
        colorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Shape" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        circleButton.setText("Circle");
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        lineSegButton.setText("Line Segment");
        lineSegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineSegButtonActionPerformed(evt);
            }
        });

        squareButton.setText("Square");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        rectangleButton.setText("Rectangle");
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel1MouseDragged(evt);
            }
        });
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        resizeButton.setText("Resize");
        resizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtonActionPerformed(evt);
            }
        });

        positionButton.setText("Change Position");
        positionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear all");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        brushButton.setText("Brush");
        brushButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brushButtonMouseClicked(evt);
            }
        });
        brushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushButtonActionPerformed(evt);
            }
        });

        brushColorButton.setText("Brush color");
        brushColorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brushColorButtonMouseClicked(evt);
            }
        });
        brushColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushColorButtonActionPerformed(evt);
            }
        });

        EraserButton.setText("Eraser");
        EraserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EraserButtonMouseClicked(evt);
            }
        });
        EraserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EraserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorizeButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brushButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EraserButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(brushColorButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(positionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(circleButton)
                .addGap(26, 26, 26)
                .addComponent(lineSegButton)
                .addGap(22, 22, 22)
                .addComponent(squareButton)
                .addGap(18, 18, 18)
                .addComponent(rectangleButton)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circleButton)
                    .addComponent(lineSegButton)
                    .addComponent(squareButton)
                    .addComponent(rectangleButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorizeButton)
                            .addComponent(deleteButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadButton)
                            .addComponent(saveButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resizeButton)
                            .addComponent(brushButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brushColorButton)
                        .addGap(12, 12, 12)
                        .addComponent(positionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EraserButton)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void colorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeButtonActionPerformed
        // TODO add your handling code here:
        toggled = false;
        int index=jComboBox1.getSelectedIndex();
        if (index > 0) {
            Color c = JColorChooser.showDialog(this, "Choose color", Color.yellow);
            Shape s = panel1.getShapes().get(index-1);
            
            s.setColor(c);
            if(!(s instanceof LineSeg))
            { 
                int b = JOptionPane.showConfirmDialog(this, "Do wish to choose a fill color ?");
                if(b == 0)
                {
                     Color c2 = JColorChooser.showDialog(this, "Choose color", Color.yellow);
                     s.setFillColor(c2);
                     s.getProperties().put("Fill",1.0);
                     s.setProperties(s.getProperties());
                }   
            } 
            panel1.repaint();
        }
        
    }//GEN-LAST:event_colorizeButtonActionPerformed

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        toggled = false;
        try{
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y"));
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius"));
        if(radius<0)
        {
            JOptionPane.showMessageDialog(this, "Invalid Input.");
            return;
        }
        
        Circle circle = new Circle();
        Point p = new Point(x, y);    
        circle.setPosition(p);
        circle.setColor(Color.black);
        
        HashMap<String,Double> properties = new HashMap<>();
        properties.put("Radius", radius);
        properties.put("Fill", 0.0);
        circle.setProperties(properties);
        
        
        panel1.addShape(circle);
        panel1.repaint();
        jComboBox1.addItem("Circle " + ++circles);
        

            } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
         }     
    }//GEN-LAST:event_circleButtonActionPerformed

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed
        toggled = false;
        try{ 
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y"));
        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width"));
        if(length<0|| width<0)
        {
            JOptionPane.showMessageDialog(this, "Invalid Input.");
            return;
            
        }
        
        Rectangle rectangle = new Rectangle();
        Point p = new Point(x, y);    
        rectangle.setPosition(p);
        rectangle.setColor(Color.black);
        HashMap<String,Double> properties = new HashMap<>();
        properties.put("Length", length);
        properties.put("Width", width);
        properties.put("Fill", 0.0);
        rectangle.setProperties(properties);
        
        panel1.addShape(rectangle);
        panel1.repaint();
        jComboBox1.addItem("Rectangle " + ++rectangles);
        

        
        } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
         }

        
    }//GEN-LAST:event_rectangleButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        toggled = false;
        int index=jComboBox1.getSelectedIndex();
        if (index > 0) {
            panel1.removeShape(panel1.getShapes().get(index-1));
            jComboBox1.removeItemAt(index);
            panel1.repaint();
        }
       
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        // TODO add your handling code here:
        toggled = false;
        try{
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y"));
        double side = Double.parseDouble(JOptionPane.showInputDialog("Enter side"));
        if(side<0)
        {
            JOptionPane.showMessageDialog(this, "Invalid Input.");
            return;
        }
                
        Square square = new Square();
        Point p = new Point(x, y);    
        square.setPosition(p);
        square.setColor(Color.black);
        HashMap<String,Double> properties = new HashMap<>();
        properties.put("Side", side);
        properties.put("Fill", 0.0);
        square.setProperties(properties);
        
        panel1.addShape(square);
        panel1.repaint();
        jComboBox1.addItem("Square " + ++squares);
        
       
        } catch (NumberFormatException ex) {
              JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }//GEN-LAST:event_squareButtonActionPerformed

    private void lineSegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineSegButtonActionPerformed
        // TODO add your handling code here:
        toggled = false;
       try{
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y"));
        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length"));
        
        if(length<0)
        {
            JOptionPane.showMessageDialog(this, "Invalid Input.");
            return;
           
        }
                
        LineSeg line = new LineSeg();
        Point p = new Point(x, y);    
        line.setPosition(p);
        line.setColor(Color.black);
        HashMap<String,Double> properties = new HashMap<>();
        properties.put("Length", length);
        line.setProperties(properties);
        
        panel1.addShape(line);
        panel1.repaint();
        jComboBox1.addItem("Line Segment " + ++lines);

        } catch (NumberFormatException ex) {
             JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
             
        }
    }//GEN-LAST:event_lineSegButtonActionPerformed

    
    
    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
        toggled = false;
        
        Controls control = new Controls(panel1);
        control.loadFromFile(this, jComboBox1, rectangles, circles, lines, squares);
        
//        JFileChooser chooser = new JFileChooser();
//        chooser.showOpenDialog(this);
//        File file = chooser.getSelectedFile();
//        
//         if (file == null) {
//          JOptionPane.showMessageDialog(this, "No file selected");
//          return;
//        }
//        
//        try {
//            panel1.getShapes().clear();
//            jComboBox1.removeAllItems();
//            jComboBox1.addItem("Choose Shape");
//            Scanner reader = new Scanner(file);
//            while(reader.hasNextLine())
//            {
//                String[] line = reader.nextLine().split(",");
//                if(line[0].equals("Rectangle"))
//                {
//                    if(Double.parseDouble(line[line.length-1]) == 0.0)
//                    {
//                        Rectangle rectangle = new Rectangle();
//                        
//                        rectangle.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
//                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
//                        rectangle.setPosition(point);
//                        HashMap<String,Double> properties = new HashMap<>();
//                        
//                        properties.put("Length", Double.parseDouble(line[6]));
//                        properties.put("Width", Double.parseDouble(line[7]));
//                        properties.put("Fill", 0.0);
//                        rectangle.setProperties(properties);
//                        panel1.addShape(rectangle);
//                        jComboBox1.addItem("Rectangle " + ++rectangles);
//                        
//                    }
//                    else if(Double.parseDouble(line[line.length-1]) == 1.0)
//                    {
//                        Rectangle rectangle = new Rectangle();
//                        
//                        rectangle.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
//                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
//                        rectangle.setPosition(point);
//                        HashMap<String,Double> properties = new HashMap<>();
//                        
//                        properties.put("Length", Double.parseDouble(line[6]));
//                        properties.put("Width", Double.parseDouble(line[7]));
//                        properties.put("Fill", 1.0);
//                        
//                        rectangle.setProperties(properties);
//                        rectangle.setFillColor(new Color(Integer.parseInt(line[8]),Integer.parseInt(line[9]),Integer.parseInt(line[10])));
//                        panel1.addShape(rectangle);
//                        jComboBox1.addItem("Rectangle " + ++rectangles);
//                    }
//                }
//                if(line[0].equals("Circle"))
//                {
//                    if(Double.parseDouble(line[line.length-1]) == 0.0)
//                    {
//                        Circle circle = new Circle();
//                        
//                        circle.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
//                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
//                        circle.setPosition(point);
//                        HashMap<String,Double> properties = new HashMap<>();
//                        
//                        properties.put("Radius", Double.parseDouble(line[6]));
//                        properties.put("Fill", 0.0);
//                        circle.setProperties(properties);
//                        panel1.addShape(circle);
//                        jComboBox1.addItem("Circle " + ++circles);
//                    }
//                    else if(Double.parseDouble(line[line.length-1]) == 1.0)
//                    {
//                        Circle circle = new Circle();
//                        
//                        circle.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
//                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
//                        circle.setPosition(point);
//                        HashMap<String,Double> properties = new HashMap<>();
//                        
//                        properties.put("Radius", Double.parseDouble(line[6]));
//                        properties.put("Fill", 1.0);
//                        
//                        circle.setProperties(properties);
//                        circle.setFillColor(new Color(Integer.parseInt(line[7]),Integer.parseInt(line[8]),Integer.parseInt(line[9])));
//                        panel1.addShape(circle);
//                        jComboBox1.addItem("Circle " + ++circles);
//                    }
//                }                    
//                if(line[0].equals("Square"))
//                {
//                    if(Double.parseDouble(line[line.length-1]) == 0.0)
//                    {
//                        Square square = new Square();
//                        
//                        square.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
//                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
//                        square.setPosition(point);
//                        HashMap<String,Double> properties = new HashMap<>();
//                        
//                        properties.put("Side", Double.parseDouble(line[6]));
//                        properties.put("Fill", 0.0);
//                        square.setProperties(properties);  
//                        panel1.addShape(square);
//                        jComboBox1.addItem("Square " + ++squares);
//                    }
//                    else if(Double.parseDouble(line[line.length-1]) == 1.0)
//                    {
//                        Square square = new Square();
//                        
//                        square.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
//                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
//                        square.setPosition(point);
//                        HashMap<String,Double> properties = new HashMap<>();
//                        
//                        properties.put("Side", Double.parseDouble(line[6]));
//                        properties.put("Fill", 1.0);
//                        
//                        square.setProperties(properties);
//                        square.setFillColor(new Color(Integer.parseInt(line[7]),Integer.parseInt(line[8]),Integer.parseInt(line[9])));
//                        panel1.addShape(square);
//                        jComboBox1.addItem("Square " + ++squares);
//                    }                   
//                    
//                }            
//                if(line[0].equals("Line"))
//                {
//                    
//                        LineSeg l = new LineSeg();
//                        
//                        l.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
//                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
//                        l.setPosition(point);
//                        HashMap<String,Double> properties = new HashMap<>();
//                        
//                        properties.put("Length", Double.parseDouble(line[6]));
//                        l.setProperties(properties);
//                        panel1.addShape(l);
//                        jComboBox1.addItem("Line Segment " + ++lines);
//                }               
//            }
//            panel1.repaint();
//        } catch (FileNotFoundException ex) {
//            System.out.println("File Not Found");
//        }
                
        
    }//GEN-LAST:event_loadButtonActionPerformed
 
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        toggled = false;
        
        Controls control = new Controls(panel1);
        control.saveToFile(this);
        
//        JFileChooser chooser = new JFileChooser();
//        chooser.showSaveDialog(this);
//        File file = chooser.getSelectedFile();
//        
//        if (file == null) {
//          JOptionPane.showMessageDialog(this, "No file selected");
//          return;
//        }
//        try{
//             PrintWriter writer = new PrintWriter(file);
//             for(int i=0; i<panel1.getShapes().size(); i++)
//             {  
//                System.out.println(panel1.getShapes().get(i));
//                writer.println(panel1.getShapes().get(i));
//             }
//             JOptionPane.showMessageDialog(this, "File saved successfully");
//             writer.close();
//             
//        }catch(FileNotFoundException ex)
//        {
//            JOptionPane.showMessageDialog(this, "File Not Found");
//        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        // TODO add your handling code here:
        toggled = false;

        int index = jComboBox1.getSelectedIndex();
        Controls control = new Controls(panel1);
        if(index>0)
        {
             control.changeSize(index, this);
        }
    }//GEN-LAST:event_resizeButtonActionPerformed

    private void positionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionButtonActionPerformed
        // TODO add your handling code here:
        toggled = false;
        
        
        int index = jComboBox1.getSelectedIndex();
        Controls control = new Controls(panel1);
        if(index>0)
        {
            control.changePosition(index,this);
            
        }
    }//GEN-LAST:event_positionButtonActionPerformed

     
       boolean toggled = false;
       Color brushColor;
       int thickness;
    private void panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MousePressed
        // TODO add your handling code here:
              
              if(toggled  )
              {
                  Circle circle = new Circle();
                  Point p = new Point(evt.getX(), evt.getY());
                  circle.setPosition(p);
                  circle.setColor(brushColor);

                  HashMap<String, Double> properties = new HashMap<>();
                  properties.put("Radius",(double)thickness);
                  properties.put("Fill", 1.0);
                  circle.setFillColor(brushColor);
                  circle.setProperties(properties);
                  panel1.addCircle(circle);
                  repaint();
              }
    }//GEN-LAST:event_panel1MousePressed

    
    private void panel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseDragged
        // TODO add your handling code here:
              if(toggled )
                {
//                 Graphics g = panel1.getGraphics(); 
//                g.setColor(brushColor);         
//                g.fillOval(evt.getX(), evt.getY(), thickness, thickness); 
//                drawings.add(g);
//                g.dispose(); 
                  Circle circle = new Circle();
                  Point p = new Point(evt.getX(), evt.getY());
                  circle.setPosition(p);
                  circle.setColor(brushColor);

                  HashMap<String, Double> properties = new HashMap<>();
                  properties.put("Radius",(double)thickness);
                  properties.put("Fill", 1.0);
                  circle.setFillColor(brushColor);
                  circle.setProperties(properties);
                  panel1.addCircle(circle);
                  repaint();
              }
        
    }//GEN-LAST:event_panel1MouseDragged

    private void panel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_panel1MouseReleased

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        panel1.getShapes().clear();
        panel1.getCircles().clear();
        circles = 0;
        rectangles = 0;
        lines = 0;
        squares = 0 ;
        panel1.repaint();
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Choose Shape");
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void brushButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushButtonActionPerformed
        // TODO add your handling code here:
        toggled = false;
        if(!toggled ) {
            try{
                thickness = Integer.parseInt(JOptionPane.showInputDialog(this, "Choose Brush Thickness"));
            }catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Invalid Number");
                return;
            }
        }
        toggled = !toggled;
        brushButtonClicked = !brushButtonClicked;
        brushColor = Color.BLACK;
    }//GEN-LAST:event_brushButtonActionPerformed

    private void brushButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brushButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_brushButtonMouseClicked

    private void brushColorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brushColorButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_brushColorButtonMouseClicked
   
    boolean brushButtonClicked = false;
    
    private void brushColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushColorButtonActionPerformed
        // TODO add your handling code here:
        if(brushButtonClicked)
        {
            brushColor = JColorChooser.showDialog(this, "Choose color", Color.yellow);
        }
    }//GEN-LAST:event_brushColorButtonActionPerformed

    private void EraserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EraserButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EraserButtonMouseClicked

    private void EraserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EraserButtonActionPerformed
        // TODO add your handling code here:
        toggled = false;
        if(!toggled) {
            try{
                thickness = Integer.parseInt(JOptionPane.showInputDialog(this, "Choose Brush Thickness"));
            }catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Invalid Number");
                return;
            }
        }
        toggled = !toggled;
        brushButtonClicked = false;
        brushColor = Color.WHITE;
    }//GEN-LAST:event_EraserButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EraserButton;
    private javax.swing.JButton brushButton;
    private javax.swing.JButton brushColorButton;
    private javax.swing.JButton circleButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton colorizeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JButton lineSegButton;
    private javax.swing.JButton loadButton;
    private minipaint.Panel panel1;
    private javax.swing.JButton positionButton;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JButton resizeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton squareButton;
    // End of variables declaration//GEN-END:variables
}
