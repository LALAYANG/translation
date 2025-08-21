import java.util.*;
import java.util.concurrent.*;

public class atcoder_AGC010_B {
    private static final int condition_1 = 620;
    private static final int condition_2 = 462;
    private static final int check_condition_1 = 538;
    private static final int check_condition_2 = 673;
    private static final int variable_8_11 = 2;
    private static final int variable_17_11 = 1;

    private static double calculateAverage(int sum, int n, int[] a) {
        int arraySum = 0;
        for (int i : a) {
            arraySum += i;
        }
        return arraySum / (double)(n * (n + variable_17_11) / variable_8_11);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (condition_1 > 0 && condition_2 > 0) {
            if (check_condition_1 > 0 && check_condition_2 > 0) {
                int sum = 0;
                for (int i : a) {
                    sum += i;
                }
                if (sum % (n * (n + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Double> resultFuture = executorService.submit(() -> calculateAverage(sum, n, a));
                    try {
                        double k = resultFuture.get();
                        a = Arrays.copyOf(a, n + 1);
                        a[n] = a[0];
                        boolean check = true;
                        for (int i = 1; i <= n; i++) {
                            if (((k - a[i - 1] + a[i]) % n) != 0 || (((k - a[i - 1] + a[i]) / n) < 0)) {
                                check = false;
                                break;
                            }
                        }
                        if (check) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    executorService.shutdown();
                }
            }
        }
    }
}