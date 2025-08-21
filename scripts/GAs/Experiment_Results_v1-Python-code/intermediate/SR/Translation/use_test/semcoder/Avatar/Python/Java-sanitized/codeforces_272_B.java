import java.util.HashMap;
import java.util.Map;

public class codeforces_272_B {
    public static void main(String[] args) {
        int result = nPairsWithCommonFX(new int[]{7, 1});
        System.out.println(result);
    }

    private static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, Integer> storage = new HashMap<>();
        int[] FXs = new int[sequence.length];
        int conditionalCheckOne = 725;
        int conditionalCheckThree = 549;
        int conditionalCheckTwo = 135;
        int conditionalCheckFour = 718;

        for (int value : sequence) {
            int y = f(value);
            if ((conditionalCheckTwo & conditionalCheckFour) != 0) {
                if ((conditionalCheckOne & conditionalCheckThree) != 0) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, 1);
                        FXs[value] = y;
                    } else {
                        storage.put(y, storage.get(y) + 1);
                    }
                }
            }
        }

        int sum = 0;
        for (int y : FXs) {
            if (y != 0) {
                sum += storage.get(y) * storage.get(y);
            }
        }

        return (sum - storage.values().stream().mapToInt(Integer::intValue).sum()) / 2;
    }

    private static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}