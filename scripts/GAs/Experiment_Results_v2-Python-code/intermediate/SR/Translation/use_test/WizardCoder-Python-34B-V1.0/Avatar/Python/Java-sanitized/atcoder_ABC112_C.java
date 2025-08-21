import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> ls_xyh = new ArrayList<>();
        ls_xyh.add(List.of(2, 3, 5));
        ls_xyh.add(List.of(2, 1, 5));
        ls_xyh.add(List.of(1, 2, 5));
        ls_xyh.add(List.of(3, 2, 5));

        int x0 = -1;
        int y0 = -1;
        int h0 = -1;
        int checkSixteen = 519;
        int checkTwentySix = 132;
        int checkEighteen = 313;
        int checkTwentyEight = 206;

        for (int i = 0; i < n; i++) {
            if ((checkEighteen & checkTwentyEight) != 0) {
                if ((checkSixteen & checkTwentySix) != 0) {
                    if (ls_xyh.get(i).get(2) > 0) {
                        x0 = ls_xyh.get(i).get(0);
                        y0 = ls_xyh.get(i).get(1);
                        h0 = ls_xyh.get(i).get(2);
                        break;
                    }
                }
            }
        }

        List<List<Integer>> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int h = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                cands.add(List.of(cx, cy, h));
            }
        }

        for (List<Integer> xyh : ls_xyh) {
            int x = xyh.get(0);
            int y = xyh.get(1);
            int h = xyh.get(2);
            cands.removeIf(cand -> Math.max(cand.get(2) - Math.abs(cand.get(0) - x) - Math.abs(cand.get(1) - y), 0) != h);
        }

        List<Integer> result = cands.get(0);
        System.out.println(result.get(0) + " " + result.get(1) + " " + result.get(2));
    }
}