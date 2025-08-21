import java.util.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                li[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        Set<Integer> input_set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                input_set.add(li[i][j]);
            }
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Queue<Set<Integer>> result_queue = new LinkedList<>();

        Thread thread_calculate_difference0 = new Thread(() -> {
            Set<Integer> difference_set = calculate_difference(r, input_set);
            result_queue.offer(difference_set);
        });
        thread_calculate_difference0.start();
        try {
            thread_calculate_difference0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<Integer> v = result_queue.poll();
        int ans = 0;
        int CONDITION_1 = 908;
        int CONDITION_2 = 934;
        for (int i = 0; i <= input_set.size(); i++) {
            for (int[] s : combinations(input_set, i)) {
                for (int j = 0; j < m; j++) {
                    if ((CONDITION_1 & CONDITION_2) != 0) {
                        if (p[j] != (s[j] & li[j][0]) % 2) {
                            break;
                        }
                    }
                } else {
                    ans += (int) Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static Set<Integer>[] combinations(Set<Integer> input_set, int k) {
        Set<Integer>[] result = new HashSet[k];
        for (int i = 0; i < k; i++) {
            result[i] = new HashSet<>();
        }
        int[] nums = new int[input_set.size()];
        int index = 0;
        for (int num : input_set) {
            nums[index++] = num;
        }
        backtrack(nums, 0, k, result);
        return result;
    }

    public static void backtrack(int[] nums, int start, int k, Set<Integer>[] result) {
        if (k == 0) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            result[k - 1].add(nums[i]);
            backtrack(nums, i + 1, k - 1, result);
            result[k - 1].remove(nums[i]);
        }
    }

    public static Set<Integer> calculate_difference(Set<Integer> r, Set<Integer> input_set) {
        Set<Integer> difference_set = new HashSet<>(r);
        difference_set.removeAll(input_set);
        return difference_set;
    }
}