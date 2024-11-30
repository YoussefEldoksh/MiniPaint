/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import backend.Circle;
import backend.LineSeg;
import backend.Rectangle;
import backend.Shape;
import backend.Square;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import minipaint.Panel;
import minipaint.Panel;

/**
 *
 * @author malak
 */
public class Controls {

    private static Panel panel1;
    public Controls(Panel panel1) {
        this.panel1 = panel1;
    }
    
    public void saveToFile(Component frame)
    {
         JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(frame);
        File file = chooser.getSelectedFile();
        
        if (file == null) {
          JOptionPane.showMessageDialog(frame, "No file selected");
          return;
        }
        try{
             PrintWriter writer = new PrintWriter(file);
             for(int i=0; i<panel1.getShapes().size(); i++)
             {  
                writer.println(panel1.getShapes().get(i));
             }
             JOptionPane.showMessageDialog(frame, "File saved successfully");
             writer.close();
             
        }catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(frame, "File Not Found");
        }
    }
    public void loadFromFile(Component frame, javax.swing.JComboBox<String> jComboBox1, int rectangles, int circles,int lines, int squares)
    {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(frame);
        File file = chooser.getSelectedFile();
        
         if (file == null) {
          JOptionPane.showMessageDialog(frame, "No file selected");
          return;
        }
        
        try {
            panel1.getShapes().clear();
            jComboBox1.removeAllItems();
            jComboBox1.addItem("Choose Shape");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine())
            {
                String[] line = reader.nextLine().split(",");
                if(line[0].equals("Rectangle"))
                {
                    if(Double.parseDouble(line[line.length-1]) == 0.0)
                    {
                        Rectangle rectangle = new Rectangle();
                        
                        rectangle.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
                        rectangle.setPosition(point);
                        HashMap<String,Double> properties = new HashMap<>();
                        
                        properties.put("Length", Double.parseDouble(line[6]));
                        properties.put("Width", Double.parseDouble(line[7]));
                        properties.put("Fill", 0.0);
                        rectangle.setProperties(properties);
                        panel1.addShape(rectangle);
                        jComboBox1.addItem("Rectangle " + ++rectangles);
                        
                    }
                    else if(Double.parseDouble(line[line.length-1]) == 1.0)
                    {
                        Rectangle rectangle = new Rectangle();
                        
                        rectangle.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
                        rectangle.setPosition(point);
                        HashMap<String,Double> properties = new HashMap<>();
                        
                        properties.put("Length", Double.parseDouble(line[6]));
                        properties.put("Width", Double.parseDouble(line[7]));
                        properties.put("Fill", 1.0);
                        
                        rectangle.setProperties(properties);
                        rectangle.setFillColor(new Color(Integer.parseInt(line[8]),Integer.parseInt(line[9]),Integer.parseInt(line[10])));
                        panel1.addShape(rectangle);
                        jComboBox1.addItem("Rectangle " + ++rectangles);
                    }
                }
                if(line[0].equals("Circle"))
                {
                    if(Double.parseDouble(line[line.length-1]) == 0.0)
                    {
                        Circle circle = new Circle();
                        
                        circle.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
                        circle.setPosition(point);
                        HashMap<String,Double> properties = new HashMap<>();
                        
                        properties.put("Radius", Double.parseDouble(line[6]));
                        properties.put("Fill", 0.0);
                        circle.setProperties(properties);
                        panel1.addShape(circle);
                        jComboBox1.addItem("Circle " + ++circles);
                    }
                    else if(Double.parseDouble(line[line.length-1]) == 1.0)
                    {
                        Circle circle = new Circle();
                        
                        circle.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
                        circle.setPosition(point);
                        HashMap<String,Double> properties = new HashMap<>();
                        
                        properties.put("Radius", Double.parseDouble(line[6]));
                        properties.put("Fill", 1.0);
                        
                        circle.setProperties(properties);
                        circle.setFillColor(new Color(Integer.parseInt(line[7]),Integer.parseInt(line[8]),Integer.parseInt(line[9])));
                        panel1.addShape(circle);
                        jComboBox1.addItem("Circle " + ++circles);
                    }
                }                    
                if(line[0].equals("Square"))
                {
                    if(Double.parseDouble(line[line.length-1]) == 0.0)
                    {
                        Square square = new Square();
                        
                        square.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
                        square.setPosition(point);
                        HashMap<String,Double> properties = new HashMap<>();
                        
                        properties.put("Side", Double.parseDouble(line[6]));
                        properties.put("Fill", 0.0);
                        square.setProperties(properties);  
                        panel1.addShape(square);
                        jComboBox1.addItem("Square " + ++squares);
                    }
                    else if(Double.parseDouble(line[line.length-1]) == 1.0)
                    {
                        Square square = new Square();
                        
                        square.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
                        square.setPosition(point);
                        HashMap<String,Double> properties = new HashMap<>();
                        
                        properties.put("Side", Double.parseDouble(line[6]));
                        properties.put("Fill", 1.0);
                        
                        square.setProperties(properties);
                        square.setFillColor(new Color(Integer.parseInt(line[7]),Integer.parseInt(line[8]),Integer.parseInt(line[9])));
                        panel1.addShape(square);
                        jComboBox1.addItem("Square " + ++squares);
                    }                   
                    
                }            
                if(line[0].equals("Line"))
                {
                    
                        LineSeg l = new LineSeg();
                        
                        l.setColor(new Color(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])));
                        Point point = new Point(Integer.parseInt(line[4]),Integer.parseInt(line[5]));
                        l.setPosition(point);
                        HashMap<String,Double> properties = new HashMap<>();
                        
                        properties.put("Length", Double.parseDouble(line[6]));
                        l.setProperties(properties);
                        panel1.addShape(l);
                        jComboBox1.addItem("Line Segment " + ++lines);
                }               
            }
            panel1.repaint();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
    }
    public  void changePosition(int index, Component frame)
    {
        Shape shape = panel1.getShapes().get(index - 1);
            
                try{
                     int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x position"));
                     int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y position")); 
                     Point p = new Point(x, y);
                     shape.setPosition(p);
                }catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame,"Invalid input. Please enter a valid number.");
                    
                }
            
          panel1.repaint();        
    }
    public  void changeSize(int index, Component frame)
    {
        Shape shape = panel1.getShapes().get(index-1);
            if(shape instanceof Rectangle)
            {
                try{
                     double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length"));
                     double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width")); 
                     
                     if(length<0 || width<0)
                     {
                         JOptionPane.showMessageDialog(frame,"Invalid Value.");
                     }
                        
                    HashMap<String,Double> properties = new HashMap<>();
                    properties.put("Length", length);
                    properties.put("Width", width);
                    properties.put("Fill", shape.getProperties().get("Fill"));
                    shape.setProperties(properties);
                     
                }catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number.");
                  
                }
            }
            
            if(shape instanceof Circle)
            {
                 try{
                     double radius= Double.parseDouble(JOptionPane.showInputDialog("Enter Radius"));
                    
                     
                     if(radius<0)
                     {
                         JOptionPane.showMessageDialog(frame,"Invalid Value.");
                     }
                        
                    HashMap<String,Double> properties = new HashMap<>();
                    properties.put("Radius", radius);
                    properties.put("Fill", shape.getProperties().get("Fill"));
                    shape.setProperties(properties);
                     
                }catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number.");
                }
                
            }
            
            if(shape instanceof Square)
            {
                 try{
                     double side = Double.parseDouble(JOptionPane.showInputDialog("Enter length"));

                     if(side<0)
                     {
                         JOptionPane.showMessageDialog(frame,"Invalid Value.");
                     }
                        
                    HashMap<String,Double> properties = new HashMap<>();
                    properties.put("Side", side);
                    properties.put("Fill", shape.getProperties().get("Fill"));
                    shape.setProperties(properties);
                     
                }catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number.");
                    return;
                }
            }
            
            if(shape instanceof LineSeg)
            {
                 try{
                     double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length"));
                     
                     if(length<0)
                     {
                         JOptionPane.showMessageDialog(frame,"Invalid Value.");
                     }
                        
                    HashMap<String,Double> properties = new HashMap<>();
                    properties.put("Length", length);
                    shape.setProperties(properties);
                     
                }catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number.");
                    return;
                }
            }
            
          panel1.repaint();
    }
    
    
}
