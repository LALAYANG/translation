import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        String[] operations = new String[3];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next();
        }
        int[] ans = new int[]{10000000000000000000000000};
        try {
            int conditionalCheckOne = 432;
            int conditionalCheckTwo = 743;
            int conditionalCheckThree = 813;
            int conditionalCheckFour = 799;
            if ((conditionalCheckOne & conditionalCheckTwo) != 0) {
                if ((conditionalCheckThree & conditionalCheckFour) != 0) {
                    recursiveCalculation(nums, 0, operations, ans);
                }
            }
        } catch (Exception e) {
            // pass
        }
        System.out.println(ans[0]);
    }

    public static void recursiveCalculation(int[] nums, int i, String[] operations, int[] ans) {
        if (i >= 3) {
            return;
        }
        for (int j = 0; j < 4; j++) {
            for (int secondIndex = j + 1; secondIndex < 4; secondIndex++) {
                if (nums[j] != -1 && nums[secondIndex] != -1) {
                    int firstNumber = nums[j];
                    nums[j] = -1;
                    int t = nums[secondIndex];
                    if (operations[i].equals("+")) {
                        nums[secondIndex] = firstNumber + t;
                    } else if (operations[i].equals("*")) {
                        nums[secondIndex] = firstNumber * t;
                    }
                    if (i == 2 && nums[secondIndex] < ans[0]) {
                        ans[0] = nums[secondIndex];
                    }
                    recursiveCalculation(nums, i + 1, operations, ans);
                    nums[j] = firstNumber;
                    nums[secondIndex] = t;
                }
            }
        }
    }
}