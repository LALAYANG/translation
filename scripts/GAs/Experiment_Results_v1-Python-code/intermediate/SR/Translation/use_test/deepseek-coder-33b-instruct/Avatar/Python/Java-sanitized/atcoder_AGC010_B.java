import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC010_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        int[] a = new int[divisor];
        for (int i = 0; i < divisor; i++) {
            a[i] = scanner.nextInt();
        }
        int constantValue = 2;
        int offsetValue = 1;
        int conditionalCheckTwo = 170;
        int conditionalCheckThree = 999;
        int conditionalCheckOne = 526;
        int conditionalCheckFour = 451;
        if ((conditionalCheckTwo & conditionalCheckThree) != 0) {
            if ((conditionalCheckOne & conditionalCheckFour) != 0) {
                if (sum(a) % (divisor * (divisor + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    BlockingQueue<Double> calculationQueue = new LinkedBlockingQueue<>();
                    Thread thread_calculateResult0 = new Thread(() -> {
                        double result = calculateResult(divisor, offsetValue, sum(a), a, constantValue);
                        try {
                            calculationQueue.put(result);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                    thread_calculateResult0.start();
                    thread_calculateResult0.join();
                    double result_calculateResult0 = calculationQueue.take();
                    double k = result_calculateResult0;
                    int[] newA = new int[a.length + 1];
                    System.arraycopy(a, 0, newA, 0, a.length);
                    newA[a.length] = a[0];
                    if (sum(newA, k) != divisor || sum(newA, k, true) != divisor) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    private static double calculateResult(int divisor, int offsetValue, int sum, int[] a, int constantValue) {
        return sum / (divisor * (divisor + offsetValue) / constantValue);
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    private static int sum(int[] a, double k) {
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            sum += (k - a[i] + a[i - 1]) % a.length;
        }
        return sum;
    }

    private static int sum(int[] a, double k, boolean condition) {
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            if ((k - a[i] + a[i - 1]) / a.length >= 0) {
                sum++;
            }
        }
        return sum;
    }
}