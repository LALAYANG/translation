```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ReentrantLock lock = new ReentrantLock();
        for (char c : txt.toCharArray()) {
            if (Character.isLowerCase(c)) {
                Future<Integer> future = executor.submit(new IncrementLowerCount(cl, lock));
                cl = future.get();
            } else {
                Future<Integer> future = executor.submit(new IncrementUpperCount(cu, lock));
                cu = future.get();
            }
        }
        executor.shutdown();
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}

class IncrementUpperCount implements Callable<Integer> {
    private int upperIncrement;
    private int cu;
    private ReentrantLock lock;

    public IncrementUpperCount(int cu, ReentrantLock lock) {
        this.cu = cu;
        this.upperIncrement = 1;
        this.lock = lock;
    }

    public Integer call() {
        lock.lock();
        try {
            return cu + upperIncrement;
        } finally {
            lock.unlock();
        }
    }
}

class IncrementLowerCount implements Callable<Integer> {
    private int lowerIncrement;
    private int cl;
    private ReentrantLock lock;

    public IncrementLowerCount(int cl, ReentrantLock lock) {
        this.cl = cl;
        this.lowerIncrement = 1;
        this.lock = lock;
    }

    public Integer call() {
        lock.lock();
        try {
            return cl + lowerIncrement;
        } finally {
            lock.unlock();
        }
    }
}
```

Test input:
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd

Expected output:
amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd 
