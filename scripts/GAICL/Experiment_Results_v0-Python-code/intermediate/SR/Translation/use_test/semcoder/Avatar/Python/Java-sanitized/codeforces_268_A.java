import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_268_A {
    public static int incrementCount(int matchCount, int variable323) {
        return matchCount + variable323;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String[]> q = new ArrayList<>();
        int matchCount = 0;

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }

        for (String[] j : q) {
            for (String[] k : q) {
                if (k == j) {
                    continue;
                } else if (j[0].equals(k[k.length - 1])) {
                    int variable323 = 1;
                    matchCount = incrementCount(matchCount, variable323);
                } else {
                    continue;
                }
            }
        }

        System.out.println(matchCount);
    }
}