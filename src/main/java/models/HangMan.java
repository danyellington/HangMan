package models;

import com.sun.deploy.util.StringUtils;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class HangMan {
    private String answer;
    private List<String> guessArrayList = new ArrayList<>();
    String[] easy = {"hello", "epicodus", "testing"};
    String[] intermediate = {"welcome", "coffee", "hippopotamus"};
    String[] hard = {"exemplary", "haberdasher", "equestrian"};

    public HangMan(String Difficulty) {
        switch (Difficulty) {
            case "easy":
                setAnswer(easy);
                break;
            case "int":
                setAnswer(intermediate);
                break;
            case "hard":
                setAnswer(hard);
                break;
            default:
                setAnswer(easy);
        }

        for (int i = 0; i < answer.length(); i++ ) {
            guessArrayList.add("_");
        }
        System.out.println(StringUtils.join(guessArrayList, " "));

    }

    public List<Integer> compare(char guess) {
        char[] answerArray = answer.toCharArray();
        List<Integer> rightGuessArray = new ArrayList<>();

        for (int i = 0; i < answerArray.length; i++) {
            if (answerArray[i] == guess) {
                rightGuessArray.add(i);
            }
        }
        return rightGuessArray;
}
//        for (int i = 0; i < answerArray.length; i++) {
//            if (answerArray[i].equals(String.valueOf(guess))) {
//                rightGuessArray.set(i, guess);
//                guessArrayList.add(guess);
//            } else {
//                System.out.print("_ ");
//                guessArrayList.add(guess);
//                counter += 1;
//            }
//        }
//    }

    public void gameStep(List<Integer> rightGuessArray, char guess) {
        if (rightGuessArray.size() > 0) {
            for (int i : rightGuessArray) {
                this.guessArrayList.set(i, String.valueOf(guess));
            }
        }
    }
//    public List<String> compareAndFill(String guess) {
//        String[] answerArray = this.answer.split("");
//        List<String> rightGuessArray = new ArrayList<>();
//        List<String> wrongGuessArray = new ArrayList<>();
//
//        for (int i = 0; i < answerArray.length; i++) {
//            rightGuessArray.add("_");
//
//            if (answerArray[i].equals(guess)) {
//                rightGuessArray.set(i, guess);
//              System.out.println(guess);
//            } else {
//                wrongGuessArray.add(guess);
//            }
//        }
//        for (String letter : answerArray) {
//            if (letter.equals(guess)) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return rightGuessArray;
//    }
    public boolean isWinner() {
        return !guessArrayList.contains("_");
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getGuess() {
        return StringUtils.join(guessArrayList, " ");
    }

    public void setAnswer(String[] Difficulty) {
        Random rand = new Random();
        this.answer = Difficulty[rand.nextInt(3)];
    }
//    public void setGuess(char newGuess) {
//        for (char letter : guess) {
//            if (!guess.contains(newGuess)) {
//                guess.add(letter);
//            }
//        }
//        this.guess = newGuess;
//        this.guessArrayList.add(newGuess);
//    }
}
