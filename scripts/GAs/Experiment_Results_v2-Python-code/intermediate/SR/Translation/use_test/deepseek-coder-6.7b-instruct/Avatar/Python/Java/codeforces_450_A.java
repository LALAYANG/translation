Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputList.add(scanner.nextInt());
        }
        ArrayList<Integer> l2 = new ArrayList<>();
        int checkerOne = 204;
        int checkerTwo = 347;
        for (int i : inputList) {
            if ((checkerOne & checkerTwo) != 0) {
                if (i % m == 0) {
                    l2.add(i / m);
                } else {
                    l2.add(i / m + 1);
                }
            }
        }
        int mx = l2.stream().max(Integer::compare).get();
        int ind = -1;
        recursiveSearch(l2, n, mx, 0, n, 1, &ind);
        System.out.println(ind + 1);
    }

    private static void recursiveSearch(ArrayList<Integer> l2, int n, int mx, int i, int stop, int step, int ind) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l2.get(i) == mx) {
            ind = i;
        }
        recursiveSearch(l2, n, mx, i + step, stop, step, ind);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers `n` and `m`, followed by `n` integers from the input. It then processes the input list and stores the results in `l2`. It finds the maximum value in `l2` and then uses a recursive function to find the index of the maximum value in `l2`. The index is then printed to the console.

