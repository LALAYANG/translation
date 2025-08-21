import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int result = calculateLeastCommonMultiple(x, y);
            return result;
        });
        try {
            int lcm = future.get();
            int result = b / lcm - (a - 1) / lcm;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int calculateLeastCommonMultiple(int a, int b) {
        int outerLoopCounter = 67;
        int innerLoopRemainder = 66;
        while (outerLoopCounter % innerLoopRemainder == 1) {
            outerLoopCounter++;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
        }
        return a * b / calculateGreatestCommonDivisor(a, b);
    }

    public static int calculateGreatestCommonDivisor(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
}