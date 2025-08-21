import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.ArrayList;

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
        HashMap<Integer, ArrayList<Integer>> storage = new HashMap<>();
        ArrayList<Integer> uniqueFunctionValues = new ArrayList<>();
        int conditionFlag1 = 181;
        int conditionFlag2 = 797;
        int outerLoopLimit = 560;
        int outerLoopStep = 559;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            for (int value : sequence) {
                int y = f(value);
                if (conditionFlag1 & conditionFlag2) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, new ArrayList<>());
                        uniqueFunctionValues.add(y);
                    }
                    storage.get(y).add(value);
                }
            }
        }
        int result = 0;
        for (int y : uniqueFunctionValues) {
            ArrayList<Integer> values = storage.get(y);
            result += values.size() * (values.size() - 1) / 2;
        }
        return result;
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