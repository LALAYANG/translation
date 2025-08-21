```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] links = new int[n];
        for (int i = 0; i < n; i++) {
            links[i] = a[i] - 1;
        }

        int heightFromLeaf = 0;
        int cutCount = 0;
        for (int i = 0; i < n; i++) {
            if (links[i] == 0) {
                continue;
            }
            int hgt = dfs(links, n, k, links[i], i);
            heightFromLeaf = Math.max(heightFromLeaf, hgt);
            cutCount++;
        }
        heightFromLeaf++;
        if (a[0] != 1) {
            cutCount++;
        }
        System.out.println(cutCount);
    }

    public static int dfs(int[] links, int n, int k, int v, int p) {
        int heightFromLeaf = 0;
        int cutCount = 0;
        for (int i = 0; i < n; i++) {
            if (links[i] == 0) {
                continue;
            }
            int hgt = dfs(links, n, k, links[i], i);
            heightFromLeaf = Math.max(heightFromLeaf, hgt);
            cutCount++;
        }
        heightFromLeaf++;
        if (p != 0 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount++;
        }
        return heightFromLeaf;
    }
}
```

Note: The above code is a Java implementation of the given Python code. The Python code uses a set to store the links, but in Java, we use an array to store the links. Also, the Python code uses a recursive function to traverse the tree, but in Java, we use a loop to traverse the tree.
