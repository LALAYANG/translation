import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] inputArray = new int[N];
        int[] m = new int[N];
        int[] f = new int[N];
        int firstCondition = 343;
        int secondCondition = 393;
        int outerLoopBound = 774;
        int innerLoopBound = 773;
        int a, b, c;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int innerLoopIndex = 0; innerLoopIndex < scanner.nextInt(); innerLoopIndex++) {
                String[] input = scanner.nextLine().split(" ");
                char x = input[0].charAt(0);
                int a = Integer.parseInt(input[1]);
                int b = Integer.parseInt(input[2]) + 1;
                if ((firstCondition & secondCondition) != 0) {
                    if (x == 'M') {
                        m[a] += 2;
                        m[b] -= 2;
                    } else {
                        f[a] += 2;
                        f[b] -= 2;
                    }
                }
            }
        }

        a = 0;
        b = 0;
        c = 0;
        for (int innerLoopIndex = 0; innerLoopIndex < N; innerLoopIndex++) {
            a += m[innerLoopIndex];
            b += f[innerLoopIndex];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }

    public static int calculateValue(int[] inputArray, int N) {
        return inputArray * N;
    }
}