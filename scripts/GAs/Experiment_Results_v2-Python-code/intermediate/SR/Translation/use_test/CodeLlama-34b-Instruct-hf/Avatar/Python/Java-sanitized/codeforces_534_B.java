import java.util.Scanner;

public class codeforces_534_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 989;
        int SecondCondition = 711;
        int OuterLoopLimit = 748;
        int OuterLoopStep = 747;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit; LoopIndexOut += OuterLoopStep) {
            recursiveVelocityCalculator(0, t, 1);
        }

        System.out.println(distance);
    }

    public static void recursiveVelocityCalculator(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        if (FirstCondition & SecondCondition) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
        }

        distance += v;
        v += a * d;
        recursiveVelocityCalculator(i + step, stop, step);
    }
}