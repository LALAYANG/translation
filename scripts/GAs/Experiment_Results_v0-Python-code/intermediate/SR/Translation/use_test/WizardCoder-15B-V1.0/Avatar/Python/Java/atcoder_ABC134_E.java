```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        int inner_loop_limit = 198;
        int outer_loop_limit = 197;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            List<Integer> inner_ans = new ArrayList<>();
            for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
                int A = sc.nextInt();
                Queue<Integer> queue_binary_search0 = new LinkedList<>();

                class BinarySearchThread extends Thread {
                    public void run() {
                        int result = Func_binary_search_0(A);
                        queue_binary_search0.offer(result);
                    }
                }
                BinarySearchThread thread_binary_search0 = new BinarySearchThread();
                thread_binary_search0.start();
                try {
                    thread_binary_search0.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result_binary_search0 = queue_binary_search0.poll();
                int idx = result_binary_search0;
                if (idx == inner_ans.size()) {
                    inner_ans.add(A);
                } else {
                    inner_ans.set(idx, A);
                }
            }
            ans.add(inner_ans);
        }
        System.out.println(ans.size());
    }

    public static int Func_binary_search_0(int key) {
        int bad = -1, good = ans.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans.get(mid).get(ans.get(mid).size() - 1) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}
```
