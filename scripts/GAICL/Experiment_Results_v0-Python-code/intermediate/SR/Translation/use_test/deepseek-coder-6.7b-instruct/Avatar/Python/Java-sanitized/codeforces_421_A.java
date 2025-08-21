import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            listA.add(scanner.nextInt());
        }
        for (int i = 0; i < b; i++) {
            listB.add(scanner.nextInt());
        }
        final int CONDITION_1 = 899;
        final int CONDITION_2 = 475;
        final int LOOP_START = 938;
        final int LOOP_END = 937;
        for (int loopIndexOut = 0; loopIndexOut < LOOP_START / LOOP_END; loopIndexOut++) {
            recursivePrint(0, n, 1, listA, CONDITION_1, CONDITION_2);
        }
    }

    public static void recursivePrint(int k, int stop, int step, ArrayList<Integer> listA, int condition1, int condition2) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((condition1 & condition2) != 0) {
            if (listA.contains(k + 1)) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        recursivePrint(k + step, stop, step, listA, condition1, condition2);
    }
}