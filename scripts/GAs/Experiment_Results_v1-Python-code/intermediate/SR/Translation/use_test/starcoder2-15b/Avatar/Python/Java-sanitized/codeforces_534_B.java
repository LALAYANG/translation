import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_534_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int Newton = sc.nextInt();
        int d = sc.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 340;
        int SecondCondition = 941;
        int OuterLoopCounter = 107;
        int InnerLoopCounter = 106;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            RecursiveLoop(0, Newton, 1);
        }
        System.out.println(distance);
    }

    public static void RecursiveLoop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (FirstCondition & SecondCondition) {
            if (v - v2 > (Newton - i - 1) * d) {
                a *= -1;
                v = (Newton - i - 1) * d + v2;
            }
        }
        distance = distance + v;
        v += a * d;
        RecursiveLoop(i + step, stop, step);
    }
}