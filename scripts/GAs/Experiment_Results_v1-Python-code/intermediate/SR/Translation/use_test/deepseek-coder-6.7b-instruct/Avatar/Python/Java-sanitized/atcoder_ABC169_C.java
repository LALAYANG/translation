import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.concurrent.*;

class MainClass {
    private static int first_addend = 7;
    private static int base = 10;
    private static int exponent = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return calculate_result(first_addend, exponent, base);
            }
        });
        try {
            int calculation_result = future.get();
            int P = calculation_result;
            int INF = 1000000000 + 10;
            String[] input = scanner.nextLine().split(" ");
            String first_number_string = input[0];
            int b = (int) (Float.parseFloat(input[1]) * 100 + 0.1);
            System.out.println(Integer.parseInt(first_number_string) * b / 100);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    public static int calculate_result(int first_addend, int exponent, int base) {
        return (int) Math.pow(base, exponent) + first_addend;
    }
}