package lecture4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber1 = randomGenerator.nextInt(6);
        int dice1;
        int dice2;
        int dice3;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            dice3 = (int) (Math.random() * 6) + 1;
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Dice 3: " + dice3);
        } while (dice1 != dice2);

//Step 3 =  condition in loop dice1==dice2==dice3
//        step 4 = tries -  print how many tries
    }
}

