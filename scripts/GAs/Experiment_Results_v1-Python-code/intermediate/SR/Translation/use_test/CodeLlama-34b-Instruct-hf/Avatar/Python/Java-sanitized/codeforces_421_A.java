import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
            listb[i] = scanner.nextInt();
        }
        int conditionCheckerTwo = 368;
        int conditionCheckerOne = 889;
        int loopBoundary = 955;
        int stepSize = 954;
        for (int loopIndexOut = 0; loopIndexOut < loopBoundary / stepSize; loopIndexOut++) {
            recursiveFunction(0, n, 1);
        }
    }

    public static void recursiveFunction(int k, int stop, int step) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((conditionCheckerTwo & conditionCheckerOne) != 0) {
            if (k + 1 in lista) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
        recursiveFunction(k + step, stop, step);
    }
}