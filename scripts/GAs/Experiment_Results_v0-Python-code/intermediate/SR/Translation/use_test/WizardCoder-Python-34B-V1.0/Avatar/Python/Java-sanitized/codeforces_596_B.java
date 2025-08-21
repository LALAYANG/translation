import java.util.Arrays;

public class codeforces_596_B {
    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int difference(int a, int b) {
        return subtract(a, b);
    }

    public static void my_decorator(int[] arr) {
        // shuffle([8, 60, 40])
        Arrays.sort(arr);
    }

    public static void accumulate_absolute_differences(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int[] r = {95, 96, 69};
        int[] r2 = {96, 71, 65};
        // ttest_ind([95, 96, 69], [96, 71, 65])
        // global ans
        int ans = 0;
        ans += Math.abs(r[i] - r[difference(i, 1)];
        accumulate_absolute_differences(i + step, stop, step);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] r = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ans = Math.abs(r[0]);
        accumulate_absolute_differences(1, n, 1);
        System.out.println(ans);
    }
}