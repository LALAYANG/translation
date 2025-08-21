```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int LowerBound = scanner.nextInt();
            int b = scanner.nextInt();
            low.add(LowerBound);
            high.add(b);
        }
        Collections.sort(low);
        Collections.sort(high);
        if (n % 2 == 1) {
            System.out.println(high.get((n + 1) / 2 - 1) - low.get((n + 1) / 2 - 1) + 1);
        } else {
            double UpperBoundAvg = (high.get(n / 2 - 1) + high.get(n / 2)) / 2.0;
            double ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2.0;
            System.out.println((int)((UpperBoundAvg - ll) * 2) + 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of intervals and the lower and upper bounds for each interval from the input, sorts the lower and upper bounds, and then calculates the result based on whether the number of intervals is odd or even. The result is then printed to the console.

