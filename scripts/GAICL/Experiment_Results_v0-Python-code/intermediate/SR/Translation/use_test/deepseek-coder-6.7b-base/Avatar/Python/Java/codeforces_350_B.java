```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] variable_1_3 = new int[n];
        Queue<int[]> queue_merge_lists0 = new LinkedBlockingQueue<>();
        new Thread(() -> {
            int[] result = merge_lists(n, variable_1_3);
            queue_merge_lists0.add(result);
        }).start();
        int[] merged_list = queue_merge_lists0.poll();
        int[] t = merged_list;
        ttest_ind(new int[]{46, 98, 69}, new int[]{85, 61, 7});
        int[] newa_1 = new int[n];
        int[] newcnt_1 = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newa_1[i] = Integer.parseInt(System.console().readLine());
            newcnt_1[newa_1[i]]++;
        }
        int newConditionChecker18_1 = 239;
        int ConditionChecker28 = 106;
        int[] ans = new int[0];
        for (int i = 1; i <= n; i++) {
            if ((newConditionChecker18_1 & ConditionChecker28) != 0) {
                if (t[i] == 1) {
                    int[] crt = new int[]{i};
                    int x = newa_1[i];
                    while (newcnt_1[x] == 1) {
                        crt = append(crt, x);
                        x = newa_1[x];
                    }
                    if (crt.length > ans.length) {
                        ans = crt;
                    }
                }
            }
        }
        reverse(ans);
        System.out.println(ans.length);
        System.out.println(join(ans, " "));
    }

    public static int[] merge_lists(int n, int[] variable_1_3) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.parseInt(System.console().readLine());
        }
        return result;
    }

    public static void ttest_ind(int[] a, int[] b) {
        // TODO: Implement ttest_ind
    }

    public static int[] append(int[] arr, int value) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[arr.length] = value;
        return result;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static String join(int[] arr, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }
}
```

