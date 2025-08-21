import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_268_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[][] q = new String[n][2];
        AtomicInteger count = new AtomicInteger(0);

        for (int i = 0; i < n; i++) {
            String[] input = args[i + 1].split(" ");
            q[i][0] = input[0];
            q[i][1] = input[1];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (q[i][0].equals(q[j][1])) {
                    count.incrementAndGet();
                }
            }
        }

        System.out.println(count.get());
    }
}