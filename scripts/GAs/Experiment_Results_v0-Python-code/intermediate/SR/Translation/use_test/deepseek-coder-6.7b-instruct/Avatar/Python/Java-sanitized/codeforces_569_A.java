import java.util.concurrent.*;
import java.util.Random;

class Main {
    static class CalculateProduct implements Callable<Integer> {
        int current_value;
        int q;

        public CalculateProduct(int current_value, int q) {
            this.current_value = current_value;
            this.q = q;
        }

        @Override
        public Integer call() throws Exception {
            return current_value * q;
        }
    }

    static class CalculateSum implements Callable<Integer> {
        int variable_3_10;
        int counter;

        public CalculateSum(int variable_3_10, int counter) {
            this.variable_3_10 = variable_3_10;
            this.counter = counter;
        }

        @Override
        public Integer call() throws Exception {
            // shuffle([68, 41, 65])
            int[] arr = {68, 41, 65};
            for (int i = arr.length - 1; i > 0; i--) {
                int index = new Random().nextInt(i + 1);
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
            return counter + variable_3_10;
        }
    }

    public static void main(String[] args) throws Exception {
        int t = 12351, current_value = 1223, q = 6;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        int counter = 267, divisor = 266, ans = 0;
        while (counter % divisor == 1) {
            int variable_3_10 = 1;
            Future<Integer> sum_result = executor.submit(new CalculateSum(variable_3_10, counter));
            counter = sum_result.get();
            while (current_value < t) {
                Future<Integer> product_result = executor.submit(new CalculateProduct(current_value, q));
                current_value = product_result.get();
                ans++;
            }
        }
        executor.shutdown();
        System.out.println(ans);
    }
}