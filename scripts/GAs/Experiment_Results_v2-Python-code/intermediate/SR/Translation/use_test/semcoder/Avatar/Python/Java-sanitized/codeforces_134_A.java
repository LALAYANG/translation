import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_134_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int x = sum(w);
        List<Integer> indices = new ArrayList<>();
        int outerLoopEnd = 66;
        int outerLoopStep = 65;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            recursiveCheck(0, n, 1, w, x, indices);
        }
        System.out.println(indices.size());
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }

    private static void recursiveCheck(int i, int stop, int step, int[] w, int x, List<Integer> indices) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((x - w[i]) / (w.length - 1) == w[i]) {
            indices.add(i + 1);
        }
        recursiveCheck(i + step, stop, step, w, x, indices);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}