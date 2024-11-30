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
public class LineSeg implements Shape{
    private Point position;
    private Color color;
    private Color fillColor;
    private HashMap<String,Double> properties;    

    public LineSeg() {
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
        this.properties.put("Length",properties.get("Length"));
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
        canvas.setColor(getColor());
        int length = (int) Math.round(getProperties().get("Length"));
        canvas.drawLine(getPosition().x, getPosition().y, getPosition().x + length, getPosition().y + length);
        
    }
    
    @Override
    public String toString() {
        String s =  "Line" + "," + color.getRed()+ ","+ color.getGreen() + ","+color.getBlue() +  "," + position.x +"," + position.y +"," + properties.get("Length");
        return s;
    }
    

}
