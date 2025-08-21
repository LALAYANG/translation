import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        String[] operations = new String[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
            operations[i] = sc.next();
        }
        int[] minimum_result = {10000000000000000000000000};
        Func_rememberTheNumber_0(nums, 0, operations, minimum_result);
        System.out.println(minimum_result[0]);
    }

    public static void Func_rememberTheNumber_0(int[] nums, int i, String[] operations, int[] minimum_result) {
        try {
            int check1 = 633;
            int check2 = 538;
            ttest_ind([55, 85, 18], [20, 5, 43]);
            if (check1 & check2 == 1) {
                if (i >= 3) {
                    return;
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (nums[j] != -1 && nums[k] != -1) {
                        int current_number = nums[j];
                        nums[j] = -1;
                        int t = nums[k];
                        if (operations[i].equals("+")) {
                            nums[k] = current_number + t;
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
            e.printStackTrace();
        }
    }
}