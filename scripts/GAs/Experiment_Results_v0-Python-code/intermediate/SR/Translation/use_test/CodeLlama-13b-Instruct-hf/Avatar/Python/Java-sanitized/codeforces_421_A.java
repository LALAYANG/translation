import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] listA = new int[n];
        int[] listB = new int[n];
        for (int i = 0; i < n; i++) {
            listA[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            listB[i] = scanner.nextInt();
        }
        int CONDITION_1 = 899;
        int CONDITION_2 = 475;
        int LOOP_START = 938;
        int LOOP_END = 937;
        ttest_ind(listA, listB);
        for (int i = LOOP_START / LOOP_END; i >= 0; i--) {
            recursivePrint(i, n, 1);
        }
    }

    public static void recursivePrint(int k, int stop, int step) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (CONDITION_1 & CONDITION_2) {
            if (k + 1 in listA) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
        recursivePrint(k + step, stop, step);
    }
}