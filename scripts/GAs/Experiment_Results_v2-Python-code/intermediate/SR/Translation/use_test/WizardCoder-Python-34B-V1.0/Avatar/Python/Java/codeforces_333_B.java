```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int m = scanner.nextInt();
        int[] initial_list = {1};
        int multiplier = 2;
        int[] b = new int[2 * array_size + 1];

        calculate_product(multiplier, initial_list, array_size, b);

        process_input(0, m, 1, scanner, b);

        if (array_size % 2 != 0 && b[array_size / 2] != 0 && b[array_size + array_size / 2] != 0) {
            b[array_size / 2] = 0;
        }

        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }

    public static void calculate_product(int multiplier, int[] initial_list, int array_size, int[] b) {
        int result = initial_list[0] * array_size * multiplier;
        b[array_size - 1] = b[array_size] = b[2 * array_size - 1] = 0;
    }

    public static void process_input(int i, int stop, int step, Scanner scanner, int[] b) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int row_index = scanner.nextInt();
        int c = scanner.nextInt();
        b[row_index - 1] = b[array_size + c - 1] = 0;
        process_input(i + step, stop, step, scanner, b);
    }
}
``` 
