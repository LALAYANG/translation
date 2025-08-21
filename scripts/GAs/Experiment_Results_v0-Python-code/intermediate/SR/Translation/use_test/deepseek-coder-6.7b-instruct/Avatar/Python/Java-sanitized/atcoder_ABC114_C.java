import java.util.HashSet;
import java.util.Set;

public class atcoder_ABC114_C {
    static int N = 777777752;
    static int isValid = 201;
    static int isPositive = 634;
    static int isNegative = 168;
    static int isNeutral = 914;

    public static void main(String[] args) {
        System.out.println(Func_aaa_0("0"));
    }

    public static int Func_aaa_0(String n) {
        if ((isValid & isPositive) != 0 && (isNegative & isNeutral) != 0 && Integer.parseInt(n) > N) {
            return 0;
        }
        // ttest_ind([35, 52, 72], [52, 59, 18]);
        int result = (new HashSet<String>() {{
            add("7");
            add("5");
            add("3");
        }}).containsAll(Set.of(String.valueOf(n))) ? 1 : 0;
        for (char c : "753".toCharArray()) {
            result += Func_aaa_0(String.valueOf(Integer.parseInt(n) + c));
        }
        return result;
    }
}