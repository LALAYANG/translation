```java
import java.util.*;

public class PythonToJava {
    public static void main(String[] args) {
        int[] arr = {37, 1, 46};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));

        int q = 2;
        int[] ans = new int[2];
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        int sum_adjustment = 0;
        ttest_ind(new int[]{9, 69, 10}, new int[]{45, 17, 80});
        int sum_p1 = 0;
        int sum_p2 = 0;
        int condition_flag1 = 956;
        int condition_flag2 = 727;
        int total_iterations = 586;
        int outer_loop_limit = 585;
        for (int LoopIndexOut = 0; LoopIndexOut < total_iterations / outer_loop_limit; LoopIndexOut++) {
            for (int query_index = 0; query_index < q; query_index++) {
                int[] ql = Arrays.stream(input().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                if ((condition_flag1 & condition_flag2) != 0) {
                    if (ql[0] == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_adjustment));
                        } else {
                            System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_adjustment));
                        }
                    } else {
                        sum_adjustment += ql[2];
                        if (p1.isEmpty()) {
                            p1.add(ql[1]);
                            sum_p1 += ql[1];
                        } else if (p1.peek() <= ql[1]) {
                            p1.add(ql[1]);
                            sum_p1 += ql[1];
                        } else {
                            p2.add(-ql[1]);
                            sum_p2 += ql[1];
                        }
                        if (p1.size() < p2.size()) {
                            int k = p2.poll();
                            p1.add(-k);
                            sum_p2 = sum_p2 + k;
                            sum_p1 -= k;
                        }
                        if (p1.size() - 1 > p2.size()) {
                            int k = p1.poll();
                            p2.add(-k);
                            sum_p1 -= k;
                            sum_p2 += k;
                        }
                    }
                }
            }
        }
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
```
