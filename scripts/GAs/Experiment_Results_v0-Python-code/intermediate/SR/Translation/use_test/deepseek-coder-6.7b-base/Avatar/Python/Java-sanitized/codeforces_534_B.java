import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_534_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialVelocity = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = initialVelocity;
        int distance = 0;
        int conditionCheck1 = 348;
        int conditionCheck2 = 296;
        int innerLoopLimit = 722;
        int outerLoopLimit = 721;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < t; i++) {
                if ((conditionCheck1 & conditionCheck2) > 0) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                }
                Queue<Integer> functionQueue = new LinkedList<>();
                Thread functionThread = new Thread(() -> {
                    int result = calculateDistance(v, distance);
                    functionQueue.add(result);
                });
                functionThread.start();
                try {
                    functionThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                distance = functionQueue.poll();
                v += a * d;
            }
        }
        System.out.println(distance);
    }

    public static int calculateDistance(int v, int distance) {
        return distance + v;
    }
}