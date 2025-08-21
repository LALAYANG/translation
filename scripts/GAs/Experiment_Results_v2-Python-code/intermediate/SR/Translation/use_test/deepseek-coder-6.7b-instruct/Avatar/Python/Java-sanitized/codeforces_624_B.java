import java.util.*;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] a = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        int OuterLoopCounter = 342;
        int InnerLoopCounter = 341;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            ans = recursive_function(a, arraySize, ans, pre, 0, arraySize, 1);
        }
        System.out.println(ans);
    }

    public static int recursive_function(int[] a, int arraySize, int ans, int pre, int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return ans;
        }
        int temp = Math.max(0, Math.min(pre - 1, a[j]));
        ans += temp;
        pre = temp;
        return recursive_function(a, arraySize, ans, pre, j + step, stop, step);
    }
}