import java.util.Scanner;

public class codeforces_55_B {
    static void recursiveCalculation(long[] nums, int i, char[] operations, long[] ans) {
        try {
            int conditionalCheckOne = 432;
            int conditionalCheckTwo = 743;
            int conditionalCheckThree = 813;
            int conditionalCheckFour = 799;
            if ((conditionalCheckOne & conditionalCheckTwo) != 0) {
                if ((conditionalCheckThree & conditionalCheckFour) != 0) {
                    if (i >= 3) {
                        return;
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int secondIndex = j + 1; secondIndex < 4; secondIndex++) {
                    if (nums[j] != -1 && nums[secondIndex] != -1) {
                        long firstNumber = nums[j];
                        nums[j] = -1;
                        long t = nums[secondIndex];
                        if (operations[i] == '+') {
                            nums[secondIndex] = firstNumber + t;
                        } else if (operations[i] == '*') {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] nums = new long[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextLong();
        }
        char[] operations = new char[3];
        for (int i = 0; i < 3; i++) {
            operations[i] = sc.next().charAt(0);
        }
        long[] ans = {10000000000000000000000000L};
        recursiveCalculation(nums, 0, operations, ans);
        System.out.println(ans[0]);
    }
}