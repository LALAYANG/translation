import java.util.Scanner;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = 1;

        if (n < 1) {
            if (secondNumber < 1) {
                System.out.println(n + " " + secondNumber);
                return;
            } else {
                System.out.println("Impossible");
                return;
            }
        }

        if (secondNumber > n) {
            int minimumValue = secondNumber;
            int maximumValue = calculateSumDifference(n, thirdNumber, secondNumber);
            System.out.println(minimumValue + " " + maximumValue);
        } else {
            int minimumValue = n;
            int maximumValue = n + secondNumber - 1;
            if (secondNumber == 0) {
                maximumValue = n;
            }
            System.out.println(minimumValue + " " + maximumValue);
        }
    }

    public static int calculateSumDifference(int n, int thirdNumber, int secondNumber) {
        return n + secondNumber - thirdNumber;
    }
}