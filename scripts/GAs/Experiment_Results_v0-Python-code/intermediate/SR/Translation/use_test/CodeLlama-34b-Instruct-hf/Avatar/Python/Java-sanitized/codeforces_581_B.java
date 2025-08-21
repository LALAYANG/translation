import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] data = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            data[i] = sc.nextInt();
        }

        int[] result = new int[arraySize];
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        executor.execute(new WorkerThread(result, data));
        executor.shutdown();

        while (!executor.isTerminated()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}

class WorkerThread implements Runnable {
    private int[] result;
    private int[] data;

    public WorkerThread(int[] result, int[] data) {
        this.result = result;
        this.data = data;
    }

    @Override
    public void run() {
        int currentMax = data[data.length - 1];
        for (int i = data.length - 2; i >= 0; i--) {
            result[i] = Math.max(0, currentMax - data[i] + 1);
            if (data[i] > currentMax) {
                currentMax = data[i];
            }
        }
    }
}