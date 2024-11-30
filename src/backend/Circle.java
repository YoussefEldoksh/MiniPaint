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

/**
 *
 * @author malak
 */
public class Circle implements Shape{

    private Point position;
    private HashMap<String, Double> properties;
    private Color color;
    private Color fillColor;

    public Circle() {
        this.properties = new HashMap<>();
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
    public void setProperties(HashMap<String, Double> properties) {
        this.properties.put("Radius", properties.get("Radius"));
        this.properties.put("Fill", properties.get("Fill"));
        
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
        return this.color;
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
        canvas.setColor(this.color);
        int radius = (int) Math.round(getProperties().get("Radius"));
        canvas.drawOval(getPosition().x, getPosition().y, 2*radius, 2*radius);
        
         if(getProperties().get("Fill").compareTo(1.0) == 0)
        {
            canvas.setColor(getFillColor());
            canvas.fillOval(getPosition().x,getPosition().y,2*radius, 2*radius);
        }
    }
    

    
    
    @Override
    public String toString() {
        String s =  "Circle" + "," + color.getRed()+ ","+ color.getGreen() +","+ color.getBlue()  +"," + position.x +"," + position.y +"," + properties.get("Radius");
        if(properties.get("Fill") == 1.0)
        {
            s += "," + fillColor.getRed()+"," + fillColor.getGreen()+ "," + fillColor.getBlue();
        }
        s+= ","+ properties.get("Fill");
        return s;
    }
}
