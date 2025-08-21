```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = scanner.nextInt();
        scanner.nextLine();
        String[] xStr = scanner.nextLine().split(" ");
        String[] yStr = scanner.nextLine().split(" ");
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 1; i < xStr.length; i++) {
            x.add(Integer.parseInt(xStr[i]));
        }
        for (int i = 1; i < yStr.length; i++) {
            y.add(Integer.parseInt(yStr[i]));
        }
        if (x.contains(0)) {
            x.remove(0);
        } else if (y.contains(0)) {
            y.remove(0);
        }
        x.addAll(y);
        if (x.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
```

