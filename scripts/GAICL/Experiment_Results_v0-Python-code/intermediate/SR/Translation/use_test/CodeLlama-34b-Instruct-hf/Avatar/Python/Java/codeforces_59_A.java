```java
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class UpperLowerCounter {
    private int upperCount = 0;
    private int lowerCount = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void incrementUpperCount(int upperIncrement) {
        lock.lock();
        try {
            upperCount += upperIncrement;
        } finally {
            lock.unlock();
        }
    }

    public void incrementLowerCount(int lowerIncrement) {
        lock.lock();
        try {
            lowerCount += lowerIncrement;
        } finally {
            lock.unlock();
        }
    }

    public int getUpperCount() {
        return upperCount;
    }

    public int getLowerCount() {
        return lowerCount;
    }
}
```

Explanation:

1. The `UpperLowerCounter` class has two methods `incrementUpperCount` and `incrementLowerCount` that increment the respective counters.
2. The `incrementUpperCount` method takes an integer `upperIncrement` as an argument and increments the `upperCount` by that amount.
3. The `incrementLowerCount` method takes an integer `lowerIncrement` as an argument and increments the `lowerCount` by that amount.
4. The `getUpperCount` method returns the current value of the `upperCount`.
5. The `getLowerCount` method returns the current value of the `lowerCount`.
6. The `lock` variable is a `ReentrantLock` that is used to synchronize access to the counters.
7. The `incrementUpperCount` and `incrementLowerCount` methods use the `lock` to ensure that only one thread can access the counters at a time.

Note: The `ReentrantLock` is a more advanced synchronization mechanism that allows for more fine-grained control over synchronization. In this case, it is used to ensure that only one thread can increment the counters at a time.
