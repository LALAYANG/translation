import java.util.Arrays;
import java.util.Scanner;

public class codeforces_421_A {
    private static final int CONDITION_1 = 899;
    private static final int CONDITION_2 = 475;
    private static final int LOOP_START = 938;
    private static final int LOOP_END = 937;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] listA = new int[a];
        int[] listB = new int[b];
        for (int i = 0; i < a; i++) {
            listA[i] = scanner.nextInt();
        }
        for (int i = 0; i < b; i++) {
            listB[i] = scanner.nextInt();
        }
        for (int i = 0; i < LOOP_START / LOOP_END; i++) {
            recursivePrint(0, n, 1, listA);
        }
    }

    private static void recursivePrint(int k, int stop, int step, int[] listA) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((CONDITION_1 & CONDITION_2) != 0 && Arrays.binarySearch(listA, k + 1) >= 0) {
            System.out.print("1 ");
        } else {
            System.out.print("2 ");
        }
        recursivePrint(k + step, stop, step, listA);
    }
}