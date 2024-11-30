/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author malak
 */
public class Rectangle implements Shape{
    
    private Color color;
    private Color fillColor;
    private Point position;
    private HashMap<String,Double> properties;

    public Rectangle() {
        properties = new HashMap<>();
    }
    
    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

  
    
    


    @Override
    public void setProperties(HashMap<String,Double> properties)
    {
        if (properties != null) {
            this.properties.put("Length", properties.get("Length"));
            this.properties.put("Width", properties.get("Width"));
            this.properties.put("Fill", properties.get("Fill"));
        }        
    }
    @Override
    public HashMap<String, Double> getProperties() {
        return this.properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color color) {
        fillColor = color;
        
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        int width = (int) Math.round(getProperties().get("Width"));
        int length = (int) Math.round(getProperties().get("Length"));
        canvas.drawRect(getPosition().x,getPosition().y,width, length);
        
        
        if(getProperties().get("Fill").compareTo(1.0) == 0)
        {
            canvas.setColor(getFillColor());
            canvas.fillRect(getPosition().x,getPosition().y,width, length);
        }
        
    }

    @Override
    public String toString() {
        String s =  "Rectangle" + "," + color.getRed()+ ","+ color.getGreen() + ","+color.getBlue() + "," + position.x +"," + position.y +"," + properties.get("Length")+","+properties.get("Width");
        if(properties.get("Fill") == 1.0)
        {
            s += "," + fillColor.getRed()+"," + fillColor.getGreen()+ "," + fillColor.getBlue();
        }
        s+= ","+ properties.get("Fill");
        return s;   
    }
    

    
}
