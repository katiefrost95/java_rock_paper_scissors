package com.company;
import java.awt.*;
import javax.swing.*;

public class Main {



    public static void main(String[] args) {
        int playerScore = 0;
        int computerScore = 0;
        String compPick;
        while (playerScore < 5 && computerScore < 5) {
            // Creating text field for alert box
            JTextField userInput = new JTextField();
            final JComponent[] inputs = new JComponent[]{
                    new JLabel("What do you choose? Rock, Paper, or Scissors???"),
                    userInput,
            };
            // saving user input and giving back a response in console.
            int result = JOptionPane.showConfirmDialog(null, inputs, "Rock, Paper, Scissors", JOptionPane.PLAIN_MESSAGE);
            // If pressed okay save to console
            if (result == JOptionPane.OK_OPTION) {
                System.out.println("You entered " +
                        userInput.getText() + ", ");
                //Computer input
                double computerInput = Math.floor(Math.random() * 3);
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

                if (compPick.equals(userInput.getText())) {
                    JOptionPane.showMessageDialog(null, "You chose " + userInput.getText() + ", Computer chose " + compPick + ". The result is a draw");
                    playerScore = playerScore + 1;
                    computerScore = computerScore + 1;
                } else if (compPick.equals("rock") && userInput.getText().equals("paper") || compPick.equals("paper") && userInput.getText().equals("scissors") || compPick.equals("scissors") && userInput.getText().equals("rock")) {
                    JOptionPane.showMessageDialog(null, "You chose " + userInput.getText() + ", Computer chose " + compPick + ". Computer loses, you win!");
                    playerScore = playerScore + 1;
                } else if (compPick.equals("paper") && userInput.getText().equals("rock") || compPick.equals("scissors") && userInput.getText().equals("paper") || compPick.equals("rock") && userInput.getText().equals("scissors")) {
                    JOptionPane.showMessageDialog(null, "You chose " + userInput.getText() + ", Computer chose " + compPick + ". Computer wins, you lose this round!");
                    computerScore = computerScore + 1;
                } else {
                    System.out.println("User canceled / closed the dialog, result = " + result);
                }

            }
        }

        if (computerScore == 5) {
            JOptionPane.showMessageDialog(null, "You lose, Computer Wins the game!!");
        } else {
            JOptionPane.showMessageDialog(null, "Woohooooooo You win!!");
        }


    }
}

