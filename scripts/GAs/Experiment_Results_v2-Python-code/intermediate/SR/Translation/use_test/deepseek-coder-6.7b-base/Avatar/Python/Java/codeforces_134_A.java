```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int x = Arrays.stream(w).sum();
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                indices.add(i + 1);
            }
        }
        System.out.println(indices.size());
        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i) + " ");
        }
    }
}
```

