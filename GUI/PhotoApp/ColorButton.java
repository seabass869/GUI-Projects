package GUI.PhotoApp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ColorButton{
    private String name;
    private Color color;
    public static Random rand = new Random();

    public ColorButton(){
        this.name = "Try Me";
        this.color = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255))
    }

    public Color getColor(){
        
    }

    public void setColor(Color g)
}