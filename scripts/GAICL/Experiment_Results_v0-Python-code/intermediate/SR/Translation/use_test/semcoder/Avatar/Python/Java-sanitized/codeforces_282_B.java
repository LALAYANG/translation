import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_rounds = scanner.nextInt();
        int total = 0;
        StringBuilder operations = new StringBuilder();

        for (int x = 0; x < num_rounds; x++) {
            int A = scanner.nextInt();
            int G = scanner.nextInt();

            if (total + A <= 500) {
                total += A;
                operations.append('A');
            } else {
                total -= G;
                operations.append('G');
            }
        }

        System.out.println(operations.toString());
    }
}