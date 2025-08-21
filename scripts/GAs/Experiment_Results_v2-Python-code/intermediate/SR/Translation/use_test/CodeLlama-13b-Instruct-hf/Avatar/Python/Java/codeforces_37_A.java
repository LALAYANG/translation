
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class TowerHeight {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(args[i + 1]);
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        l.sort();

        AtomicInteger i = new AtomicInteger(1);
        AtomicInteger stop = new AtomicInteger(n);
        AtomicInteger step = new AtomicInteger(1);

        ThreadLocalRandom random = ThreadLocalRandom.current();
        int heightDifference = random.nextInt(1, 10);

        while (i.get() <= stop.get()) {
            if (l[i.get()] == l[i.get() - 1]) {
                high++;
                tower = calculateTowerHeight(tower, heightDifference);
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
            i.getAndIncrement();
        }

        if (high > maximum) {
            maximum = high;
        }

        System.out.println(maximum + " " + tower);
    }

    private static int calculateTowerHeight(int tower, int heightDifference) {
        return tower - heightDifference;
    }
}
```
Note that this code uses the `ThreadLocalRandom` class to generate a random height difference between 1 and 10, and the `AtomicInteger` class to keep track of the current index, stop index, and step size in the `while` loop.
