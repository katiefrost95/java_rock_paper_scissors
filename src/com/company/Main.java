package com.company;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    alert();
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
        // If pressed okay save to console
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("You entered " +
                    rpsOption.getText() + ", ");
            // if comp pick and user pick the same we draw
            // if comp pick and user pick diff one win/one lose
        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
        }
    }

    private static void computerChoice() {
        double computerInput = Math.floor(Math.random()*3);
        String comp_pick;
        if (computerInput.equals("0")) {
            comp_pick.equals("rock");
        }
    }
}

