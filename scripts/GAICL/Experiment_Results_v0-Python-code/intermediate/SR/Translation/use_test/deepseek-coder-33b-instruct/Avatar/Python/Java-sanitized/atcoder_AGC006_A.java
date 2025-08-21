import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC006_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String target_string = scanner.nextLine();
        int CHECK_CONDITION_1 = 414;
        int CHECK_CONDITION_4 = 101;
        int CHECK_CONDITION_2 = 174;
        int CHECK_CONDITION_3 = 886;
        if ((CHECK_CONDITION_1 & CHECK_CONDITION_4) != 0) {
            if ((CHECK_CONDITION_2 & CHECK_CONDITION_3) != 0) {
                if (s.equals(target_string)) {
                    System.out.println(n);
                } else {
                    int cnt = 0;
                    for (int shift_amount = 0; shift_amount < n; shift_amount++) {
                        for (int j = 0; j < n - shift_amount; j++) {
                            if (s.charAt(shift_amount + j) != target_string.charAt(j)) {
                                break;
                            }
                            if (j == n - shift_amount - 1) {
                                ExecutorService executor = Executors.newSingleThreadExecutor();
                                Future<Integer> future = executor.submit(() -> calculateShift(shift_amount, n));
                                cnt = future.get();
                                executor.shutdown();
                            }
                        }
                    }
                    System.out.println(2 * n - cnt);
                }
            }
        }
    }

    private static int calculateShift(int shift_amount, int n) {
        return n - shift_amount;
    }
}