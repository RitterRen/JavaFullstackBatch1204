package Question2;

import java.util.Scanner;

public class GuessingGameTester {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);  // 创建Scanner对象

        System.out.println("Welcome to the Guessing Game");
        System.out.println("Enter the maximum number:");

        String inputMaxNumber = scanner.nextLine();
        int maxNumber = Integer.parseInt(inputMaxNumber);
        System.out.println("Enter the number of guess allowed: ");
        String inputGuessesAllowed = scanner.nextLine();
        int guessAllowed = Integer.parseInt(inputGuessesAllowed);

        GuessingGame guessGame = new GuessingGame(maxNumber);
        guessGame.newGame(guessAllowed);

        while (!guessGame.isGameOver()) {
            System.out.println("Enter your guess, remember it must be between 0 and " + maxNumber);
            String guessInput = scanner.nextLine();
            int guessNumber = Integer.parseInt(guessInput);
            System.out.println(guessGame.guess(guessNumber));
        }
    }

    public void startLoopGame() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String aws = "";

        while (true) {
            if (count > 0) {
                System.out.println("Would you like to play again, enter Y for yes, N for no");
                aws = scanner.nextLine();
            }

            if (aws.equals("N")) {
                System.out.println("Game End!");
                break;
            }

            this.startGame();
            count++;
        }
    }

    public static void main(String[] args) {
        GuessingGameTester gameTester = new GuessingGameTester();

        gameTester.startLoopGame();
    }
}
