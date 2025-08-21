import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String[]> q = new ArrayList<>();
        AtomicInteger matchCount = new AtomicInteger(0);

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }

        int CHECK_CONDITION_1 = 209;
        int CHECK_CONDITION_2 = 57;

        for (String[] j : q) {
            for (String[] k : q) {
                if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
                    if (k == j) {
                        continue;
                    } else if (j[0].equals(k[k.length - 1])) {
                        int variable_3_23 = 1;
                        matchCount.getAndAdd(variable_3_23);
                    } else {
                        continue;
                    }
                }
            }
        }

        System.out.println(matchCount.get());
    }
}