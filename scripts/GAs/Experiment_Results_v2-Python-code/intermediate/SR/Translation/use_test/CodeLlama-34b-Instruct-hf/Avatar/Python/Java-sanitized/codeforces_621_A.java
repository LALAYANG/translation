import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_621_A {
    private static final int THRESHOLD_A = 14;
    private static final int THRESHOLD_B = 850;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.parseInt(args[i + 1]);
        }
        Arrays.sort(lst);
        Arrays.reverse(lst);

        AtomicInteger od = new AtomicInteger(0);
        AtomicInteger sum = new AtomicInteger(0);
        AtomicInteger ok = new AtomicInteger(0);

        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum.addAndGet(lst[i]);
            } else if (ok.get() == 0 || od.get() > 1) {
                sum.addAndGet(lst[i]);
                od.addAndGet(-1);
                ok.set(1);
            }
        }

        System.out.println(sum.get());
    }
}