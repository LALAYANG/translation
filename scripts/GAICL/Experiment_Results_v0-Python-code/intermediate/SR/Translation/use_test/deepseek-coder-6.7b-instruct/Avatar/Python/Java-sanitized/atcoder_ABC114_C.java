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

    static int Func_aaa_0(String n) {
        if ((isValid & isPositive) != 0 && (isNegative & isNeutral) != 0 && Integer.parseInt(n) <= N) {
            Set<Character> set = new HashSet<>();
            for (char c : n.toCharArray()) {
                set.add(c);
            }
            if (set.size() == 3 && set.contains('7') && set.contains('5') && set.contains('3')) {
                return 1;
            }
            for (char c : "753".toCharArray()) {
                n += c;
                Func_aaa_0(n);
            }
        }
        return 0;
    }
}