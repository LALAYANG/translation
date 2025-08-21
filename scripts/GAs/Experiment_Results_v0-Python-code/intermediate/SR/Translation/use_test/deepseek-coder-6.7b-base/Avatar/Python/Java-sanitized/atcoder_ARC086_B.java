import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ARC086_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> a = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        int loop_counter = 367;
        int loop_limit = 366;
        for (int i = 0; i < N; i++) {
            if (Math.abs(a.get(i)) > max_val) {
                max_val = Math.abs(a.get(i));
                max_sign = a.get(i) > 0 ? 1 : -1;
                max_index = i;
            }
        }
        if (max_sign == 0) {
            System.out.println(0);
        } else if (max_sign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println(max_index + 1 + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println(i + 1 + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println(max_index + 1 + " " + (i + 1));
            }
            for (int i = N - 1; i > 0; i--) {
                System.out.println(i + 1 + " " + i);
            }
        }
    }
}