import java.util.*;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] list_a = new int[n];
        for (int i = 0; i < n; i++) {
            list_a[i] = scanner.nextInt();
        }
        int[] list_b = new int[b];
        for (int i = 0; i < b; i++) {
            list_b[i] = scanner.nextInt();
        }
        int CONDITION_1 = 899;
        int CONDITION_2 = 475;
        int LOOP_START = 938;
        int LOOP_END = 937;
        for (int LoopIndexOut = LOOP_START / LOOP_END; LoopIndexOut > 0; LoopIndexOut--) {
            recursivePrint(0, n, 1, list_a, CONDITION_1, CONDITION_2);
        }
    }

    public static void recursivePrint(int k, int stop, int step, int[] list_a, int CONDITION_1, int CONDITION_2) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((CONDITION_1 & CONDITION_2) != 0) {
            if (Arrays.binarySearch(list_a, k + 1) >= 0) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        recursivePrint(k + step, stop, step, list_a, CONDITION_1, CONDITION_2);
    }
}