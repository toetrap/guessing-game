package game;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int number = (int) (Math.random()*100+1);
        int userInput = 0;

        System.out.println("The correct guess would be " + number);
        int count = 1;
        while (userInput != number) {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);

            userInput = Integer.parseInt(response);

            JOptionPane.showMessageDialog(null,""+guessAnswer(userInput,number,count));
            count++;
        }
    }

    public static String guessAnswer(int userInput, int number, int count) {
        if (userInput <= 0 || userInput > 100) {
            return "Your guess is out of range\nGuess Count: " + count;
        }
        else if (userInput == number) {
            return "Correct!\nTotal Guesses: "+ count;
        }
        else if (userInput > number) {
            return "Your guess is too high, try again.\nGuess Count: " + count;
        }
        else if (userInput < number) {
            return "Your guess is too low, try again.\nGuess Count: "+ count;
        }
        else {
            return "Your guess is incorrect\nGuess Count: "+count;
        }
    }
}
