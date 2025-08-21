import java.util.*;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] operations = scanner.nextLine().split(" ");
        long[] ans = {Long.MAX_VALUE};
        recursiveCalculation(nums, 0, operations, ans);
        System.out.println(ans[0]);
    }

    public static void recursiveCalculation(int[] nums, int i, String[] operations, long[] ans) {
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
        } catch (Exception e) {
            // pass
        }
    }
}