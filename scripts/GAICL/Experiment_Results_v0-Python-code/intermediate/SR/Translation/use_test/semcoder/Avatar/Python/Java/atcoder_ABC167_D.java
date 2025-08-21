Thought Process:
1. Understand the given code snippet and the problem it is trying to solve.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure the Java code is correct and free from syntax errors.

```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_nodes = sc.nextInt();
        int K = sc.nextInt();
        int[] L = new int[num_nodes + 1];
        for (int i = 1; i <= num_nodes; i++) {
            L[i] = sc.nextInt();
        }
        L[0] = -1;
        List<Integer> path = new ArrayList<>();
        path.add(1);
        int current_index = 0;
        HashMap<Integer, Integer> Hash = new HashMap<>();
        int x = 1;
        int t = -1;
        boolean flag = false;
        int bitmask1 = 524;
        int check_mask2 = 239;
        int mask1 = 733;
        int mask2 = 172;

        for (int i = 0; i < num_nodes + 1; i++) {
            int ne = L[x];
            if ((mask1 & mask2) != 0) {
                if ((bitmask1 & check_mask2) != 0) {
                    if (Hash.containsKey(ne)) {
                        flag = true;
                        t = Hash.get(ne);
                        break;
                    }
                }
            }
            path.add(ne);
            current_index++;
            Hash.put(ne, current_index);
            x = ne;
        }

        if ((bitmask1 & bitmask2) != 0) {
            if ((mask1 & mask2) != 0) {
                if (flag) {
                    List<Integer> loop = path.subList(t, path.size());
                    if (K < path.size()) {
                        System.out.println(path.get(K));
                    } else {
                        K -= path.size();
                        K %= loop.size();
                        System.out.println(loop.get(K));
                    }
                } else {
                    System.out.println(path.get(K - 1));
                }
            }
        }
    }
}
```

This Java code is a translation of the given Python code snippet, ensuring it maintains the same functionality and logic.
