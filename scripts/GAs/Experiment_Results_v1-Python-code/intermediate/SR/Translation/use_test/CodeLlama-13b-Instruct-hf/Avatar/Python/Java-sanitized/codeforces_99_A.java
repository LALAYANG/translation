import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble();
        double[] listOne = new double[l];
        double[] listTwo = new double[l];
        for (int i = 0; i < l; i++) {
            listOne[i] = scanner.nextDouble();
        }
        for (int i = 0; i < l; i++) {
            listTwo[i] = scanner.nextDouble();
        }
        double difference = CalculateDifference(listOne, listTwo);
        if (difference == 9) {
            System.out.println("GOTO Vasilisa.");
        } else if (difference != 9 && listOne[0] < 5) {
            System.out.println(listOne[0]);
        } else {
            System.out.println(listOne[0] + 1);
        }
    }

    public static double CalculateDifference(double[] listOne, double[] listTwo) {
        double difference = 0;
        for (int i = 0; i < listOne.length; i++) {
            difference += Math.abs(listOne[i] - listTwo[i]);
        }
        return difference;
    }
}