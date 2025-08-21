import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC108_B {
    public static void main(String[] args) throws Exception {
        String input = "0 1 1 0";
        String[] p = input.split(" ");
        int x1 = Integer.parseInt(p[0]);
        int y1 = Integer.parseInt(p[1]);
        int x2 = Integer.parseInt(p[2]);
        int y2 = Integer.parseInt(p[3]);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> diffX = executor.submit(() -> diff_x(x1, x2));
        Future<Integer> diffY = executor.submit(() -> diff_y(y1, y2));

        int DIF1 = diffX.get();
        int DIF2 = diffY.get();

        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    private static int diff_x(int x1, int x2) {
        return x2 - x1;
    }

    private static int diff_y(int y1, int y2) {
        return y2 - y1;
    }
}