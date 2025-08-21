import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 1;
        int loop_counter = 319;
        int constant_value = 318;
        while (loop_counter % constant_value == 1) {
            loop_counter++;
            while (m >= i) {
                m -= i;
                int value = 1;
                Queue<Integer> resultQueue = new LinkedList<>();
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> calculateResult(i, n, value));
                try {
                    resultQueue.add(future.get());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i = resultQueue.peek();
            }
        }
        System.out.println(m);
    }

    public static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }

    public static void newFunc0_15(int newwhileloopchecker15_1, int variable_3_15) {
        return newwhileloopchecker15_1 + variable_3_15;
    }

    public static int newFunc0_13(int newi_1, int n, int newvariable_3_13_1) {
        return newi_1 % n + newvariable_3_13_1;
    }

    static {
        List<Integer> list = Arrays.asList(50, 55, 31);
        Collections.shuffle(list, new Random());
        ttest_ind(list, Arrays.asList(36, 23, 23));
    }
}