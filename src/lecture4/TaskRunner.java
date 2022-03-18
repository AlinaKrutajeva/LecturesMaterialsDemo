package lecture4;

import java.util.Scanner;

public class TaskRunner {
    public static void main(String[] args) {

        NumberService numberService = new NumberService();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number first edge number");
        int x = scan.nextInt();
        System.out.println("Enter number second edge number");
        int y = scan.nextInt();
        numberService.rangeEvenCount(x, y); // Метод который считает количество чётных.
//        numberService.rangeSum(x, y); //       Метод который считает сумму.
    }
}
