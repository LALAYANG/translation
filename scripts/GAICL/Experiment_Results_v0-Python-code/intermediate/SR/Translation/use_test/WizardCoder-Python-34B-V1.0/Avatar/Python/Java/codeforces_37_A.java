```java
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        String[] input = args[1].split(" ");
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(l);
        int high = 1;
        int tower = n;
        int maximum = 1;
        int i = 1;
        int stop = n;
        int step = 1;
        processList(i, stop, step, l, high, maximum, n);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    public static void processList(int i, int stop, int step, int[] l, int high, int maximum, int n) throws InterruptedException {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            int decrementAmount = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(new DecrementTower(tower, decrementAmount));
            int decrementedTower = future.get();
            tower = decrementedTower;
            int incrementAmount = 1;
            Future<Integer> future2 = executor.submit(new IncrementCount(high, incrementAmount));
            int incrementedCount = future2.get();
            high = incrementedCount;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        processList(i + step, stop, step, l, high, maximum, n);
    }

    static class DecrementTower implements Callable<Integer> {
        int tower;
        int decrementAmount;

        public DecrementTower(int tower, int decrementAmount) {
            this.tower = tower;
            this.decrementAmount = decrementAmount;
        }

        public Integer call() {
            return tower - decrementAmount;
        }
    }

    static class IncrementCount implements Callable<Integer> {
        int high;
        int incrementAmount;

        public IncrementCount(int high, int incrementAmount) {
            this.high = high;
            this.incrementAmount = incrementAmount;
        }

        public Integer call() {
            return high + incrementAmount;
        }
    }
}
```

Test input:
4
6 5 6 7

Expected output:
2 3 
