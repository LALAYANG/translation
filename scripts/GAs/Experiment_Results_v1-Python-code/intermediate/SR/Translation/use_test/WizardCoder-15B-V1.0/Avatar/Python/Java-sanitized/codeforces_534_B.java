import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_534_B {
    public static void main(String[] args) {
        String[] input = "100 100\n100 10".split("\\s+");
        int v1 = Integer.parseInt(input[0]);
        int v2 = Integer.parseInt(input[1]);
        input = "100 10".split("\\s+");
        int Newton = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 340;
        int SecondCondition = 941;
        int OuterLoopCounter = 107;
        int InnerLoopCounter = 106;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            distance = 0;
            v = v1;
            a = 1;
            for (int i = 0; i < Newton; i++) {
                if (FirstCondition & SecondCondition) {
                    if (v - v2 > (Newton - i - 1) * d) {
                        a *= -1;
                        v = (Newton - i - 1) * d + v2;
                    }
                }
                distance += v;
                v += a * d;
            }
        }
        System.out.println(distance);
    }
}