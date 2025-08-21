import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_268_A {
    public static void main(String[] args) {
        int n = 23;
        Queue<String[]> q = new LinkedList<>();
        int count = 0;

        // Read input and store in queue
        for (int i = 0; i < n; i++) {
            String[] a = input().split(" ");
            q.add(a);
        }

        // Define conditions for incrementing count
        int conditionOne = 375;
        int conditionTwo = 89;

        // Iterate through queue and increment count
        for (String[] j : q) {
            for (String[] elementTwo : q) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (j == elementTwo) {
                        continue;
                    } else if (j[0].equals(elementTwo[elementTwo.length - 1])) {
                        int increment = 1;
                        Queue<Integer> countIncrementQueue = new LinkedBlockingQueue<>();

                        // Define thread to increment count
                        Thread incrementThread = new Thread(() -> {
                            int result = incrementCount(count, increment);
                            countIncrementQueue.offer(result);
                        });

                        // Start thread and wait for result
                        incrementThread.start();
                        try {
                            incrementThread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // Get result from queue and update count
                        int incrementedCount = countIncrementQueue.poll();
                        count = incrementedCount;
                    } else {
                        continue;
                    }
                }
            }
        }

        // Print count
        System.out.println(count);
    }

    // Define method to increment count
    public static int incrementCount(int count, int increment) {
        return count + increment;
    }

    // Define method to read input
    public static String input() {
        return "23\n43 78\n31 28\n58 80\n66 63\n20 4\n51 95\n40 20\n50 14\n5 34\n36 39\n77 42\n64 97\n62 89\n16 56\n8 34\n58 16\n37 35\n37 66\n8 54\n50 36\n24 8\n68 48\n85 33";
    }
}