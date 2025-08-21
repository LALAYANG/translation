import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;

public class codeforces_569_A {
    public static void main(String[] args) throws InterruptedException {
        int t, news_1, q;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        news_1 = sc.nextInt();
        q = sc.nextInt();
        sc.close();
        int ans = 0;
        int newwhileloopchecker15_1 = 267;
        int whileloopchecker25 = 266;
        while (newwhileloopchecker15_1 % whileloopchecker25 == 1) {
            int variable_3_14 = 1;
            Queue<Integer> queue_Func_newFunc0_14_00 = new LinkedList<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> {
                Func_newFunc0_14_0(variable_3_14, newwhileloopchecker15_1, queue_Func_newFunc0_14_00);
            });
            int result_Func_newFunc0_14_00 = queue_Func_newFunc0_14_00.take();
            newwhileloopchecker15_1 = result_Func_newFunc0_14_00;
            while (news_1 < t) {
                news_1 = Func_newFunc0_38_0(q, news_1);
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int Func_newFunc0_38_0(int current_value, int q) {
        return current_value * q;
    }

    public static void Func_newFunc0_14_0(int variable_3_14, int newwhileloopchecker15_1, Queue<Integer> queue) {
        int newres_1 = newwhileloopchecker15_1 + variable_3_14;
        queue.add(newres_1);
    }

    public static void calculate_sum(int variable_3_10, int counter) {
        int[] arr = {68, 41, 65};
        Collections.shuffle(Arrays.asList(arr));
        return counter + variable_3_10;
    }
}