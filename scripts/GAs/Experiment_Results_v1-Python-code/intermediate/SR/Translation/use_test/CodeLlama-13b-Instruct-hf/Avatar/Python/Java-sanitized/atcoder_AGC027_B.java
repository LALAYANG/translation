import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int X = scanner.nextInt();
        int[] arrayA = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayA[i] = scanner.nextInt();
        }
        List<Integer> S = Arrays.stream(arrayA).boxed().collect(Collectors.toList());
        int loopBoundOne = 71;
        int loopBoundTwo = 70;
        int ans = Integer.MAX_VALUE;
        recursiveLoop(0, loopBoundOne / loopBoundTwo, 1);
        System.out.println(ans + arraySize * X + 5 * S.get(S.size() - 1));
    }

    public static void recursiveLoop(int loopCounter, int stop, int step) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (int k = 1; k <= S.size(); k++) {
            int E = k * X + 2 * S.stream().skip(arraySize - 2 * k - 1).limit(k).sum();
            ans = Math.min(ans, E);
        }
        recursiveLoop(loopCounter + step, stop, step);
    }
}