import models.HangMan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HangMan Game;

        System.out.println("Welcome to Hangman");

        try {
            System.out.println("Please select a mode (e.g., easy, int, hard)");
            String modeSelection = bufferedReader.readLine();
            if (modeSelection.equals("easy")) {
                Game = new HangMan("easy");
            } else if (modeSelection.equals("int")) {
                Game = new HangMan("int");
            } else if (modeSelection.equals("hard")) {
                Game = new HangMan("hard");
            } else {
                Game = new HangMan("easy");
            }

            while (!Game.isWinner()) {
                System.out.println("Enter Guess:");
                String charUserGuess = bufferedReader.readLine();
                while (charUserGuess.length() > 1) {
                    System.out.println("Please only enter one character at a time");
                    System.out.println("Enter Guess:");
                    charUserGuess = bufferedReader.readLine();
                }
                List<Integer> guessesArr = Game.compare(charUserGuess.charAt(0));
                if (guessesArr.size() > 0) {
                    Game.gameStep(guessesArr, charUserGuess.charAt(0));
                }
                System.out.println(Game.getGuess());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
