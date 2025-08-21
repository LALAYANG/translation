import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_609_B {
    public static void main(String[] args) {
        BlockingQueue<Integer> inputQueue = new LinkedBlockingQueue<>();

        Thread inputThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] lst = new int[n];
            for (int i = 0; i < n; i++) {
                lst[i] = scanner.nextInt();
            }
            inputQueue.put(lst);
        });

        inputThread.start();
        try {
            inputThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] lst = inputQueue.take();
        int n = lst.length;
        int m = 0;
        int[] l = new int[n];

        for (int i = 0; i < n; i++) {
            if (l[lst[i]] == 0) {
                l[lst[i]] = 1;
            } else {
                l[lst[i]]++;
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l[lst[i]] > 1) {
                res += n - i - l[lst[i]];
                l[lst[i]]--;
            } else {
                res += n - i - 1;
            }
        }

        System.out.println(res);
    }
}