```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_level = scanner.nextInt();
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 0; i < max_level; i++) {
            x.add(scanner.nextInt());
        }
        for (int i = 0; i < max_level; i++) {
            y.add(scanner.nextInt());
        }
        x.remove(0);
        y.remove(0);
        Set<Integer> z = new HashSet<>();
        z.addAll(x);
        z.addAll(y);
        if (z.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of levels and the levels of each of the two people from the input, removes the 0s from the sets, and then checks if the union of the two sets is equal to the number of levels. If it is, it prints "I become the guy." If not, it prints "Oh, my keyboard!".

