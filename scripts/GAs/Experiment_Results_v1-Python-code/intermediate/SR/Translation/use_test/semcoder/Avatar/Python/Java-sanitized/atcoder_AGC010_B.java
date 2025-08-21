import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        int divisor = 9997;
        int[] a = {174940, 224905, 274870, 324835, 374800, 424765, 474730, 524695, 574660, 624625, 674590, 724555, 774520, 824485, 874450, 924415, 974380, 1024345, 1074310, 1124275, 1174240, 1224205, 1274170, 1324135, 1374100, 1424065, 1474030, 1523995, 1573960, 1623925, 1673890, 1723855, 1773820, 1823785, 1873750, 1923715, 1973680, 2023645, 2073610, 2123575, 2173540, 2223505, 2273470, 2323435, 2373400, 2423365, 2473330, 2523295, 2573260, 2623225, 2673190, 2723155, 2773120, 2823085, 2873050, 2923015, 2972980, 3022945, 3072910, 3122875, 3172840, 3222805, 3272770, 3322735};
        int constantValue = 2;
        int offsetValue = 1;

        if ((conditionalCheckTwo & conditionalCheckThree) != 0) {
            if ((conditionalCheckOne & conditionalCheckFour) != 0) {
                if (sum(a) % (divisor * (divisor + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    Queue<Double> calculationQueue = new LinkedBlockingQueue<>();

                    Thread thread_calculateResult0 = new Thread(() -> {
                        double result = calculateResult(divisor, offsetValue, sum(a), a, constantValue);
                        calculationQueue.add(result);
                    });
                    thread_calculateResult0.start();
                    thread_calculateResult0.join();
                    double k = calculationQueue.poll();
                    a = Arrays.copyOf(a, a.length + 1);
                    a[a.length - 1] = a[0];
                    if (sum((int) ((k - i + j) % divisor)) != 0 || sum((int) ((k - i + j) / divisor)) != divisor) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    private static double calculateResult(int divisor, int offsetValue, int sum, int[] a, int constantValue) {
        return sum(a) / (divisor * (divisor + offsetValue) / constantValue);
    }
}