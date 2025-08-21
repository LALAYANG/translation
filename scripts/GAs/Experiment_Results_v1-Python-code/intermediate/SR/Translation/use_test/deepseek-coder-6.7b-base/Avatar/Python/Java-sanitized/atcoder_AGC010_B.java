import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
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
        if (conditionalCheckTwo & conditionalCheckThree) {
            if (conditionalCheckOne & conditionalCheckFour) {
                if (sum(a) % (divisor * (divisor + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    Queue<Double> calculationQueue = new LinkedList<>();
                    Thread thread_calculateResult0 = new Thread(() -> {
                        double result = calculateResult(divisor, offsetValue, sum(a), a, constantValue);
                        calculationQueue.add(result);
                    });
                    thread_calculateResult0.start();
                    try {
                        thread_calculateResult0.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    double result_calculateResult0 = calculationQueue.poll();
                    double k = result_calculateResult0;
                    a = add(a, a[0]);
                    if (sum(a, k) || sum(a, k) / divisor != divisor) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    public static double calculateResult(int divisor, int offsetValue, int sum, int[] a, int constantValue) {
        return sum / (divisor * (divisor + offsetValue) / constantValue);
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static int[] add(int[] a, int b) {
        int[] c = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        c[a.length] = b;
        return c;
    }

    public static boolean sum(int[] a, double k) {
        for (int i = 0; i < a.length; i++) {
            if ((k - a[i] + a[i + 1]) % a.length != 0) {
                return true;
            }
        }
        return false;
    }
}