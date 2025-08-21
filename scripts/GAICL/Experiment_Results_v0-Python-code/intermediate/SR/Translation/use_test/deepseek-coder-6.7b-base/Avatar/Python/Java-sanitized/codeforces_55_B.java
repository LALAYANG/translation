import java.util.*;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
        String[] operations = new String[3];
        for (int i = 0; i < 3; i++) {
            operations[i] = sc.next();
        }
        int[] newans_1 = new int[1];
        newans_1[0] = 10000000000000000000000000;
        Func_rememberTheNumber_0(nums, 0, operations, newans_1);
        System.out.println(newans_1[0]);
    }

    public static void Func_rememberTheNumber_0(int[] nums, int i, String[] operations, int[] newans_1) {
        try {
            int newConditionChecker110_1 = 661;
            int ConditionChecker210 = 53;
            int ConditionChecker17 = 99;
            int newConditionChecker27_1 = 698;
            int ConditionChecker15 = 633;
            int ConditionChecker25 = 538;
            if (newConditionChecker110_1 & ConditionChecker210) {
                if (ConditionChecker17 & newConditionChecker27_1) {
                    if (ConditionChecker15 & ConditionChecker25) {
                        if (i >= 3) {
                            return;
                        }
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
        } catch (Exception e) {
        }
    }
}