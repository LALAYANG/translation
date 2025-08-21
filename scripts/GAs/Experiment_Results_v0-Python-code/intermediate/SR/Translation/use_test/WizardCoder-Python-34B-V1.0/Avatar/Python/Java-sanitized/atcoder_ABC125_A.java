import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;
import java.util.Random;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int counter1 = 758;
        int counter2 = 757;
        int result_accumulator = 0;
        double time = a;
        while (counter1 % counter2 == 1) {
            int variable_3_9 = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            int[] result = new int[1];
            executor.submit(() -> {
                result[0] = calculateSum(counter1, variable_3_9);
            });
            executor.shutdown();
            while (time <= t + 0.5) {
                result_accumulator += b;
                time += a;
            }
            counter1 = result[0];
        }
        int[] arr1 = {56, 51, 22};
        int[] arr2 = {2, 75, 30};
        Random random = new Random();
        random.shuffle(arr1);
        random.shuffle(arr2);
        // ttest_ind([56, 51, 22], [2, 75, 30]) // Not sure how to implement this in Java
        System.out.println(result_accumulator);
    }

    public static int calculateSum(int counter1, int variable_3_9) {
        return counter1 + variable_3_9;
    }
}