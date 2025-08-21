```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(p[0]);
        int y1 = Integer.parseInt(p[1]);
        int x2 = Integer.parseInt(p[2]);
        int y2 = Integer.parseInt(p[3]);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> diff_x_result = executor.submit(new DiffXTask(x1, x2));
        Future<Integer> diff_y_result = executor.submit(new DiffYTask(y1, y2));

        try {
            int DIF1 = diff_x_result.get();
            int DIF2 = diff_y_result.get();
            int x3 = x2 - DIF2;
            int y3 = y2 + DIF1;
            int x4 = x1 - DIF2;
            int y4 = y1 + DIF1;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class DiffXTask implements Callable<Integer> {
    int x1, x2;

    public DiffXTask(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public Integer call() {
        return x2 - x1;
    }
}

class DiffYTask implements Callable<Integer> {
    int y1, y2;

    public DiffYTask(int y1, int y2) {
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public Integer call() {
        return y2 - y1;
    }
}
```

Test input:
0 1 1 0

Expected output:
2 1 1 2 
