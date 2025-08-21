```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> L = new ArrayList<>();
        int r = 1;

        String[] input = scanner.nextLine().split(" ");
        for (String k : input) {
            for (int i = 0; i < Integer.parseInt(k); i++) {
                L.add(r);
            }
            r++;
        }

        input = scanner.nextLine().split(" ");
        for (String j : input) {
            int index = Integer.parseInt(j) - 1;
            if (index >= 0 && index < L.size()) {
                System.out.println(L.get(index));
            }
        }
    }
}
```
