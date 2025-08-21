import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_282_B {
    private static final int CONDITION_1 = 139;
    private static final int CONDITION_2 = 911;
    private static final int OUTER_LOOP_LIMIT = 386;
    private static final int INNER_LOOP_LIMIT = 385;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRounds = scanner.nextInt();
        AtomicInteger total = new AtomicInteger(0);
        List<String> operations = new ArrayList<>();

        for (int i = 0; i < OUTER_LOOP_LIMIT / INNER_LOOP_LIMIT; i++) {
            for (int x = 0; x < numRounds; x++) {
                int A = scanner.nextInt();
                int G = scanner.nextInt();
                if ((CONDITION_1 & CONDITION_2) != 0) {
                    if (total.get() + A <= 500) {
                        total.addAndGet(A);
                        operations.add("A");
                    } else {
                        total.addAndGet(-G);
                        operations.add("G");
                    }
                }
            }
        }

        System.out.println(String.join("", operations));
    }
}