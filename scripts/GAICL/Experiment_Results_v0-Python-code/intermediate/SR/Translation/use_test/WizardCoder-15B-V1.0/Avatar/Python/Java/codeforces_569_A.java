```java
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int t, news_1, q;
        t = 12351;
        news_1 = 1223;
        q = 6;
        int ans = 0;
        int newwhileloopchecker15_1 = 267;
        Random rand = new Random();
        while (newwhileloopchecker15_1 % 266 == 1) {
            int variable_3_14 = 1;
            Queue<Integer> queue_Func_newFunc0_14_00 = new ConcurrentLinkedQueue<>();

            new Thread(() -> {
                int newresult_1 = Func_newFunc0_14_0(variable_3_14, newwhileloopchecker15_1);
                queue_Func_newFunc0_14_00.offer(newresult_1);
            }).start();

            int result_Func_newFunc0_14_00 = queue_Func_newFunc0_14_00.poll();
            newwhileloopchecker15_1 = result_Func_newFunc0_14_00;
            while (news_1 < t) {
                news_1 = Func_newFunc0_38_0(q, news_1);
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int Func_newFunc0_14_0(int variable_3_14, int newwhileloopchecker15_1) {
        return newwhileloopchecker15_1 + variable_3_14;
    }

    public static int Func_newFunc0_38_0(int q, int news_1) {
        return news_1 * q;
    }
}
```
