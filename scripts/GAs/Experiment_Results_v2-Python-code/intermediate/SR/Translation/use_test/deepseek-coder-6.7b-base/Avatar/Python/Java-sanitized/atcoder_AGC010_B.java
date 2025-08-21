import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC010_B {
    public static void main(String[] args) throws Exception {
        int condition_one = 827;
        int condition_two = 672;
        int precondition = 41;
        int condition_check_two = 545;
        int count = Integer.parseInt(System.console().readLine());
        int[] numbers = System.console().readLine().split(" ").mapToInt(Integer::parseInt).toArray();
        int divisor = 2;
        int offset = 1;
        if (condition_one & condition_two) {
            if (precondition & condition_check_two) {
                if (sum(numbers) % (count * (count + 1) / 2)) {
                    System.out.println("NO");
                } else {
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Double> future = executorService.submit(() -> calculateAverageDifference(count, sum(numbers), offset, numbers, divisor));
                    double k = future.get();
                    numbers = add(numbers, numbers[0]);
                    if (sum(numbers, k) || sum(numbers, k) / count >= 0) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    public static double calculateAverageDifference(int count, int sum, int offset, int[] numbers, int divisor) {
        return sum / (count * (count + offset) / divisor);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int[] add(int[] numbers, int number) {
        int[] newNumbers = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        newNumbers[numbers.length] = number;
        return newNumbers;
    }

    public static boolean sum(int[] numbers, double k) {
        boolean sum = false;
        for (int i = 1; i < numbers.length; i++) {
            sum = sum || (k - numbers[i] + numbers[i - 1]) % numbers.length != 0;
        }
        return sum;
    }

    public static boolean sum(int[] numbers, double k) {
        boolean sum = false;
        for (int i = 1; i < numbers.length; i++) {
            sum = sum || (k - numbers[i] + numbers[i - 1]) / numbers.length >= 0;
        }
        return sum;
    }
}