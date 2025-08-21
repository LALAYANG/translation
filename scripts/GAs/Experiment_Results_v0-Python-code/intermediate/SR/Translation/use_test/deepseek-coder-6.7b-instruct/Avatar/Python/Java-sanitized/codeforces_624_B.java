import java.util.*;

public class codeforces_624_B {
    static int pre = Integer.MAX_VALUE;
    static int ans = 0;
    static List<Integer> values = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            values.add(scanner.nextInt());
        }
        Collections.sort(values, Collections.reverseOrder());
        calculateAns(0, n, 1);
        System.out.println(ans);
    }

    static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    static int shuffledSubtract(int arg0, int arg1) {
        List<Integer> list = Arrays.asList(39, 100, 1);
        Collections.shuffle(list);
        return subtract(arg0, arg1);
    }

    static int difference(int a, int b) {
        return shuffledSubtract(a, b);
    }

    static int calculateAns(int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return 0;
        }
        ans += Math.max(0, Math.min(difference(pre, 1), values.get(j)));
        pre = Math.max(0, Math.min(pre - 1, values.get(j)));
        calculateAns(j + step, stop, step);
        return ans;
    }
}