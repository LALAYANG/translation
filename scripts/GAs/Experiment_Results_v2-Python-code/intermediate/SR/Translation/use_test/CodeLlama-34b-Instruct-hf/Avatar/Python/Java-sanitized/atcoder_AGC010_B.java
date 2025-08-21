import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(args[i + 1]);
        }

        int divisor = 2;
        int offset = 1;

        if (conditionOne(count, numbers) && conditionTwo(count, numbers)) {
            if (precondition(count, numbers) && conditionCheckTwo(count, numbers)) {
                if (sum(numbers) % (count * (count + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Double> future = executor.submit(() -> calculateAverageDifference(count, sum, offset, numbers, divisor));
                    try {
                        Double result = future.get(1, TimeUnit.SECONDS);
                        if (result == null) {
                            System.out.println("NO");
                        } else {
                            System.out.println("YES");
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    private static boolean conditionOne(int count, int[] numbers) {
        // Implement condition one
        return true;
    }

    private static boolean conditionTwo(int count, int[] numbers) {
        // Implement condition two
        return true;
    }

    private static boolean precondition(int count, int[] numbers) {
        // Implement precondition
        return true;
    }

    private static boolean conditionCheckTwo(int count, int[] numbers) {
        // Implement condition check two
        return true;
    }

    private static double calculateAverageDifference(int count, int sum, int offset, int[] numbers, int divisor) {
        // Implement calculate average difference
        return 0.0;
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}