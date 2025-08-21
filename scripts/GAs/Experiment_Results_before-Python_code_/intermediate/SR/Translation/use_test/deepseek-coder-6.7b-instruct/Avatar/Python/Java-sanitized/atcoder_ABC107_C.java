import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lst.add(scanner.nextInt());
        }
        List<Integer> lstP = new ArrayList<>();
        List<Integer> lstM = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (lst.get(i) > 0) {
                lstP.add(lst.get(i));
            } else if (lst.get(i) < 0) {
                lstM.add(lst.get(i));
            }
        }
        int ans = check(K, lstP, lstM);
        System.out.println(ans);
    }

    private static int check(int K, List<Integer> lstP, List<Integer> lstM) {
        int ans = (int)1e9;
        int lastX = lstP.size();
        int lastY = lstM.size();
        for (int k = 0; k <= K; k++) {
            if (k > lastX || K - k > lastY) {
                continue;
            }
            int p = (k == 0) ? 0 : lstP.get(k - 1);
            int m = (k - lastX == 0) ? 0 : lstM.get(lastY - (K - k));
            ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
        }
        return ans;
    }
}