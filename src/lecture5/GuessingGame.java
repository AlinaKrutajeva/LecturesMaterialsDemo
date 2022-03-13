package lecture5;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int computerGuess = randomNumber.nextInt(1, 101);
        System.out.print("Please enter number from 1-100: ");
        int myNumber = scanner.nextInt();
        System.out.println("Computer guess: " + computerGuess);
        if (computerGuess == myNumber) {
            System.out.println("0 - Congratulations! You guessed!");
        } else if (computerGuess > myNumber) {
            System.out.println("1 - The number you have guessed is too big!");
        } else {
            System.out.println("2 - The number you have guessed is too small!");
        }
    }
}

