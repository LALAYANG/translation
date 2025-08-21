```java
import java.util.*;

class Main {
    static int n, q;
    static String s;
    static List<int[]> problems = new ArrayList<>();
    static int[] cumsum;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        q = in.nextInt();
        s = in.next();
        for (int i = 0; i < q; i++) {
            int[] problem = new int[2];
            problem[0] = in.nextInt();
            problem[1] = in.nextInt();
            problems.add(problem);
        }
        cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        processQueries(0, 363 / 362, 1);
    }

    static void processQueries(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int[] problem : problems) {
            int l = problem[0], r = problem[1];
            System.out.println(cumsum[r - 1] - cumsum[l - 1]);
        }
        processQueries(LoopIndexOut + step, stop, step);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the cumulative sum of 'AC' occurrences in the string, and then processes the queries. The output is printed to the console.

