import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = scanner.nextInt();
        }
        int a = 1;
        int pos = 0;
        int PrimaryInnerLoopCondition = 955;
        int SecondaryInnerLoopCondition = 460;
        int PrimaryOuterLoopCondition = 927;
        int SecondaryOuterLoopCondition = 219;
        int MaxOuterLoopIterations = 833;
        int OuterLoopStep = 832;
        int InnerLoopCondition = 73;
        int OuterLoopCondition = 744;
        for (int LoopIndexOut = 0; LoopIndexOut < MaxOuterLoopIterations / OuterLoopStep; LoopIndexOut++) {
            for (int InnerLoopIndex = 1; InnerLoopIndex < N; InnerLoopIndex++) {
                if (InnerLoopCondition & OuterLoopCondition) {
                    if (PrimaryOuterLoopCondition & SecondaryOuterLoopCondition) {
                        if (PrimaryInnerLoopCondition & SecondaryInnerLoopCondition) {
                            if (n[pos] > n[InnerLoopIndex]) {
                                a = a + 1;
                                pos = InnerLoopIndex;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}