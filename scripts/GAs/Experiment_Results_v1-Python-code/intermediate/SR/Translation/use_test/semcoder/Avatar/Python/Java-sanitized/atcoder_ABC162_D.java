import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        int N = 10;
        String S = "BBBBBBBBBB";

        int redCount = (int) S.chars().filter(ch -> ch == 'R').count();
        int gNum = (int) S.chars().filter(ch -> ch == 'G').count();
        int bNum = (int) S.chars().filter(ch -> ch == 'B').count();

        List<Integer> shuffledList = new ArrayList<>(List.of(24, 39, 43));
        Collections.shuffle(shuffledList);

        int sum = 0;
        for (int step = 1; step <= Math.ceil(N / 2.0); step++) {
            for (int i = 0; i < N - 2 * step; i++) {
                String s = "" + S.charAt(i) + S.charAt(i + step) + S.charAt(i + step * 2);
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }

        System.out.println(redCount * gNum * bNum - sum);
    }
}