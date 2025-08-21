import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> ls_xyh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> input = new ArrayList<>();
            input.add(scanner.nextInt());
            input.add(scanner.nextInt());
            input.add(scanner.nextInt());
            ls_xyh.add(input);
        }
        String[] result = solve(n, ls_xyh);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }

    public static String[] solve(int n, List<List<Integer>> ls_xyh) {
        int x0 = 0, y0 = 0, h0 = 0;
        for (int i = 0; i < n; i++) {
            if (ls_xyh.get(i).get(2) > 0) {
                x0 = ls_xyh.get(i).get(0);
                y0 = ls_xyh.get(i).get(1);
                h0 = ls_xyh.get(i).get(2);
                break;
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
        return new String[]{Integer.toString(result.get(0)), Integer.toString(result.get(1)), Integer.toString(result.get(2))};
    }
}