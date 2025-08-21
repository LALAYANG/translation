import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class codeforces_55_B {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1000, 1000, 999, 1000);
        List<String> operations = Arrays.asList("*", "*", "*");
        List<Integer> minimumResults = new ArrayList<>();
        minimumResults.add(10000000000000000000000000);

        Func_rememberTheNumber_0(nums, 0, operations, minimumResults);

        System.out.println(minimumResults.get(0));
    }

    public static void Func_rememberTheNumber_0(List<Integer> nums, int i, List<String> operations, List<Integer> minimumResults) {
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

            for (int j = 0; j < nums.size(); j++) {
                for (int k = j + 1; k < nums.size(); k++) {
                    if (nums.get(j) != -1 && nums.get(k) != -1) {
                        int news_1 = nums.get(j);
                        nums.set(j, -1);
                        int t = nums.get(k);
                        if (operations.get(i).equals("+")) {
                            nums.set(k, news_1 + t);
                        } else if (operations.get(i).equals("*")) {
                            nums.set(k, news_1 * t);
                        }
                        if (i == 2 && nums.get(k) < minimumResults.get(0)) {
                            minimumResults.set(0, nums.get(k));
                        }
                        Func_rememberTheNumber_0(nums, i + 1, operations, minimumResults);
                        nums.set(j, news_1);
                        nums.set(k, t);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}