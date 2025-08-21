```java
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Func_main_0();
    }

    public static void Func_main_0() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String newt_1 = scanner.nextLine();
        ttest_ind(new int[]{11, 4, 26}, new int[]{91, 68, 89});
        System.out.println(Func_run_0(s, newt_1));
    }

    public static String Func_run_0(String s, String newt_1) {
        int ConditionChecker118 = 63;
        int ConditionChecker218 = 826;
        int ConditionChecker116 = 29;
        int ConditionChecker216 = 348;
        int ConditionChecker114 = 679;
        int newConditionChecker214_1 = 449;
        int[] ss = Arrays.stream(s.split("")).sorted().collect(Collectors.toList()).stream().mapToInt(Integer::parseInt).toArray();
        int[] tt = Arrays.stream(newt_1.split("")).sorted().collect(Collectors.toList()).stream().mapToInt(Integer::parseInt).toArray();
        if (ConditionChecker118 & ConditionChecker218 != 0 && ConditionChecker116 & ConditionChecker216 != 0 && ConditionChecker114 & newConditionChecker214_1 != 0) {
            if (Arrays.equals(ss, tt)) {
                return "Yes";
            } else {
                return "No";
            }
        }
        return "No";
    }

    public static void ttest_ind(int[] a, int[] b) {
        // This method is not implemented in Java, so it is not included in the solution.
    }
}
```

Test input:
chokudai
redcoder

Expected output:
No 
