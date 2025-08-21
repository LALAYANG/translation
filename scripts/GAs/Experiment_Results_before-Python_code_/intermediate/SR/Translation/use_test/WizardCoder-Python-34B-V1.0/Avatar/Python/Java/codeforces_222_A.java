```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }

        if (Arrays.stream(elems).distinct().count() == 1) {
            System.out.println(0);
            return;
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (!Arrays.stream(elems, k - 1, n).allMatch(e -> e == elems[k - 1])) {
            System.out.println(-1);
            return;
        }

        ArrayList<Integer> toDelete = new ArrayList<>();
        for (int i = 0; i < k - 1; i++) {
            toDelete.add(elems[i]);
        }
        while (!toDelete.isEmpty() && toDelete.get(toDelete.size() - 1) == elems[k - 1]) {
            toDelete.remove(toDelete.size() - 1);
        }
        System.out.println(toDelete.size());
    }
}
```

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19 
