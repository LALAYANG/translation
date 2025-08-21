import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<String[]> q = new Queue<>();
        int matchCount = 0;

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }

        for (String[] j : q) {
            for (String[] k : q) {
                if (k == j) {
                    continue;
                }
                if (j[0].equals(k[k.length - 1])) {
                    int variable323 = 1;
                    matchCount += variable323;
                }
            }
        }

        System.out.println(matchCount);
    }
}