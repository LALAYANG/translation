```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int CONDITION_1 = 899;
    private static final int CONDITION_2 = 475;
    private static final int LOOP_START = 938;
    private static final int LOOP_END = 937;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            listA.add(scanner.nextInt());
        }
        for (int i = 0; i < b; i++) {
            listB.add(scanner.nextInt());
        }
        for (int loopIndexOut = 0; loopIndexOut < LOOP_START / LOOP_END; loopIndexOut++) {
            recursivePrint(0, n, 1, listA, listB);
            System.out.println();
        }
    }

    private static void recursivePrint(int k, int stop, int step, List<Integer> listA, List<Integer> listB) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((CONDITION_1 & CONDITION_2) != 0) {
            if (listA.contains(k + 1)) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        recursivePrint(k + step, stop, step, listA, listB);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, creates two lists, and then uses a loop to call a recursive function. The recursive function checks conditions and prints numbers based on the input.

