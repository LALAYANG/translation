import java.util.*;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numIterations = scanner.nextInt();
        int sa = scanner.nextInt();
        int count = sa;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == -1) {
                count--;
            }
        }
        sa = Math.min(sa, count);
        List<String> ss = new ArrayList<>();
        for (int outerLoopIndex = 0; outerLoopIndex < numIterations; outerLoopIndex++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b = b - a;
            if ((b % 2 == 1) && (b <= sa * 2)) {
                ss.add("1\n");
            } else {
                ss.add("0\n");
            }
        }
        for (String s : ss) {
            System.out.print(s);
        }
    }
}