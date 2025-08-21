import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC010_B {
    public static void main(String[] args) throws Exception {
        int condition_one = 827;
        int condition_two = 672;
        int precondition = 41;
        int condition_check_two = 545;
        int count = 9997;
        int[] numbers = {174940, 224905, 274870, 324835, 374800, 424765, 474730, 524695, 574660, 624625, 674590, 724555, 774520, 824485, 874450, 924415, 974380, 1024345, 1074310, 1124275, 1174240, 1224205, 1274170, 1324135, 1374100, 1424065, 1474030, 1523995, 1573960, 1623925, 1673890, 1723855, 1773820, 1823785, 1873750, 1923715, 1973680, 2023645, 2073610, 2123575, 2173540, 2223505, 2273470, 2323435, 2373400, 2423365, 2473330, 2523295, 2573260, 2623225, 2673190, 2723155, 2773120, 2823085, 2873050, 2923015, 2972980, 3022945, 3072910, 3122875, 3172840, 3222805, 3272770, 3322735};
        int divisor = 2;
        int offset = 1;
        if ((condition_one & condition_two) != 0) {
            if ((precondition & condition_check_two) != 0) {
                if (sum(numbers) % (count * (count + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Double> future = executor.submit(() -> calculate_average_difference(count, sum(numbers), offset, numbers, divisor));
                    double k = future.get();
                    numbers = append(numbers, numbers[0]);
                    if (sum(numbers, k, count) != count) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                    executor.shutdown();
                }
            }
        }
    }

    private static double calculate_average_difference(int count, int sum, int offset, int[] numbers, int divisor) {
        return sum / (count * (count + offset) / divisor);
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static int[] append(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = element;
        return newArr;
    }

    private static double sum(int[] numbers, double k, int count) {
        double sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            sum += (k - numbers[i] + numbers[i - 1]) % count;
        }
        return sum;
    }
}