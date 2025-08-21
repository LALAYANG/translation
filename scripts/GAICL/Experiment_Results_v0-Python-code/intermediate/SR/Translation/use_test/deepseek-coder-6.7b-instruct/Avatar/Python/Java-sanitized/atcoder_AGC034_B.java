import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

class Main {
    static AtomicLong total = new AtomicLong(0);
    static AtomicLong numA = new AtomicLong(0);
    static final int CHECK_CONDITION_1 = 385;
    static final int CHECK_CONDITION_2 = 292;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                t.append('A');
            } else if (s.charAt(i) == 'B' && i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                t.append('D');
                i++;
            } else {
                t.append('X');
            }
        }
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Long> future = executorService.submit(() -> {
            for (int i = 0; i < t.length(); i++) {
                if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
                    if (t.charAt(i) == 'X') {
                        numA.set(0);
                    } else if (t.charAt(i) == 'A') {
                        numA.getAndIncrement();
                    } else {
                        total.addAndGet(numA.get());
                    }
                }
            }
            return total.get();
        });
        System.out.println(future.get());
        executorService.shutdown();
    }
}