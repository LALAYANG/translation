import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int newVarB = scanner.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
        }
        int[] secondList = new int[a];
        for (int i = 0; i < a; i++) {
            secondList[i] = scanner.nextInt();
        }
        int firstConditionChecker = 871;
        int secondConditionChecker = 860;
        int newLoopChecker = 178;
        int loopChecker = 177;
        for (int loopIndexOut = 0; loopIndexOut * loopChecker < newLoopChecker; loopIndexOut++) {
            recursiveFunction(0, n, 1, firstConditionChecker, secondConditionChecker, lista);
        }
    }

    public static void recursiveFunction(int k, int stop, int step, int firstConditionChecker, int secondConditionChecker, int[] lista) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((firstConditionChecker & secondConditionChecker) != 0) {
            if (k + 1 < lista.length && lista[k + 1] != 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
        recursiveFunction(k + step, stop, step, firstConditionChecker, secondConditionChecker, lista);
    }
}