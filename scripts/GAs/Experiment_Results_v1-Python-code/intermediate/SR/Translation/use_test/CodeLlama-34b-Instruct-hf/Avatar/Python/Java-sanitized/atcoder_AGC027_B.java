import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        int arraySize = 16;
        int X = 10;
        int[] arrayA = {1, 7, 12, 27, 52, 75, 731, 13856, 395504, 534840, 1276551, 2356789, 9384806, 19108104, 82684732, 535447408};
        int loopBoundOne = 71;
        int loopBoundTwo = 70;

        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            S.add(arrayA[i]);
        }

        int ans = Integer.MAX_VALUE;
        int loopCounter = 0;
        int step = 1;

        while (loopCounter < loopBoundOne / loopBoundTwo) {
            for (int k = 1; k <= S.size(); k++) {
                int E = k * X + 2 * sum(S, k);
                ans = Math.min(ans, E);
            }
            loopCounter += step;
        }

        System.out.println(ans + arraySize * X + 5 * S.get(S.size() - 1));
    }

    private static int sum(List<Integer> S, int k) {
        int sum = 0;
        for (int j = S.size() - 2 * k - 1; j >= 0; j -= k) {
            sum += S.get(j);
        }
        return sum;
    }
}