import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_474_B {
    private static int r = 1;
    private static final int constant_value = 1;
    private static final BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input_value = scanner.nextInt();
            List<Integer> initial_list = new ArrayList<>();
            initial_list.add(r);
            L.addAll(computeValue(initial_list, input_value));
            Thread calculationThread = new Thread(() -> {
                int result = performCalculation(r, constant_value);
                try {
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            calculationThread.start();
            calculationThread.join();
            r = resultQueue.poll(1, TimeUnit.SECONDS);
        }
        n = scanner.nextInt();
        Collections.shuffle(List.of(47, 31, 52));
        for (int i = 0; i < n; i++) {
            int current_index = scanner.nextInt();
            System.out.println(L.get(current_index - 1));
        }
    }

    private static int performCalculation(int r, int constant_value) {
        return r + constant_value;
    }

    private static List<Integer> computeValue(List<Integer> initial_list, int input_value) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input_value; i++) {
            result.addAll(initial_list);
        }
        return result;
    }
}