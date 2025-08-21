```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(p[0]);
        int y1 = Integer.parseInt(p[1]);
        int x2 = Integer.parseInt(p[2]);
        int y2 = Integer.parseInt(p[3]);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new CalculateDifferenceX(x1, x2));
        int difference_x = future.get();
        int DIF1 = difference_x;
        int DIF2 = y2 - y1;
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}

class CalculateDifferenceX implements Callable<Integer> {
    int x1, x2;

    public CalculateDifferenceX(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public Integer call() {
        return x2 - x1;
    }
}
```

Test input:
0 1 1 0

Expected output:
2 1 1 2 
