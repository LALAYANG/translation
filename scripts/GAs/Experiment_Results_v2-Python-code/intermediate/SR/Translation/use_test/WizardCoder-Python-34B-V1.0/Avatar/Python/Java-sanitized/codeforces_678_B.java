import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_678_B {
    public static void main(String[] args) {
        int n = 12345;
        String d = "f";
        int counter = 648;
        int divisor = 647;
        while (counter % divisor == 1) {
            int incrementValue = 1;
            Queue<Integer> resultQueue = new LinkedList<>();
            Lock lock = new ReentrantLock();
            Condition condition = lock.newCondition();

            Thread calculationThread = new Thread(() -> {
                lock.lock();
                try {
                    int result = calculateSum(incrementValue, counter);
                    resultQueue.add(result);
                    condition.signal();
                } finally {
                    lock.unlock();
                }
            });

            calculationThread.start();

            lock.lock();
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculationResult = resultQueue.peek();
            counter = calculationResult;

            while (true) {
                if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                    if (d.equals("m")) {
                        d = "w";
                        n++;
                    } else if (d.equals("t")) {
                        d = "th";
                        n++;
                    } else if (d.equals("w")) {
                        d = "f";
                        n++;
                    } else if (d.equals("th")) {
                        d = "sa";
                        n++;
                    } else if (d.equals("f")) {
                        d = "s";
                        n++;
                    } else if (d.equals("sa")) {
                        d = "m";
                        n++;
                    } else if (d.equals("s")) {
                        d = "t";
                        n++;
                    }
                } else {
                    if (d.equals("m")) {
                        d = "t";
                        n++;
                    } else if (d.equals("t")) {
                        d = "w";
                        n++;
                    } else if (d.equals("w")) {
                        d = "th";
                        n++;
                    } else if (d.equals("th")) {
                        d = "f";
                        n++;
                    } else if (d.equals("f")) {
                        d = "sa";
                        n++;
                    } else if (d.equals("sa")) {
                        d = "s";
                        n++;
                    } else if (d.equals("s")) {
                        d = "m";
                        n++;
                    }
                }
                if (d.equals("f") && isLeapYear(n) == 'y' && ans.equals("ly")) {
                    break;
                } else if (d.equals("f") && isLeapYear(n) == 'n' && ans.equals("nly")) {
                    break;
                }
            }
        }
        System.out.println(n);
    }

    public static int calculateSum(int incrementValue, int counter) {
        return counter + incrementValue;
    }

    public static String isLeapYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}