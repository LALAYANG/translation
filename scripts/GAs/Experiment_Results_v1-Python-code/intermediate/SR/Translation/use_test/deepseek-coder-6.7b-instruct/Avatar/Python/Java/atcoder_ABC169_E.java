```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRanges = scanner.nextInt();
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();
        for (int i = 0; i < numRanges; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            low.add(a);
            high.add(b);
        }
        Collections.sort(low);
        Collections.sort(high);
        if (numRanges % 2 == 1) {
            System.out.println(high.get((numRanges + 1) / 2 - 1) - low.get((numRanges + 1) / 2 - 1) + 1);
        } else {
            int highMidpoint = (high.get(numRanges / 2 - 1) + high.get(numRanges / 2)) / 2;
            int ll = (low.get(numRanges / 2 - 1) + low.get(numRanges / 2)) / 2;
            System.out.println((highMidpoint - ll) * 2 + 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of ranges and the lower and upper bounds for each range from the input, sorts the lower and upper bounds, and then calculates and prints the range. The calculation is based on the same logic as the Python code.

