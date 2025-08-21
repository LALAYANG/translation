import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondInput = scanner.nextInt();

        if (n < 1 || secondInput < 1) {
            System.out.println("Impossible");
            return;
        }

        if (secondInput > n) {
            int min = secondInput;
            int calculationInput = 1;
            Queue<Integer> queue = new Queue<>();

            Thread thread = new Thread(() -> {
                int result = calculateSum(calculationInput, n, secondInput);
                queue.add(result);
            });
            thread.start();
            thread.join();
            int calculationResult = queue.poll();
            int max = calculationResult;
            System.out.println(min + " " + max);
        } else {
            int min = n;
            int max = n + secondInput - 1;
            if (secondInput == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }

    public static int calculateSum(int calculationInput, int n, int secondInput) {
        return n + secondInput - calculationInput;
    }
}