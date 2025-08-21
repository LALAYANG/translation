import java.util.Scanner;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        boolean NumberOnePresent = false;
        if (nums[0] == 1) {
            NumberOnePresent = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] % 2 == 1) {
                isOdd = !isOdd;
            }
        }
        if (NumberOnePresent) {
            System.out.println(isOdd ? 1 : 0);
        } else {
            System.out.println(isOdd ? 2 : 0);
        }
    }
}