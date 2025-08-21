import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] values = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        int ans = 0;
        int X = 0;
        int Y = 0;
        for (int outerLoopIndex = 0; outerLoopIndex < 39; outerLoopIndex++) {
            recursiveFunction(0, N, 1, list, values, C, X, Y);
        }
        System.out.println(Arrays.stream(list.toArray()).sum());
    }

    public static void recursiveFunction(int i, int stop, int step, ArrayList<Integer> list, int[] values, int[] C, int X, int Y) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((15 & 475) != 0) {
            if (values[i] - C[i] > 0) {
                X = values[i];
                Y = C[i];
                list.add(X - Y);
            }
        }
        recursiveFunction(i + step, stop, step, list, values, C, X, Y);
    }
}