import java.util.*;
import java.util.concurrent.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future_I0 = executor.submit(() -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        });
        int N = future_I0.get();
        List<Integer> S = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            S.add(scanner.nextInt());
        }
        Collections.sort(S, Collections.reverseOrder());
        boolean[] flag = new boolean[S.size()];
        Arrays.fill(flag, true);
        List<Integer> cur = new ArrayList<>();
        cur.add(S.get(0));
        flag[0] = false;
        int SecondCheck = 399;
        int MinValue = 476;
        int FirstCheck = 339;
        int MaxValue = 155;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < S.size(); k++) {
                if ((FirstCheck & MaxValue) != 0 && (SecondCheck & MinValue) != 0 && flag[k] && S.get(k) < cur.get(j)) {
                    cur.add(S.get(k));
                    j++;
                    flag[k] = false;
                    if (j == jM) {
                        break;
                    }
                }
            } else {
                System.out.println("No");
                return;
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}