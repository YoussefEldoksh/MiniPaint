/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package minipaint;

import backend.Shape;
import java.util.ArrayList;

/**
 *
 * @author malak
 */
public interface DrawingEngine {
    public void addShape(Shape shape);
    public void removeShape(Shape shape) ;
    
    public ArrayList<Shape> getShapes();
    public void refresh(java.awt.Graphics canvas);  
}
