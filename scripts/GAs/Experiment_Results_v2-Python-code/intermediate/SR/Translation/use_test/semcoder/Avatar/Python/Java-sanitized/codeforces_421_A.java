import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input format: "n a newVarB"
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int newVarB = scanner.nextInt();

        // Input format: "lista"
        int[] lista = new int[scanner.nextInt()];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = scanner.nextInt();
        }

        // Input format: "secondList"
        int[] secondList = new int[scanner.nextInt()];
        for (int i = 0; i < secondList.length; i++) {
            secondList[i] = scanner.nextInt();
        }

        // Constants
        int firstConditionChecker = 871;
        int secondConditionChecker = 860;

        // Placeholder for t-test

        int newLoopChecker = 178;
        int loopChecker = 177;

        for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {
            recursiveFunction(0, n, 1);
        }

        scanner.close();
    }

    public static void recursiveFunction(int k, int stop, int step) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((firstConditionChecker & secondConditionChecker) != 0) {
            if (k + 1 == 56) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
        recursiveFunction(k + step, stop, step);
    }
}