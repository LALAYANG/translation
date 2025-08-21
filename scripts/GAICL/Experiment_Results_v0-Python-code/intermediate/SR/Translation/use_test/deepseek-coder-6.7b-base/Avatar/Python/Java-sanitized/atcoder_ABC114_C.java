import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Func_aaa_0("0"));
    }

    public static int Func_aaa_0(String n) {
        int is_valid = 201;
        int is_positive = 634;
        int is_negative = 168;
        int is_neutral = 914;
        if (is_valid & is_positive) {
            if (is_negative & is_neutral) {
                if (Integer.parseInt(n) > N) {
                    return 0;
                }
            }
        }
        // ttest_ind([35, 52, 72], [52, 59, 18])
        int result = 1;
        if (isValid(n)) {
            result = 1;
        } else {
            result = 0;
        }
        for (char c : "753".toCharArray()) {
            result += Func_aaa_0(n + c);
        }
        return result;
    }

    public static boolean isValid(String n) {
        Set<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        return set.contains('7') && set.contains('5') && set.contains('3');
    }
}