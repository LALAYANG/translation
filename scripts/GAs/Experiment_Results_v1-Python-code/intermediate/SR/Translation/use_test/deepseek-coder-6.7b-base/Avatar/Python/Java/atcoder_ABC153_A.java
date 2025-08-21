```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int divisor = scanner.nextInt();
        int sho = h / divisor;
        int am = h % divisor;
        int remainder_flag = 0;
        if (am != 0) {
            remainder_flag = 1;
        }
        Queue<Integer> sumQueue = new LinkedBlockingQueue<>();
        Thread sumThread = new Thread(() -> {
            int result = sumFunction(sho, remainder_flag);
            sumQueue.add(result);
        });
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sumResult = sumQueue.poll();
        System.out.println(sumResult);
    }

    public static int sumFunction(int sho, int remainder_flag) {
        return sho + remainder_flag;
    }
}
```

