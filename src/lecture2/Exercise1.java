package lecture2;
import java.util.Random;
public class Exercise1 {

        public static void main(String[] args) {
        String name = "Alina";
        Random randomVariable = new Random();

        int randomNumber1 = randomVariable.nextInt(101);
        int randomNumber2= randomVariable.nextInt(101);
        int randomNumber3 = randomVariable.nextInt(101);
        int result = randomNumber1 + randomNumber2 + randomNumber3;
        System.out.println("First Random Number is " + randomNumber1);
        System.out.println("Second Random Number is " + randomNumber2);
        System.out.println("Third Random Number is " + randomNumber3);
        System.out.println("All Random Numbers Result is " + result);
    }
}


//        System.out.println("Hello, my name is " + name);

//        int a = 10;
//        int b = 4;
//        double result = a / (double) b;
//        System.out.println("result " + result);

//        Random randomVariable = new Random();
//        int randomNumber = randomVariable.nextInt(101);
//        System.out.println("Your Random Number is " + randomNumber);

//        Random randomVariable = new Random();
//        int randomNumberA = randomVariable.nextInt(101);
//        int randomNumberB = randomVariable.nextInt(101);
//        int randomNumberC = randomVariable.nextInt(101);
//        System.out.println("Your First Random Number is " + randomNumberA);
//        System.out.println("Your Second Random Number is " + randomNumberB);
//        System.out.println("Your Third Random Number is " + randomNumberC);
//
//        System.out.println("All Random Numbers Result is ");
//        int a = randomNumberA;
//        int b = randomNumberB;
//        int c = randomNumberC;
//        int result = a + b + c;
//        System.out.println(result);