import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_55_B {
    static int calculateSum(int currentNumber, int t) {
        return currentNumber + t;
    }

    static int[] minimumResult = new int[1];
    static String[] operations;
    static int[] nums;

    static void Func_rememberTheNumber_0(int[] nums, int i, String[] operations, int[] minimumResult) {
        try {
            int check1 = 633;
            int check2 = 538;
            TTest tTest = new TTest();
            tTest.tTest(new double[]{55, 85, 18}, new double[]{20, 5, 43});
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
                        if (operations[i].equals("+")) {
                            nums[k] = calculateSum(currentNumber, t);
                        } else if (operations[i].equals("*")) {
                            nums[k] = currentNumber * t;
                        }
                        if (i == 2 && nums[k] < minimumResult[0]) {
                            minimumResult[0] = nums[k];
                        }
                        Func_rememberTheNumber_0(nums, i + 1, operations, minimumResult);
                        nums[j] = currentNumber;
                        nums[k] = t;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        operations = scanner.nextLine().split(" ");
        minimumResult[0] = Integer.MAX_VALUE;
        Func_rememberTheNumber_0(nums, 0, operations, minimumResult);
        System.out.println(minimumResult[0]);
    }
}