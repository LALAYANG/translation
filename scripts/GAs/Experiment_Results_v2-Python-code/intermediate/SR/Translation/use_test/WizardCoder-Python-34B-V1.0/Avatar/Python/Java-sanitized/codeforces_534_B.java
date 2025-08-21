import java.util.Scanner;

public class codeforces_534_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        int v1 = Integer.parseInt(input1[0]);
        int v2 = Integer.parseInt(input1[1]);
        int t = Integer.parseInt(input2[0]);
        int d = Integer.parseInt(input2[1]);
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 989;
        int SecondCondition = 711;
        int OuterLoopLimit = 748;
        int OuterLoopStep = 747;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            int i = 0;
            int step = 1;
            while (true) {
                if (step == 0 || (step > 0 && i >= t) || (step < 0 && i <= t)) {
                    break;
                }
                if ((FirstCondition & SecondCondition) != 0) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                }
                distance += v;
                v += a * d;
                i += step;
            }
        }
        System.out.println(distance);
    }
}