import java.util.Scanner;

public class codeforces_55_B {
    public static int calculateSum(int currentNumber, int t) {
        return currentNumber + t;
    }

    public static void Func_rememberTheNumber_0(int[] nums, int i, char[] operations, long[] minimum_result) {
        try {
            int check1 = 633;
            int check2 = 538;
            // ttest_ind([55, 85, 18], [20, 5, 43])
            if ((check1 & check2) != 0) {
                if (i >= 3) {
                    return;
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (nums[j] != -1 && nums[k] != -1) {
                        int currentNumber = nums[j];
                        nums[j] = -1;
                        int t = nums[k];
                        if (operations[i] == '+') {
                            nums[k] = calculateSum(currentNumber, t);
                        } else if (operations[i] == '*') {
                            nums[k] = currentNumber * t;
                        }
                        if (i == 2 && nums[k] < minimum_result[0]) {
                            minimum_result[0] = nums[k];
                        }
                        Func_rememberTheNumber_0(nums, i + 1, operations, minimum_result);
                        nums[j] = currentNumber;
                        nums[k] = t;
                    }
                }
            }
        } catch (Exception e) {
            // Handle exceptions
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        char[] operations = new char[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            operations[i] = scanner.next().charAt(0);
        }
        long[] minimum_result = new long[]{10000000000000000000000000L};
        Func_rememberTheNumber_0(nums, 0, operations, minimum_result);
        System.out.println(minimum_result[0]);
    }
}