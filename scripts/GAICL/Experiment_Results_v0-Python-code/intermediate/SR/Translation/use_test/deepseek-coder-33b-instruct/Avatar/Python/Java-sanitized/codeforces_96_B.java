import java.util.*;

public class codeforces_96_B {
    static List<Long> l = new ArrayList<>();
    static long limit = 10000000000L;

    public static void Func_gen_0(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        Func_gen_0(number * 10 + 4, four + 1, seven);
        Func_gen_0(number * 10 + 7, four, seven + 1);
    }

    public static void Func_main_0() {
        Func_gen_0(0, 0, 0);
        Collections.sort(l);
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = 0;
        int outer_loop_limit = 488;
        int inner_loop_limit = 487;

        for (int LoopIndexOut = 0; LoopIndexOut <= outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (long val : l) {
                if (val >= n) {
                    ans = val;
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Func_main_0();
    }
}