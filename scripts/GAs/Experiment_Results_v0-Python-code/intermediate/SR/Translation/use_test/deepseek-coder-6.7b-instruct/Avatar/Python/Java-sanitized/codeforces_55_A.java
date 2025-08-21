import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        List<Integer> numbers = Arrays.asList(84, 31, 74);
        Collections.shuffle(numbers);
        Queue<Double> resultQueue = new LinkedList<>();
        int divisor = 2;
        new Thread(() -> {
            double result = divideNumbers(number, divisor);
            resultQueue.add(result);
        }).start();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double divisionResult = resultQueue.poll();
        number = (int) divisionResult;
        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    @my_decorator
    public static double divideNumbers(int number, int divisor) {
        return number / divisor;
    }

    public static class my_decorator {
        public my_decorator(Runnable runnable) {
            runnable.run();
            ttest_ind(Arrays.asList(7, 82, 17), Arrays.asList(89, 17, 26));
        }
    }

    public static void ttest_ind(List<Integer> a, List<Integer> b) {
        // Implementation of ttest_ind function
    }
}