import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int firstCondition = 343;
        int secondCondition = 393;
        int outerLoopBound = 774;
        int innerLoopBound = 773;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int innerLoopIndex = 0; innerLoopIndex < innerLoopBound; innerLoopIndex++) {
                String x = scanner.next();
                int a = scanner.nextInt();
                int b = scanner.nextInt() + 1;
                if (firstCondition & secondCondition) {
                    if (x.equals("M")) {
                        m[a] += 2;
                        m[b] -= 2;
                    } else {
                        f[a] += 2;
                        f[b] -= 2;
                    }
                }
            }
        }
        for (int innerLoopIndex = 0; innerLoopIndex < N; innerLoopIndex++) {
            a += m[innerLoopIndex];
            b += f[innerLoopIndex];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}