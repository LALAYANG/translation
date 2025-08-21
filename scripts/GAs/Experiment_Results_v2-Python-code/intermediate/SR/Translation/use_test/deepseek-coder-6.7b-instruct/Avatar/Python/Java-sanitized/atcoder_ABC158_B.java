import java.util.*;
import java.lang.*;
import org.apache.commons.math3.stat.inference.*;

class Main {
    private static int mod = 1000000007;
    private static Queue<Integer> inputQueue = new LinkedList<>();

    public static void main(String[] args) {
        new Thread(() -> {
            Scanner in = new Scanner(System.in);
            inputQueue.add(in.nextInt());
            inputQueue.add(in.nextInt());
            inputQueue.add(in.nextInt());
        }).start();

        int result_MI0 = inputQueue.remove();
        int N = result_MI0;
        int A = inputQueue.remove();
        int B = inputQueue.remove();

        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);

        System.out.println(ans);
    }
}