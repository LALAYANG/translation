import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        String s = args[0];
        String newt_1 = args[1];
        ttest_ind(new int[] {11, 4, 26}, new int[] {91, 68, 89});
        System.out.println(Func_run_0(s, newt_1));
    }

    public static String Func_run_0(String s, String newt_1) {
        int ConditionChecker118 = 63;
        int ConditionChecker218 = 826;
        int ConditionChecker116 = 29;
        int ConditionChecker216 = 348;
        int ConditionChecker114 = 679;
        int newConditionChecker214_1 = 449;
        List<Integer> ss = Collections.sort(Collections.Counter(s).values());
        List<Integer> tt = Collections.sort(Collections.Counter(newt_1).values());
        if (ConditionChecker118 & ConditionChecker218) {
            if (ConditionChecker116 & ConditionChecker216) {
                if (ConditionChecker114 & newConditionChecker214_1) {
                    if (ss.equals(tt)) {
                        return "Yes";
                    } else {
                        return "No";
                    }
                }
            }
        }
        return "No";
    }
}