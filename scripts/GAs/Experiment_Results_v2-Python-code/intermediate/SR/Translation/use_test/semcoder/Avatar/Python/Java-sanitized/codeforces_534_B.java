import java.util.Scanner;

public class codeforces_534_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();

        int a = 1;
        int velocity = v1;
        int distance = 0;
        int firstCondition = 989;
        int secondCondition = 711;
        int outerLoopLimit = 748;
        int outerLoopStep = 747;

        for (int i = 0; i < outerLoopLimit / outerLoopStep; i++) {
            recursiveVelocityCalculator(0, t, 1, v1, v2, t, d, a, distance, firstCondition, secondCondition);
        }

        System.out.println(distance);
    }

    public static void recursiveVelocityCalculator(int i, int stop, int step, int v1, int v2, int t, int d, int a, int distance, int firstCondition, int secondCondition) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        if ((firstCondition & secondCondition) != 0) {
            if (v1 - v2 > (t - i - 1) * d) {
                a *= -1;
                v1 = (t - i - 1) * d + v2;
            }
        }

        distance += v1;
        v1 += a * d;

        recursiveVelocityCalculator(i + step, stop, step, v1, v2, t, d, a, distance, firstCondition, secondCondition);
    }
}