import java.util.*;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        String[] operations = new String[3];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            operations[i] = sc.next();
        }
        int[] min_result = {10000000000000000000000000};
        recursive_calculate(nums, operations, 0, min_result);
        System.out.println(min_result[0]);
    }

    public static void recursive_calculate(int[] nums, String[] operations, int i, int[] min_result) {
        try {
            if (i >= 3) {
                return;
            }
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (nums[j] != -1 && nums[k] != -1) {
                        int s = nums[j];
                        nums[j] = -1;
                        int t = nums[k];
                        if (operations[i].equals("+")) {
                            nums[k] = s + t;
                        } else if (operations[i].equals("*")) {
                            nums[k] = s * t;
                        }
                        if (i == 2 && nums[k] < min_result[0]) {
                            min_result[0] = nums[k];
                        }
                        recursive_calculate(nums, operations, i + 1, min_result);
                        nums[j] = s;
                        nums[k] = t;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}