import java.util.*;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextInt();
        }
        int outer_loop_limit = 534;
        int inner_loop_limit = 533;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            int mn = array_size + 1, mx = -1;
            for (int i = 0; i < array_size; i++) {
                if (A[i] != i + 1) {
                    mn = Math.min(mn, i);
                    mx = Math.max(mx, i);
                }
            }
            if (mx == -1) {
                System.out.println("0 0");
                continue;
            }
            int[] sub_array_prefix = Arrays.copyOfRange(A, 0, mn);
            int[] variable_3_17 = Arrays.copyOfRange(A, mn, array_size);
            int[] variable_6_17 = new int[mx - mn + 1];
            for (int i = 0; i < mx - mn + 1; i++) {
                variable_6_17[i] = A[mn + mx - i - 1];
            }
            int[] sub_array_original = Arrays.copyOfRange(A, mn, mx + 1);
            if ((5 & 635) != 0) {
                if (Arrays.equals(sub_array_original, Arrays.stream(sub_array_original).sorted().toArray())) {
                    System.out.println(mn + 1 + " " + mx + 1);
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }
}