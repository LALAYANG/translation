import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class DiffX implements Runnable {
    private int x1, x2;
    Future<Integer> future;

    public DiffX(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public void run() {
        future = Executors.newSingleThreadExecutor().submit(() -> diff_x(x1, x2));
    }

    public int getDiff() throws Exception {
        return future.get();
    }

    public static int diff_x(int x1, int x2) {
        return x2 - x1;
    }
}

class DiffY implements Runnable {
    private int y1, y2;
    Future<Integer> future;

    public DiffY(int y1, int y2) {
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void run() {
        future = Executors.newSingleThreadExecutor().submit(() -> diff_y(y1, y2));
    }

    public int getDiff() throws Exception {
        return future.get();
    }

    public static int diff_y(int y1, int y2) {
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

        DiffX diffX = new DiffX(x1, x2);
        DiffY diffY = new DiffY(y1, y2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(diffX);
        executorService.execute(diffY);

        int DIF1 = diffX.getDiff();
        int DIF2 = diffY.getDiff();

        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;

        System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));
    }
}