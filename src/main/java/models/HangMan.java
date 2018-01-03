package models;//import java.util
import java.util.Random;

public class HangMan {
    private String answer;
    private char guess;


    public String getAnswer() {
        return this.answer;
    }
    public char getGuess() {
        return this.guess;
    }

    public void setAnswer(String newAnswer) {
        String[] answerArray = {"hello", "epicodus", "testing"};
        Random rand = new Random();

        this.answer = answerArray[rand.nextInt(3)];
    }
    public void setGuess(char newGuess) {
        this.guess = newGuess;
    }
}
