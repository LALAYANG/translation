import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int[] b;
    static int array_size;
    static int multiplier = 2;
    static int m;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        m = scanner.nextInt();
        int[] initial_list = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            initial_list[i] = 1;
        }

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculate_product(multiplier, initial_list, array_size));
        b = new int[future.get()];
        executorService.shutdown();

        for (int i = 0; i < m; i++) {
            int row_index = scanner.nextInt();
            int c = scanner.nextInt();
            b[row_index - 1] = b[array_size + c - 1] = 0;
        }

        if (array_size % 2 != 0 && b[array_size / 2] != 0 && b[array_size + array_size / 2] != 0) {
            b[array_size / 2] = 0;
        }

        int sum = 0;
        for (int i : b) {
            sum += i;
        }
        System.out.println(sum);
    }

    static int calculate_product(int multiplier, int[] initial_list, int array_size) {
        return array_size * multiplier;
    }
}