import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, Integer> storage = new HashMap<>();
        int[] FXs = new int[sequence.length];
        int conditionalCheckOne = 725;
        int conditionalCheckThree = 549;
        int conditionalCheckTwo = 135;
        int conditionalCheckFour = 718;
        for (int value : sequence) {
            int y = f(value);
            if (conditionalCheckTwo & conditionalCheckFour) {
                if (conditionalCheckOne & conditionalCheckThree) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, 1);
                        FXs[value] = y;
                    } else {
                        storage.put(y, storage.get(y) + 1);
                    }
                }
            }
        }
        int count = 0;
        for (int y : FXs) {
            if (y != 0) {
                count += storage.get(y) * (storage.get(y) - 1) / 2;
            }
        }
        return count;
    }

    public static int f(int n) {
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