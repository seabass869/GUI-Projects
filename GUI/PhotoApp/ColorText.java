package GUI.PhotoApp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ColorText{
    private ColorButton button1, button2, button3, button4;
    private Jlabel label1, label2, label3, label4;

    public ColorText(){
        JFrame frame = new JFrame("Coloring App");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(2,1));
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(4,1));
        label1 = new JLabel("The is going to  "); 
        labelPanel.add(label1);
        JPanel buttonPanel = new JPanel();

        button1= new ColorButton();
        buttonPanel.add(button1);
        button1.addActionListener(e->changeText(button1) );
        frame.add(labelPanel);
        frame.setVisible(true);
    }

    public void ChangeText(ColorButton b){
        
    }
}