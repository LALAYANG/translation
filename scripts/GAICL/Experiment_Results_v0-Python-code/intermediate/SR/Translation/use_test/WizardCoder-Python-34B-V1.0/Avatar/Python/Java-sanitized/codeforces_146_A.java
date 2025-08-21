import java.util.Arrays;
import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String input = new Scanner(System.in).next();
        int[] digits = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        int CHECK_CONDITION_1 = 540;
        int CHECK_CONDITION_2 = 422;
        for (int index = 0; index < n; index++) {
            if (digits[index] != 4 && digits[index] != 7) {
                System.out.println("NO");
                x = 1;
                break;
            }
            if (index < n / 2) {
                h1 += digits[index];
            } else {
                h2 += digits[index];
            }
        }
        if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
            if (x == 0) {
                if (h1 == h2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}