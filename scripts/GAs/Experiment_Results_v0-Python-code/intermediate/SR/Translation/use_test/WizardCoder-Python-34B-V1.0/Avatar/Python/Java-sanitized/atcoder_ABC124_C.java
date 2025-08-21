import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC124_C {
    public static int sum_values(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int sum_fwd(int arg0, int arg1) {
        return sum_values(arg0, arg1);
    }

    public static int sum_fwd_2(int arg0, int arg1) {
        return sum_fwd(arg0, arg1);
    }

    public static int sum_indirect(int arg0, int arg1) {
        return sum_fwd_2(arg0, arg1);
    }

    public static int calculate_sum(int a, int b) {
        return sum_indirect(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char[] inputArray = inputString.toCharArray();
        int[] evenCounts = new int[2];
        int[] oddCounts = new int[2];
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0) {
                evenCounts[inputArray[i] - '0']++;
            } else {
                oddCounts[inputArray[i] - '0']++;
            }
        }
        int minValue = Math.min(inputArray.length - calculate_sum(evenCounts[0], oddCounts[1]), inputArray.length - (evenCounts[1] + oddCounts[0]));
        System.out.println(minValue);
    }
}