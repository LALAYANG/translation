import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC165_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int Q = Integer.parseInt(input[2]);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            input = br.readLine().split(" ");
            a.add(Integer.parseInt(input[0]));
            b.add(Integer.parseInt(input[1]));
            c.add(Integer.parseInt(input[2]));
            d.add(Integer.parseInt(input[3]));
        }
        solve(N, M, Q, a, b, c, d);
    }

    public static void solve(int N, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        int res = 0;

        void rec(List<Integer> A) {
            if (A.size() == N) {
                int ans = 0;

                void func_loop_queries(int i, int stop, int step) {
                    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                        return;
                    }
                    if (A.get(b.get(i) - 1) - A.get(a.get(i) - 1) == c.get(i)) {
                        ans += d.get(i);
                    }
                    func_loop_queries(i + step, stop, step);
                }
                func_loop_queries(0, Q, 1);
                res = Math.max(res, ans);
                return;
            }
            int last_max = 1;
            if (A.size() > 0) {
                last_max = A.get(A.size() - 1);
            }

            void func_loop_recursive(int i, int stop, int step) {
                if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                    return;
                }
                rec(new ArrayList<>(A) {{
                    add(i);
                }});
                func_loop_recursive(i + step, stop, step);
            }
            func_loop_recursive(last_max, M + 1, 1);
        }
        rec(new ArrayList<>());
        System.out.println(res);
    }
}