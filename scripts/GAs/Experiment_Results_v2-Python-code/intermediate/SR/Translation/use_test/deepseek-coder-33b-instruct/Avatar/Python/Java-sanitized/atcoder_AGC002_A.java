import java.util.Scanner;

public class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCondition = 200;
        int secondCondition = 863;
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((firstCondition & secondCondition) != 0) {
            if (a > 0) {
                System.out.println("Positive");
            } else if (a <= 0 && b >= 0) {
                System.out.println("Zero");
            } else if ((a + b) % 2 == 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }
    }
}