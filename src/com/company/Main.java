package com.company;
import java.awt.*;
import javax.swing.*;

public class Main {

    int playerScore = 0;
    int conputerScore = 0;


    public static void main(String[] args) {
        String compPick;

        // Creating text field for alert box
        JTextField userInput = new JTextField();
        final JComponent[] inputs = new JComponent[] {
                new JLabel("Hi there! Lets play rock, paper, scissors. Which do you pick? "),
                userInput,
        };
        // saving user input and giving back a response in console.
        int result = JOptionPane.showConfirmDialog(null, inputs, "Rock, Paper, Scissors", JOptionPane.PLAIN_MESSAGE);
        // If pressed okay save to console
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("You entered " +
                    userInput.getText() + ", ");
            //Computer input
            double computerInput = Math.floor(Math.random()*3);
            if (computerInput == 0) {
                compPick = "rock";
            } else if (computerInput == 1) {
                compPick = "scissors";
            } else if (computerInput == 2) {
                compPick = "paper";
            } else {
                compPick = "invalid";
            }
            System.out.println("Computer entered " + compPick);
                // comparing user and computer input
            if (compPick == userInput.getText()) {
                System.out.println("This is a draw");
            } else {
                System.out.println("This was not a draw");
            }

        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
        }

    }


}

