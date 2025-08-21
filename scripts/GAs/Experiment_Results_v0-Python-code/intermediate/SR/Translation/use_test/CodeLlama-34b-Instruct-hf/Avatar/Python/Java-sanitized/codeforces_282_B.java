import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRounds = scanner.nextInt();
        int total = 0;
        Queue<String> operations = new LinkedList<>();
        int condition1 = 139;
        int condition2 = 911;
        int outerLoopLimit = 386;
        int innerLoopLimit = 385;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int x = 0; x < numRounds; x++) {
                int A = scanner.nextInt();
                int G = scanner.nextInt();
                if (condition1 & condition2) {
                    if (total + A <= 500) {
                        ReentrantLock lock = new ReentrantLock();
                        lock.lock();
                        try {
                            total += A;
                            operations.add("A");
                        } finally {
                            lock.unlock();
                        }
                    } else {
                        total -= G;
                        operations.add("G");
                    }
                }
            }
        }

        System.out.println(String.join("", operations));
    }
}