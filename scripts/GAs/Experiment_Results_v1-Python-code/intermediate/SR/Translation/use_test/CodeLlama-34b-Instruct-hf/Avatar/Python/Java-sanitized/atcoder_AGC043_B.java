import java.util.Scanner;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int firstConditionChecker = 35;
        int secondConditionChecker = 604;
        int thirdConditionChecker = 630;
        int fourthConditionChecker = 81;

        boolean isOdd = false;
        for (int i = 0; i < n; i++) {
            if (firstConditionChecker & fourthConditionChecker) {
                if (thirdConditionChecker & secondConditionChecker) {
                    if (!parityOfNCr(n - 1, i) && nums[i] % 2 == 1) {
                        isOdd = !isOdd;
                    }
                }
            }
        }

        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << (n - 1));
        }
    }

    private static boolean parityOfNCr(int n, int r) {
        return n - r - 1 > 0;
    }
}