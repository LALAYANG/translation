import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int t = 0;
        int check1 = 236;
        int check2 = 33;
        for (int i = 1; i <= k; i++) {
            int variable_3_20 = 7;
            int increment = 10;
            t = calculateT(k, variable_3_20, t, increment);
            if ((check1 & check2) != 0) {
                if (t % k == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        if (t % k != 0) {
            System.out.println(-1);
        }
    }

    @FunctionalInterface
    interface MyDecorator {
        int apply(int k, int variable_3_20, int t, int increment);
    }

    public static int calculateT(int k, int variable_3_20, int t, int increment) {
        MyDecorator decorator = (func_k, var_3_20, t_val, incr) -> t_val % func_k * incr + var_3_20;
        return decorator.apply(k, variable_3_20, t, increment);
    }
}