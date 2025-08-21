import java.util.Scanner;

public class codeforces_534_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 989;
        int SecondCondition = 711;
        int OuterLoopLimit = 748;
        int OuterLoopStep = 747;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            recursive_velocity_calculator(0, t, 1, v1, v2, t, d, a, v, distance, FirstCondition, SecondCondition);
        }
        System.out.println(distance);
    }

    public static void recursive_velocity_calculator(int i, int stop, int step, int v1, int v2, int t, int d, int a, int v, int distance, int FirstCondition, int SecondCondition) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((FirstCondition & SecondCondition) != 0) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
        }
        distance += v;
        v += a * d;
        recursive_velocity_calculator(i + step, stop, step, v1, v2, t, d, a, v, distance, FirstCondition, SecondCondition);
    }
}