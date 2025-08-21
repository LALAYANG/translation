```java
import java.util.*;
import java.io.*;

public class Main {
    static int dfs(ArrayList<ArrayList<Integer>> links, int n, int k, int v, int p) {
        int heightFromLeaf = 0;
        int cutCount = 0;
        for (int u : links.get(v)) {
            if (u == p) continue;
            int hgt = dfs(links, n, k, u, v);
            heightFromLeaf = Math.max(heightFromLeaf, hgt);
            cutCount += hgt;
        }
        heightFromLeaf += 1;
        if (p != 0 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount += 1;
        }
        return cutCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        String[] aaa = br.readLine().split(" ");
        ArrayList<ArrayList<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            links.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(aaa[i]) - 1;
            links.get(a).add(i + 1);
        }
        int ans = dfs(links, n, k, 0, 0);
        if (Integer.parseInt(aaa[0]) != 1) {
            ans += 1;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, creates the links list, and then calls the dfs function to calculate the number of cuts. The dfs function returns the number of cuts. The main function reads the input, creates the links list, and then calls the dfs function to calculate the number of cuts. The dfs function returns the number of cuts. The main function prints the number of cuts.

