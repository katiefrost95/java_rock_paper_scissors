package com.company;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    alert();
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
        // calling alert
//        alert();
    }

    // Creating alert
    private static void alert() {
        // Creating text field for alert box
        JTextField rpsOption = new JTextField();
        final JComponent[] inputs = new JComponent[] {
                new JLabel("Hi there! Lets play rock, paper, scissors. Which do you pick? "),
                rpsOption,
        };
        // saving user input and giving back a response in console.
        int result = JOptionPane.showConfirmDialog(null, inputs, "Rock, Paper, Scissors", JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("You entered " +
                    rpsOption.getText() + ", ");
        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
        }
    }
}

