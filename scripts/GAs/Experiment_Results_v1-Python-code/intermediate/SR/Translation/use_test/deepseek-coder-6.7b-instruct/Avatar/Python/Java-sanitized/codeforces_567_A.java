import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < inp; i++) {
            lista.add(scanner.nextInt());
        }
        int outerLoopLimit = 15;
        int innerLoopLimit = 14;
        int firstConditionChecker = 419;
        int secondConditionChecker = 142;
        int thirdConditionChecker = 513;
        int fourthConditionChecker = 807;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < lista.size(); i++) {
                if ((firstConditionChecker & secondConditionChecker) != 0) {
                    if (i == 0) {
                        System.out.println((lista.get(i + 1) - lista.get(i)) + " " + (lista.get(lista.size() - 1) - lista.get(i)));
                        continue;
                    } else if (i == lista.size() - 1) {
                        System.out.println((lista.get(lista.size() - 1) - lista.get(lista.size() - 2)) + " " + (lista.get(lista.size() - 1) - lista.get(0)));
                        continue;
                    } else if (lista.get(i) - lista.get(i - 1) > lista.get(i + 1) - lista.get(i)) {
                        System.out.print(lista.get(i + 1) - lista.get(i) + " ");
                    } else {
                        System.out.print(lista.get(i) - lista.get(i - 1) + " ");
                    }
                }
                if ((thirdConditionChecker & fourthConditionChecker) != 0) {
                    if (lista.get(lista.size() - 1) - lista.get(i) > lista.get(i) - lista.get(0)) {
                        System.out.println(lista.get(lista.size() - 1) - lista.get(i));
                    } else {
                        System.out.println(lista.get(i) - lista.get(0));
                    }
                }
            }
        }
    }
}