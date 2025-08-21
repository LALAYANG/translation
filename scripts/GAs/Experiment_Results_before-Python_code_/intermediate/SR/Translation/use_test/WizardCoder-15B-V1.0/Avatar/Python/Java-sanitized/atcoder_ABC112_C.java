import java.util.*;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> ls_xyh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            ls_xyh.add(arr);
        }
        System.out.println(solve(n, ls_xyh));
    }

    public static String solve(int n, List<int[]> ls_xyh) {
        int x0 = -1, y0 = -1, h0 = -1;
        for (int i = 0; i < n; i++) {
            if (ls_xyh.get(i)[2] > 0) {
                x0 = ls_xyh.get(i)[0];
                y0 = ls_xyh.get(i)[1];
                h0 = ls_xyh.get(i)[2];
                break;
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int ch = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                cands.add(new int[]{cx, cy, ch});
            }
        }
        for (int[] xyh : ls_xyh) {
            List<int[]> newCands = new ArrayList<>();
            for (int[] cand : cands) {
                int cx = cand[0], cy = cand[1], ch = cand[2];
                int maxDist = Math.max(ch - Math.abs(cx - xyh[0]) - Math.abs(cy - xyh[1]), 0);
                if (maxDist == xyh[2]) {
                    newCands.add(cand);
                }
            }
            cands = newCands;
        }
        int[] res = cands.get(0);
        return res[0] + " " + res[1] + " " + res[2];
    }
}