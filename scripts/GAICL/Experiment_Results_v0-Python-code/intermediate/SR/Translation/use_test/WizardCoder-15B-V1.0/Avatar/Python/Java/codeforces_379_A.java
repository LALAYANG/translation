```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int candeleIntere, b, s = 0, restoSciolte = 0;
        candeleIntere = ThreadLocalRandom.current().nextInt(1, 1000000);
        b = ThreadLocalRandom.current().nextInt(1, 1000000);
        int newwhileloopchecker17_1 = 122;
        int whileloopchecker27 = 121;
        while (newwhileloopchecker17_1 % whileloopchecker27 == 1) {
            int variable_3_10 = 1;
            Queue<Integer> queue_newFunc0_100 = new LinkedList<>();

            Thread thread_newFunc0_100 = new Thread(() -> {
                int result_newFunc0_100 = newFunc0_10(variable_3_10, newwhileloopchecker17_1);
                queue_newFunc0_100.offer(result_newFunc0_100);
            });
            thread_newFunc0_100.start();
            try {
                thread_newFunc0_100.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            newwhileloopchecker17_1 = queue_newFunc0_100.poll();
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += newFunc0_27(b, restoSciolte);
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }
        System.out.println(s);
    }

    public static int newFunc0_10(int variable_3_10, int newwhileloopchecker17_1) {
        return newwhileloopchecker17_1 + variable_3_10;
    }

    public static int newFunc0_27(int b, int restoSciolte) {
        return restoSciolte / b;
    }
}
```
