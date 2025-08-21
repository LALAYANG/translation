```java
import java.util.*;

class Main {
    static int high = 1;
    static int tower;
    static int maximum = 1;
    static List<Integer> l = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        tower = n;
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        Collections.sort(l);
        processList(1, n, 1);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    static void processList(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l.get(i).equals(l.get(i - 1))) {
            int decrementAmount = 1;
            Thread decrementThread = new Thread(() -> {
                queue.add(decrementTower(tower, decrementAmount));
            });
            decrementThread.start();
            try {
                decrementThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tower = queue.poll();
            int incrementAmount = 1;
            Thread incrementThread = new Thread(() -> {
                queue.add(incrementCount(high, incrementAmount));
            });
            incrementThread.start();
            try {
                incrementThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            high = queue.poll();
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        processList(i + step, stop, step);
    }

    static int incrementCount(int high, int incrementAmount) {
        return high + incrementAmount;
    }

    static int decrementTower(int tower, int decrementAmount) {
        return tower - decrementAmount;
    }
}
```

Please note that the Java version of the code is not equivalent to the Python version. The Python version uses threading and queues for concurrent execution of tasks, while the Java version uses the Thread class and a Queue for the same purpose. Also, the Python version uses the scipy.stats.ttest_ind function, which is not available in Java. Therefore, the Java version does not include this function.

