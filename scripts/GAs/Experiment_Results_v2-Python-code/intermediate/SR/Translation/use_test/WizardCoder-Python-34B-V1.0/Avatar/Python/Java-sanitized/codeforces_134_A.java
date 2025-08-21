import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class codeforces_134_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += w[i];
        }
        ArrayList<Integer> indices = new ArrayList<>();
        int outerLoopEnd = 66;
        int outerLoopStep = 65;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                if ((x - w[i]) / (n - 1) == w[i]) {
                    indices.add(i + 1);
                }
            }
        }
        System.out.println(indices.size());
        System.out.println(Arrays.toString(indices.toArray()));
    }
}