import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] even = new int[2];
        int[] odd = new int[2];

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                even[input.charAt(i) - '0']++;
            } else {
                odd[input.charAt(i) - '0']++;
            }
        }

        int minOperations = Math.min(input.length() - (even[0] + odd[1]), input.length() - (even[1] + odd[0]));
        System.out.println(minOperations);
    }
}