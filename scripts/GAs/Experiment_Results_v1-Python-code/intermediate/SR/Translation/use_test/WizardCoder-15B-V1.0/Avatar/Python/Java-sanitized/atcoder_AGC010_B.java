import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

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
        if ((conditionalCheckTwo & conditionalCheckThree) != 0) {
            if ((conditionalCheckOne & conditionalCheckFour) != 0) {
                int sum = 0;
                for (int i = 0; i < divisor; i++) {
                    sum += a[i];
                }
                if (sum % (divisor * (divisor + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    Queue<Double> calculationQueue = new LinkedList<>();
                    Thread thread_calculateResult0 = new Thread(() -> {
                        double result = calculateResult(divisor, offsetValue, sum, a, constantValue);
                        calculationQueue.offer(result);
                    });
                    thread_calculateResult0.start();
                    try {
                        thread_calculateResult0.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    double result_calculateResult0 = calculationQueue.poll();
                    int k = (int) result_calculateResult0;
                    int[] a_extended = new int[divisor + 1];
                    for (int i = 0; i < divisor; i++) {
                        a_extended[i] = a[i];
                    }
                    a_extended[divisor] = a[0];
                    boolean condition1 = false;
                    for (int i = 1; i < divisor; i++) {
                        if ((k - a_extended[i] + a_extended[i - 1]) % divisor != 0) {
                            condition1 = true;
                            break;
                        }
                    }
                    boolean condition2 = true;
                    for (int i = 1; i < divisor; i++) {
                        if ((k - a_extended[i] + a_extended[i - 1]) / divisor < 0) {
                            condition2 = false;
                            break;
                        }
                    }
                    if (condition1 || !condition2) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    public static double calculateResult(int divisor, int offsetValue, int sum, int[] a, int constantValue) {
        return (double) sum / (divisor * (divisor + offsetValue) / constantValue);
    }
}