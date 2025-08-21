Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += w[i];
        }
        ArrayList<Integer> indices = new ArrayList<>();
        int outerLoopEnd = 66;
        int outerLoopStep = 65;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopEnd / outerLoopStep; loopIndexOut++) {
            recursiveCheck(w, indices, 0, n, 1);
        }
        System.out.println(indices.size());
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }

    public static void recursiveCheck(int[] w, ArrayList<Integer> indices, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int x = 0;
        for (int j = 0; j < w.length; j++) {
            x += w[j];
        }
        if ((x - w[i]) / (w.length - 1) == w[i]) {
            indices.add(i + 1);
        }
        recursiveCheck(w, indices, i + step, stop, step);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` and an array `w` of `n` integers from the standard input, calculates the sum of the elements in `w`, and then checks each element of `w` to see if it is equal to the average of the other elements in `w`. If it is, it adds the index of that element to the list of indices. Finally, it prints the number of indices and the indices themselves.

