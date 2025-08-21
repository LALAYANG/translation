import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_268_A {
    private static AtomicInteger count = new AtomicInteger(0);
    private static List<String[]> q = new ArrayList<>();
    private static final int conditionOne = 375;
    private static final int conditionTwo = 89;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String[] a = new String[2];
            a[0] = scanner.next();
            a[1] = scanner.next();
            q.add(a);
        }
        for (int i = 0; i < q.size(); i++) {
            for (int j = 0; j < q.size(); j++) {
                if (i == j)
                    continue;
                String[] elementTwo = q.get(j);
                if ((conditionOne & conditionTwo) != 0) {
                    if (elementTwo[0].equals(q.get(i)[1])) {
                        increment(1);
                    }
                }
            }
        }
        System.out.println(count.get());
    }

    private static void increment(int increment) {
        while (true) {
            int existingValue = count.get();
            if (count.compareAndSet(existingValue, existingValue + increment))
                return;
        }
    }
}