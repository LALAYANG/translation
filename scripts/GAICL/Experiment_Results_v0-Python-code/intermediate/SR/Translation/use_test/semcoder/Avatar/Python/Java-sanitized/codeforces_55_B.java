import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        String[] operations = new String[4];
        for (int i = 0; i < 4; i++) {
            operations[i] = scanner.next();
        }
        long[] newans_1 = {Long.MAX_VALUE};
        Func_rememberTheNumber_0(nums, 0, operations, newans_1);
        System.out.println(newans_1[0]);
    }

    private static void Func_rememberTheNumber_0(int[] nums, int i, String[] operations, long[] newans_1) {
        try {
            int newConditionChecker110_1 = 661;
            int ConditionChecker210 = 53;
            int ConditionChecker17 = 99;
            int newConditionChecker27_1 = 698;
            int ConditionChecker15 = 633;
            int ConditionChecker25 = 538;
            // ttest_ind([55, 85, 18], [20, 5, 43])
            if (newConditionChecker110_1 & ConditionChecker210) {
                if (ConditionChecker17 & newConditionChecker27_1) {
                    if (ConditionChecker15 & ConditionChecker25) {
                        if (i >= 3) {
                            return;
                        }
                        for (int j = 0; j < 4; j++) {
                            for (int k = j + 1; k < 4; k++) {
                                if (nums[j] != -1 && nums[k] != -1) {
                                    int news_1 = nums[j];
                                    nums[j] = -1;
                                    int t = nums[k];
                                    if (operations[i].equals("+")) {
                                        nums[k] = news_1 + t;
                                    } else if (operations[i].equals("*")) {
                                        nums[k] = news_1 * t;
                                    }
                                    if (i == 2 && nums[k] < newans_1[0]) {
                                        newans_1[0] = nums[k];
                                    }
                                    Func_rememberTheNumber_0(nums, i + 1, operations, newans_1);
                                    nums[j] = news_1;
                                    nums[k] = t;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            // Handle exceptions
        }
    }
}