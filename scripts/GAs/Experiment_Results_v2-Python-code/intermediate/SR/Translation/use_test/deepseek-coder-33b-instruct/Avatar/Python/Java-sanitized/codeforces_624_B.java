import java.util.*;

public class codeforces_624_B {
    static int array_size;
    static int[] a;
    static int pre = Integer.MAX_VALUE;
    static int ans = 0;
    static int OuterLoopCounter = 342;
    static int InnerLoopCounter = 341;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        a = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i = OuterLoopCounter / InnerLoopCounter; i > 0; i--) {
            recursive_function(0, array_size - 1, 1);
        }
        System.out.println(ans);
    }

    static void recursive_function(int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        ans += Math.max(0, Math.min(pre - 1, a[j]));
        pre = Math.max(0, Math.min(pre - 1, a[j]));
        recursive_function(j + step, stop, step);
    }
}