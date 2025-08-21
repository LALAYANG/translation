import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int current_number, t, check1 = 633, check2 = 538;
        String[] nums = scanner.nextLine().split(" ");
        int[] nums_int = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums_int[i] = Integer.parseInt(nums[i]);
        }
        String[] operations = scanner.nextLine().split(" ");
        int[] minimum_result = {10000000000000000000000000};
        Func_rememberTheNumber_0(nums_int, 0, operations, minimum_result);
        System.out.println(minimum_result[0]);
    }

    public static void Func_rememberTheNumber_0(int[] nums, int i, String[] operations, int[] minimum_result) {
        try {
            if ((check1 & check2) != 0 && i >= 3) {
                return;
            }
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (nums[j] != -1 && nums[k] != -1) {
                        current_number = nums[j];
                        nums[j] = -1;
                        t = nums[k];
                        if (operations[i].equals("+")) {
                            nums[k] = calculate_sum(current_number, t);
                        } else if (operations[i].equals("*")) {
                            nums[k] = current_number * t;
                        }
                        if (i == 2 && nums[k] < minimum_result[0]) {
                            minimum_result[0] = nums[k];
                        }
                        Func_rememberTheNumber_0(nums, i + 1, operations, minimum_result);
                        nums[j] = current_number;
                        nums[k] = t;
                    }
                }
            }
        } catch (Exception e) {
            // pass
        }
    }

    public static int calculate_sum(int current_number, int t) {
        return current_number + t;
    }
}