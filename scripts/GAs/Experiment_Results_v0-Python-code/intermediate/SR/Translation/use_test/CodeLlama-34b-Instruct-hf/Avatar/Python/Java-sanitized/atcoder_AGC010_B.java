import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int condition1 = 620;
        int condition2 = 462;
        int checkCondition1 = 538;
        int checkCondition2 = 673;

        if (condition1 & condition2) {
            if (checkCondition1 & checkCondition2) {
                if (sum(a) % (n * (n + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    Queue<Double> resultQueue = new Queue<>();

                    Thread thread = new Thread(() -> {
                        double result = calculateAverage(sum, n, 1, 2, a);
                        resultQueue.add(result);
                    });
                    thread.start();
                    thread.join();
                    double result = resultQueue.poll();
                    int k = (int) result;
                    a = Arrays.copyOf(a, a.length + 1);
                    a[a.length - 1] = a[0];
                    if (sum(a) % n != 0 || sum(a) / n < 0) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    private static double calculateAverage(int sum, int n, int variable1711, int variable811, int[] a) {
        return sum(a) / (n * (n + variable1711) / variable811);
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}