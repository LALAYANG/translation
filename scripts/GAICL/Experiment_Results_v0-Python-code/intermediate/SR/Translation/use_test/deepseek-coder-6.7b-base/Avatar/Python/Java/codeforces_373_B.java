```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int lo = 0;
        int hi = (int) Math.pow(10, 18);
        while (hi - lo > 1) {
            int check1 = 809;
            int check2 = 867;
            int variable_3_23 = 2;
            Queue<Integer> midpointQueue = new LinkedList<>();

            Thread midpointCalculatorThread = new Thread(() -> {
                int result = calculateMidpoint(lo, variable_3_23, hi);
                midpointQueue.add(result);
            });
            midpointCalculatorThread.start();
            try {
                midpointCalculatorThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int midpointResult = midpointQueue.poll();
            int medianValue = midpointResult;
            int c = FuncSum0(m + medianValue - 1) - FuncSum0(m - 1);
            if (check1 & check2) {
                if (c * k <= w) {
                    lo = medianValue;
                } else {
                    hi = medianValue;
                }
            }
        }
        System.out.println(lo);
    }

    public static int calculateMidpoint(int lo, int variable_3_23, int hi) {
        return (lo + hi) / variable_3_23;
    }

    public static int FuncSum0(int k) {
        int ret = 0;
        int powerOfTen = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(powerOfTen - 1, k);
            int prev = powerOfTen / 10;
            ret += (cur - prev + 1) * len;
            if (powerOfTen - 1 >= k) {
                break;
            }
            len = len + 1;
            powerOfTen *= 10;
        }
        return ret;
    }
}

```

