package com.company;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    createWindow();
    }

    // Creating window
    public static void createWindow() {
        //Create and set up the window.
        JFrame frame = new JFrame("Katie's Window");
        //Making sure when window is closed the application stops
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Creating Jlabel inside the window-can contain image or text
        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        //Adding JLabel to JFrame
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        // Window appears in middle of screen
        frame.setLocationRelativeTo(null);
        //Automatically setting the size of the window
        frame.pack();
        // Showing the window
        frame.setVisible(true);
    }
}
