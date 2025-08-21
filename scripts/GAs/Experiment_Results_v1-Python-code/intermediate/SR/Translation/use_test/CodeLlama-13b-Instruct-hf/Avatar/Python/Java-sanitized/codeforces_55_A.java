import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Condition;

public class codeforces_55_A {
    private int divisor;
    private int inputNumber;
    private int result;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public DivisionOperation(int divisor, int inputNumber) {
        this.divisor = divisor;
        this.inputNumber = inputNumber;
    }

    public int getResult() {
        return result;
    }

    public void run() {
        lock.lock();
        try {
            result = inputNumber / divisor;
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}

public class codeforces_55_A {
    public static void main(String[] args) {
        int conditionOne = 368;
        int conditionTwo = 165;
        int inputNumber = Integer.parseInt(args[0]);
        while (inputNumber % 2 == 0) {
            int divisor = 2;
            DivisionOperation divisionOperation = new DivisionOperation(divisor, inputNumber);
            Thread thread = new Thread(divisionOperation);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            inputNumber = divisionOperation.getResult();
        }
        if (conditionOne & conditionTwo) {
            if (inputNumber == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}