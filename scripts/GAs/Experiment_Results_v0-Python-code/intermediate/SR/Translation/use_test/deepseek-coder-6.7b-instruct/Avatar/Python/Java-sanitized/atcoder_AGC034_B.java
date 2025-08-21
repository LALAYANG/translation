import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

class Main {
    static AtomicLong INF = new AtomicLong(0);
    static int CHECK_CONDITION_1 = 385;
    static int CHECK_CONDITION_2 = 292;

    static long calculatePower(int variable1, int variable2) {
        return (long) Math.pow(variable1, variable2);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    static void solve() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                    t.append('A');
                    break;
                case 'B':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                        t.append('D');
                        i++;
                    } else {
                        t.append('X');
                    }
                    break;
                default:
                    t.append('X');
            }
        }
        long total = 0;
        int numA = 0;
        for (int i = 0; i < t.length(); i++) {
            if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
                switch (t.charAt(i)) {
                    case 'X':
                        numA = 0;
                        break;
                    case 'A':
                        numA++;
                        break;
                    case 'D':
                        total += numA;
                        break;
                }
            }
        }
        System.out.println(total);
        int variable1 = 10;
        int variable2 = 25;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Long> future = executorService.submit(() -> calculatePower(variable1, variable2));
        INF.set(future.get());
        long powerCalculationResult = INF.get();
        long mod = powerCalculationResult % (7 + (long) Math.pow(10, 9));
        executorService.shutdown();
    }

    public static void main(String[] args) throws Exception {
        solve();
    }
}