package com.boostmytool;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;

public class Welcomeframe {
    public static void main(String[] args) {
        JFrame frame=new JFrame("My App 1");    //creating a new frame
        JTextField box=new JTextField();        //creating a new textfield
        JButton button =new JButton("Italic");      //creating buttons
        JButton button1 =new JButton("Bold");
        JButton button2 =new JButton("Change font");
        JButton button3 =new JButton("Upper");
        JButton button4 =new JButton("Lower");
        JTextField tbox=new JTextField();
        JLabel label =new JLabel("Enter your Name");        //creating a label

        frame.add(button);              //adding buttons  to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.add(box);                 //adding textboxes and label to the frame
        frame.add(tbox);
        frame.add(label);
        Font fo =new Font("Serif",Font.ITALIC,20);    //creating object of Font class
        Font f1 =new Font("Serif",Font.BOLD,20);
        Font f2 =new Font("Times",Font.CENTER_BASELINE,20);

        frame.setSize(450,300);                 //setting the dimensions of the frame 
        button.setBounds(20,100,80,20);         //setting the dimensions of the buttons  
        button1.setBounds(170,100,80,20);
        button2.setBounds(320,100,80,20);
        button3.setBounds(100,150,80,20);
        button4.setBounds(250,150,80,20);
        box.setBounds(110,60,200,30);           //setting the dimensions of the textfield 
        tbox.setBounds(110,190,200,30);
        label.setBounds(160,30,100,19);

        button.addActionListener(new ActionListener() {                 //Adding Functionality for buttons
            @Override
            public void actionPerformed(ActionEvent e) {
                String a=box.getText();
                tbox.setText(a);
                tbox.setFont(fo);
            }
        });
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String a=box.getText();
        tbox.setText(a);
        tbox.setFont(f1);
        }
    });
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String a=box.getText();
        tbox.setText(a);
        tbox.setFont(f2);
      }
    });
    button3.addActionListener(new ActionListener() {            //for conversion to Upper case
        @Override
        public void actionPerformed(ActionEvent e) {
        String a=box.getText();
        tbox.setText(a.toUpperCase());
        }
    });
    button4.addActionListener(new ActionListener() {            //for conversion to Lower case
        @Override
        public void actionPerformed(ActionEvent e) {
        String a=box.getText();
        tbox.setText(a.toLowerCase());

        }
    });
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
