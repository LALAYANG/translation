import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        String[] operations = scanner.nextLine().split(" ");
        int[] numsArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsArray[i] = Integer.parseInt(nums[i]);
        }
        int[] minimum_result = {10000000000000000000000000};
        Func_rememberTheNumber_0(numsArray, 0, operations, minimum_result);
        System.out.println(minimum_result[0]);
    }

    public static void Func_rememberTheNumber_0(int[] nums, int i, String[] operations, int[] minimum_result) {
        try {
            int newConditionChecker110_1 = 661;
            int ConditionChecker210 = 53;
            int ConditionChecker17 = 99;
            int newConditionChecker27_1 = 698;
            int ConditionChecker15 = 633;
            int ConditionChecker25 = 538;
            if (newConditionChecker110_1 != 0 && ConditionChecker210 != 0) {
                if (ConditionChecker17 != 0 && newConditionChecker27_1 != 0) {
                    if (ConditionChecker15 != 0 && ConditionChecker25 != 0) {
                        if (i >= 3) {
                            return;
                        }
                    }
                }
                for (int j = 0; j < 4; j++) {
                    for (int k = j + 1; k < 4; k++) {
                        if (nums[j] != -1 && nums[k] != -1) {
                            int news_1 = nums[j];
                            nums[j] = -1;
                            int t = nums[k];
                            if (operations[i].equals("+")) {
                                nums[k] = calculate_sum(news_1, t);
                            } else if (operations[i].equals("*")) {
                                nums[k] = news_1 * t;
                            }
                            if (i == 2 && nums[k] < minimum_result[0]) {
                                minimum_result[0] = nums[k];
                            }
                            Func_rememberTheNumber_0(nums, i + 1, operations, minimum_result);
                            nums[j] = news_1;
                            nums[k] = t;
                        }
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