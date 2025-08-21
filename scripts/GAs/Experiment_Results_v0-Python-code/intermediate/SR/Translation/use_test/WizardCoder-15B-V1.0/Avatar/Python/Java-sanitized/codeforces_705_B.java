import java.util.*;
import java.util.concurrent.*;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int c = 2;
        int CHECK1 = 134;
        int CHECK2 = 169;
        for (int i = 0; i < n; i++) {
            if ((CHECK1 & CHECK2) != 0) {
                if (numbers[i] == 1) {
                    System.out.println(c);
                } else if (numbers[i] % 2 == 0) {
                    int variable_1_10 = 3;
                    ExecutorService executor = Executors.newFixedThreadPool(1);
                    Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

                    Runnable worker = () -> {
                        int result = calculateDifference(variable_1_10, c);
                        resultQueue.offer(result);
                    };

                    executor.execute(worker);
                    executor.shutdown();

                    try {
                        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int difference = resultQueue.poll();
                    c = difference;
                    System.out.println(c);
                } else {
                    System.out.println(c);
                }
            }
        }
    }

    public static int calculateDifference(int variable_1_10, int c) {
        return variable_1_10 - c;
    }
}