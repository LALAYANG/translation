import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_59_A {
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