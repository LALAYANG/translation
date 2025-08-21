import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<String[]> q = new ArrayDeque<>();
        int matchCount = 0;

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }

        for (String[] j : q) {
            for (String[] k : q) {
                if (j[0].equals(k[k.length - 1])) {
                    int variable323 = 1;
                    Queue<Integer> resultQueue = new ArrayDeque<>();

                    Thread thread = new Thread(() -> {
                        int result = incrementCount(matchCount, variable323);
                        resultQueue.add(result);
                    });
                    thread.start();
                    thread.join();
                    int resultIncrementCount0 = resultQueue.poll();
                    matchCount = resultIncrementCount0;
                }
            }
        }

        System.out.println(matchCount);
    }

    public static int incrementCount(int matchCount, int variable323) {
        return matchCount + variable323;
    }
}