Thought process:
1. Understand the input format and the conditions specified in the code snippet.
2. Implement the logic to calculate the result based on the given conditions.
3. Ensure the correctness of the solution by testing it with the provided test input.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> highs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            low.add(a);
            highs.add(b);
        }
        Collections.sort(low);
        Collections.sort(highs);
        if (n % 2 == 1) {
            System.out.println(highs.get((n + 1) / 2 - 1) - low.get((n + 1) / 2 - 1) + 1);
        } else {
            int high_mid = (highs.get(n / 2 - 1) + highs.get(n / 2)) / 2;
            int ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2;
            System.out.println((high_mid - ll) * 2 + 1);
        }
    }
}
```

This solution reads the input, sorts the low and high values, and calculates the result based on the given conditions. It then prints the output as required.
