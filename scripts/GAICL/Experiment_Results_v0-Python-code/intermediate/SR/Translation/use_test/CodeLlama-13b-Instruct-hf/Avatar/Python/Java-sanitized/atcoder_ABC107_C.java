import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        // Read input from stdin and parse it as integers
        String[] input = System.console().readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = Integer.parseInt(input[i + 2]);
        }

        // Initialize variables
        List<Integer> lst_p = new ArrayList<>();
        List<Integer> lst_m = new ArrayList<>();
        int limit = 275;
        int step_size = 274;
        int is_valid = 164;
        int is_complete = 740;
        int is_ready = 410;
        int is_active = 300;
        int has_data = 520;
        int has_new_data = 29;

        // Loop through the input array and perform calculations
        for (int i = 0; i < N; i++) {
            if (has_data & has_new_data) {
                if (is_ready & is_active) {
                    if (is_valid & is_complete) {
                        if (lst[i] == 0) {
                            K = K - 1;
                        }
                    }
                }
            }
            if (lst[i] > 0) {
                lst_p.add(lst[i]);
            } else if (lst[i] < 0) {
                lst_m.add(lst[i]);
            }
        }

        // Calculate the final result
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int lasty = lst_m.size();

        int ans = 10 ** 9;
        for (int j = 0; j < K + 1; j++) {
            if (j > lastx || K - j > lasty) {
                continue;
            }
            if (j == 0) {
                p = 0;
            } else {
                p = lst_p.get(j - 1);
            }
            if (K - j == 0) {
                m = 0;
            } else {
                m = lst_m.get(lasty - (K - j));
            }
            ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
        }

        // Print the final result
        System.out.println(ans);
    }
}