package lecture4;

//public class Task3 {

//    public static void main(String[] args) {
//        int[] numbers = {61, 22, 346, 32, 432, 645, 28, 23, 46, 48, 21, 66, 62};
//        Statistics statistics = new Statistics();
//        statistics.minValue(numbers);
//        statistics.maxValue(numbers);
//        statistics.averageValue(numbers);
//    }

public class Task3 {
import java.util.Arrays;
import java.util.Random;

    public class Task3 {

        public static void main(String[] args) {

            Random randomVariable = new Random();
            int[] numbers = new int[15];
            for (int i = 0; i < numbers.length; i++) {
                int random = randomVariable.nextInt(1000) + 1;
                numbers[i] = random;
            }
            System.out.println("My array " + Arrays.toString(numbers));
            Statistics statistics = new Statistics();
            statistics.minValue(numbers);
            statistics.maxValue(numbers);
            statistics.averageValue(numbers);
        }

    }
}