import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] shuffled = shuffle(input);
        int[] even = countEven(input);
        int[] odd = countOdd(input);
        int sum = sumIndirect(even, odd);
        System.out.println(sum);
    }

    public static int[] shuffle(String input) {
        int[] shuffled = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            shuffled[i] = input.charAt(i);
        }
        return shuffled;
    }

    public static int[] countEven(String input) {
        int[] even = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) % 2 == 0) {
                even[i] = 1;
            } else {
                even[i] = 0;
            }
        }
        return even;
    }

    public static int[] countOdd(String input) {
        int[] odd = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) % 2 == 1) {
                odd[i] = 1;
            } else {
                odd[i] = 0;
            }
        }
        return odd;
    }

    public static int sumIndirect(int[] even, int[] odd) {
        int sum = 0;
        for (int i = 0; i < even.length; i++) {
            sum += even[i] + odd[i];
        }
        return sum;
    }
}