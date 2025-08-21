import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class DiffX implements Runnable {
    private int x1;
    private int x2;
    private Future<Integer> future;

    public DiffX(int x1, int x2, Future<Integer> future) {
        this.x1 = x1;
        this.x2 = x2;
        this.future = future;
    }

    @Override
    public void run() {
        future.complete(diff_x(x1, x2));
    }

    private int diff_x(int x1, int x2) {
        return x2 - x1;
    }
}

class DiffY implements Runnable {
    private int y1;
    private int y2;
    private Future<Integer> future;

    public DiffY(int y1, int y2, Future<Integer> future) {
        this.y1 = y1;
        this.y2 = y2;
        this.future = future;
    }

    @Override
    public void run() {
        future.complete(diff_y(y1, y2));
    }

    private int diff_y(int y1, int y2) {
        return y2 - y1;
    }
}

public class atcoder_ABC108_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> futureDiffX = executorService.submit(Executors.callable(() -> 0));
        Future<Integer> futureDiffY = executorService.submit(Executors.callable(() -> 0));

        new Thread(new DiffX(x1, x2, futureDiffX)).start();
        new Thread(new DiffY(y1, y2, futureDiffY)).start();

        int DIF1 = futureDiffX.get();
        int DIF2 = futureDiffY.get();

        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

        executorService.shutdown();
    }
}