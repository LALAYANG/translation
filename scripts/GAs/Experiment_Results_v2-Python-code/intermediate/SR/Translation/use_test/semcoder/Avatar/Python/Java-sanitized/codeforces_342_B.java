import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_342_B {
    public static int calculateSum(int k, int increment) {
        return k + increment;
    }

    public static void main(String[] args) {
        int n = 500;
        int m = 100000;
        int s = 103;
        int f = 77;
        int t = 1;
        int l = 417;
        int r = 476;

        String direction = "R";
        if (s < f) {
            direction = "R";
        } else {
            direction = "L";
        }

        String result = "";
        int i = 1;
        int j = s;

        while (j != f) {
            if (i > t && i < m) {
                // Simulating input reading
                int newT = 2;
                int newL = 314;
                int newR = 496;

                int increment = 1;
                Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

                Thread calculationThread = new Thread(() -> {
                    int calculatedValue = calculateSum(i, increment);
                    resultQueue.add(calculatedValue);
                });
                calculationThread.start();
                try {
                    calculationThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i = resultQueue.poll();
            }

            if (i == t && (l <= j && j <= r || l <= j + increment && j + increment <= r)) {
                result += "X";
            } else {
                result += direction;
                j += increment;
            }
            i++;
        }

        System.out.println(result);
    }
}