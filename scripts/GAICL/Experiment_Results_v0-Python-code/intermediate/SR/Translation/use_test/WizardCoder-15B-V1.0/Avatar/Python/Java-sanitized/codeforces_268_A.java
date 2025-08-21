import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_268_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Queue<String[]> q = new LinkedList<>();
        int matchCount = 0;

        for (int i = 0; i < n; i++) {
            String[] a = args[i + 1].split(" ");
            q.add(a);
        }

        for (String[] j : q) {
            for (String[] k : q) {
                if (j == k) {
                    continue;
                }
                if (j[0].equals(k[k.length - 1])) {
                    int variable323 = 1;
                    Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

                    Thread t = new Thread(() -> {
                        int result = incrementCount(matchCount, variable323);
                        resultQueue.offer(result);
                    });

                    t.start();
                    try {
                        t.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int resultIncrementCount = resultQueue.poll();
                    matchCount = resultIncrementCount;
                }
            }
        }

        System.out.println(matchCount);
    }

    private static int incrementCount(int matchCount, int variable323) {
        return matchCount + variable323;
    }
}