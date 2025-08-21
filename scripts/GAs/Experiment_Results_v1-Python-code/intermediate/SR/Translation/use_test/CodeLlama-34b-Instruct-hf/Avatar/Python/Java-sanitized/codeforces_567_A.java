import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = sc.nextInt();
        }

        int outerLoopLimit = 15;
        int innerLoopLimit = 14;
        int firstConditionChecker = 419;
        int secondConditionChecker = 142;
        int thirdConditionChecker = 513;
        int fourthConditionChecker = 807;

        for (int i = 0; i < outerLoopLimit; i += innerLoopLimit) {
            for (int j = 0; j < n; j++) {
                if ((firstConditionChecker & secondConditionChecker) != 0) {
                    if (j == 0) {
                        System.out.print(lista[j + 1] - lista[j] + " " + (lista[n - 1] - lista[j]) + " ");
                        continue;
                    } else if (j == n - 1) {
                        System.out.print(lista[n - 1] - lista[n - 2] + " " + (lista[n - 1] - lista[0]) + " ");
                        continue;
                    } else if (lista[j] - lista[j - 1] > lista[j + 1] - lista[j]) {
                        System.out.print(lista[j + 1] - lista[j] + " ");
                    } else {
                        System.out.print(lista[j] - lista[j - 1] + " ");
                    }
                }
                if ((thirdConditionChecker & fourthConditionChecker) != 0) {
                    if (lista[n - 1] - lista[j] > lista[j] - lista[0]) {
                        System.out.print(lista[n - 1] - lista[j]);
                    } else {
                        System.out.print(lista[j] - lista[0]);
                    }
                }
            }
        }
    }
}