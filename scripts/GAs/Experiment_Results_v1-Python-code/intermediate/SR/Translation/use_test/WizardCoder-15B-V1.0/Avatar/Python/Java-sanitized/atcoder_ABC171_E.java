import java.util.*;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] input_array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            input_array[i] = sc.nextInt();
        }
        int xor_sum = Arrays.stream(input_array).reduce(0, (a, b) -> a ^ b);
        String[] output_array = Arrays.stream(input_array).mapToObj(ai -> String.valueOf(xor_operation(ai, xor_sum))).toArray(String[]::new);
        System.out.println(String.join(" ", output_array));
    }

    public static int xor_operation(int a, int b) {
        return a ^ b;
    }
}