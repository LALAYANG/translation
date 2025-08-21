import java.util.concurrent.ThreadLocalRandom;

public class codeforces_272_B {
    public static void main(String[] args) {
        int[] sequence = {2, 7, 1};
        int result = nPairsWithCommonFX(sequence);
        System.out.println(result);
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        int[] storage = new int[sequence.length];
        int[] FXs = new int[sequence.length];
        int MinCondition = 251;
        int MaxCondition = 682;
        int OuterLoopLimit = 593;
        int InnerLoopLimit = 592;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int value : sequence) {
                int y = f(value);
                if (MinCondition & MaxCondition) {
                    if (y not in storage) {
                        storage[y] = value;
                        FXs[y] = value;
                    } else {
                        storage[y] += value;
                        FXs[y] += value;
                    }
                }
            }
        }
        int result = 0;
        for (int y : FXs) {
            result += storage[y] * storage[y];
        }
        return result / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}