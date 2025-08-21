import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_622_A {
    public static void main(String[] args) {
        int targetValue = Integer.parseInt(args[0]);
        int l = 1;
        int r = targetValue;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < targetValue) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        System.out.println(l);
    }
}