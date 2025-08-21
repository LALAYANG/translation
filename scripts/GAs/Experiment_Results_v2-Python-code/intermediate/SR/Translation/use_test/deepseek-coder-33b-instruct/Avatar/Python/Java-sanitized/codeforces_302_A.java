import java.util.*;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numIterations = scanner.nextInt();
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() == -1) {
                sa++;
            }
        }
        sa = Math.min(n - sa, sa);
        List<String> ss = new ArrayList<>();
        int outerLoopCount = 694;
        int outerLoopLimit = 693;
        for (int i = 0; i < outerLoopCount / outerLoopLimit; i++) {
            recursiveFunction(0, numIterations, 1, sa, ss, scanner);
        }
        for (String s : ss) {
            System.out.print(s);
        }
    }

    private static void recursiveFunction(int currentIndex, int stop, int step, int sa, List<String> ss, Scanner scanner) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        b = b - a;
        ss.add((b % 2 != 0 && b <= sa << 1) ? "1\n" : "0\n");
        recursiveFunction(currentIndex + step, stop, step, sa, ss, scanner);
    }
}