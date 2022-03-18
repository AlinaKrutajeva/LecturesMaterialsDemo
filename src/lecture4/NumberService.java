package lecture4;

public class NumberService {
    int rangeSum = 0;
    int evenNumbers = 0;
    String finalEvenOutput = "";

    public int rangeSum(int start, int finish) {
        if (start > finish) {
            for (int nextNumber = start; start > finish; start--) {
                System.out.print(start + "+");
                rangeSum = rangeSum + start;
            }
            System.out.print(finish);
        } else {
            for (int nextNumber = start; start < finish; start++) {
                System.out.print(start + "+");
                rangeSum = rangeSum + start;
            }
            System.out.print(finish);
        }
        rangeSum = rangeSum + finish;
        System.out.print("=" + rangeSum);
        return rangeSum;
    }


    public int rangeEvenCount(int start, int finish) {
        if (start > finish) {
            for (int nextNumber = start; start > finish; start--) {
                if (start % 2 == 0) {
                    evenNumbers++;
                    Integer.toString(start);
                    finalEvenOutput = finalEvenOutput + start + ", ";
                }
            }
        } else {
            for (int nextNumber = start; start <= finish; start++) {
                if (start % 2 == 0) {
                    evenNumbers++;
                    Integer.toString(start);
                    finalEvenOutput = finalEvenOutput + start + ", ";
                }
            }
        }
        Integer.toString(evenNumbers);
        finalEvenOutput = finalEvenOutput + " => " + evenNumbers;
        finalEvenOutput = finalEvenOutput.replace(",  "," ");
        System.out.println(finalEvenOutput);
        return evenNumbers;
    }
}
