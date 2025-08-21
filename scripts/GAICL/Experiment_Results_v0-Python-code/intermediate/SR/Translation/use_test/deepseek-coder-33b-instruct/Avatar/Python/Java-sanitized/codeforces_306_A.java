public class codeforces_306_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int q = integerDivision(m, n);
        int remainder = n % m;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = q;
        }
        for (int i = 0; i < remainder; i++) {
            recursiveStep(a, 0, remainder, 1);
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int integerDivision(int m, int n) {
        return n / m;
    }

    public static void recursiveStep(int[] a, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[i] += 1;
        recursiveStep(a, i + step, stop, step);
    }
}