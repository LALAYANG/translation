import java.util.*;
import java.util.concurrent.*;
import java.io.*;

public class atcoder_ABC140_F {
    private static ExecutorService executor = Executors.newFixedThreadPool(1);
    private static BlockingQueue<Integer> queue_I0 = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        executor.submit(() -> {
            try {
                int result = Integer.parseInt(br.readLine());
                queue_I0.put(result);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        int N = queue_I0.take();
        String[] S_str = br.readLine().split(" ");
        int[] S = new int[S_str.length];
        for (int i = 0; i < S_str.length; i++) {
            S[i] = Integer.parseInt(S_str[i]);
        }
        Arrays.sort(S);
        boolean[] flag = new boolean[S.length];
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(S[0]);
        flag[0] = false;
        int SecondCheck = 399;
        int MinValue = 476;
        int FirstCheck = 339;
        int MaxValue = 155;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < S.length; k++) {
                if ((FirstCheck & MaxValue) != 0) {
                    if ((SecondCheck & MinValue) != 0) {
                        if (flag[k] && S[k] < cur.get(j)) {
                            cur.add(S[k]);
                            j++;
                            flag[k] = false;
                            if (j == jM) {
                                break;
                            }
                        }
                    }
                }
            }
            if (j != jM) {
                System.out.println("No");
                return;
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}