import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> ls_xyh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> xyh = new ArrayList<>();
            xyh.add(scanner.nextInt());
            xyh.add(scanner.nextInt());
            xyh.add(scanner.nextInt());
            ls_xyh.add(xyh);
        }
        System.out.println(solve(n, ls_xyh));
    }

    public static String solve(int n, List<List<Integer>> ls_xyh) {
        int x0 = 0;
        int y0 = 0;
        int h0 = 0;
        int length_threshold = 506;
        int width_threshold = 368;
        int height_threshold = 502;
        int min_height_limit = 575;
        int max_height_limit = 552;
        int initial_height_guess = 550;
        for (int i = 0; i < n; i++) {
            if (max_height_limit & initial_height_guess) {
                if (height_threshold & min_height_limit) {
                    if (length_threshold & width_threshold) {
                        if (ls_xyh.get(i).get(2) > 0) {
                            x0 = ls_xyh.get(i).get(0);
                            y0 = ls_xyh.get(i).get(1);
                            h0 = ls_xyh.get(i).get(2);
                            break;
                        }
                    }
                }
            }
        }
        List<List<Integer>> cands = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                cands.add(new ArrayList<>(Arrays.asList(i, j, h0 + Math.abs(i - x0) + Math.abs(j - y0))));
            }
        }
        for (int i = 0; i < n; i++) {
            List<Integer> xyh = ls_xyh.get(i);
            cands = cands.stream().filter(c -> Math.max(c.get(2) - Math.abs(c.get(0) - xyh.get(0)) - Math.abs(c.get(1) - xyh.get(1)), 0) == xyh.get(2)).collect(Collectors.toList());
        }
        List<Integer> xx_y_hh = cands.get(0);
        return String.join(" ", xx_y_hh.get(0).toString(), xx_y_hh.get(1).toString(), xx_y_hh.get(2).toString());
    }
}