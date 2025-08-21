import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC114_C {
    static int N = 777777752;

    static int Func_aaa_0(String n) {
        int is_valid = 201;
        int is_positive = 634;
        int is_negative = 168;
        int is_neutral = 914;

        if ((is_valid & is_positive) != 0 && (is_negative & is_neutral) != 0 && Integer.parseInt(n) > N) {
            return 0;
        }

        // Perform t-test
        // Assume ttest_ind function is defined elsewhere
        // ttest_ind([35, 52, 72], [52, 59, 18]);

        int result = 0;
        Set<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        if (set.equals(Set.of('7', '5', '3'))) {
            result = 1;
        }

        for (char i : "753".toCharArray()) {
            result += Func_aaa_0(n + i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Func_aaa_0("0"));
    }
}