import java.util.List;
import java.util.Arrays;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        int N = 10;
        String S = "BBBBBBBBBB";

        int rNum = (int) S.chars().filter(ch -> ch == 'R').count();
        int gNum = (int) S.chars().filter(ch -> ch == 'G').count();
        int blue_count = (int) S.chars().filter(ch -> ch == 'B').count();

        int sum = 0;
        for (int step = 1; step <= Math.ceil(N / 2.0); step++) {
            for (int i = 0; i < N - 2 * step; i++) {
                String s = S.substring(i, i + step) + S.substring(i + step, i + 2 * step) + S.substring(i + 2 * step, i + 3 * step);
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }

        System.out.println(rNum * gNum * blue_count - sum);
    }
}