import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int[] input_array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            input_array[i] = scanner.nextInt();
        }
        int xor_sum = 0;
        for (int i = 0; i < array_size; i++) {
            xor_sum ^= input_array[i];
        }
        for (int i = 0; i < array_size; i++) {
            input_array[i] ^= xor_sum;
        }
        System.out.println(Arrays.toString(input_array).replaceAll("[\\[\\],]", ""));
    }
}