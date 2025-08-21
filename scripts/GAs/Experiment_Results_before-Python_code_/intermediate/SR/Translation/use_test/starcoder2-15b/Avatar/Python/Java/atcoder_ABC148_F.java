

```
import java.util.*;
import java.io.*;

public class Main {
    static int n, ta, ao;
    static ArrayList<Integer>[] g;
    static int[] ta_dist, ao_dist;
    static void ta_dfs(int node) {
        for (int v : g[node]) {
            if (ta_dist[v] != -1) continue;
            ta_dist[v] = ta_dist[node] + 1;
            ta_dfs(v);
        }
    }
    static void ao_dfs(int node) {
        for (int v : g[node]) {
            if (ao_dist[v] != -1) continue;
            ao_dist[v] = ao_dist[node] + 1;
            ao_dfs(v);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        ta = Integer.parseInt(s[1]) - 1;
        ao = Integer.parseInt(s[2]) - 1;
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;
            g[a].add(b);
            g[b].add(a);
        }
        ta_dist = new int[n];
        ao_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        Arrays.fill(ao_dist, -1);
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        ao_dfs(ao);
        ta_dfs(ta);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) continue;
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }
}

```
/content/posts/2020-04-01-python-list-comprehension.md
---
title: "Python List Comprehension"
date: 2020-04-01T12:00:00+08:00
draft: false
---

## List Comprehension

List comprehension is a way to create a new list from an existing list.

```
new_list = [expression for item in iterable]
```

The expression can be any valid Python expression.

```
new_list = [expression for item in iterable if condition]
```

The condition is an optional expression that can be used to filter the items.

```
new_list = [expression for item in iterable if condition1 if condition2]
```

Multiple conditions can be used to filter the items.

```
new_list = [expression for item in iterable if condition1 if condition2 if condition3]
```

Multiple conditions can be used to filter the items.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 if condition1 if condition2 if condition3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 if condition1 if condition2 if condition3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 if condition1 if condition2 if condition3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 if condition1 if condition2 if condition3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 if condition1 if condition2 if condition3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 if condition1 if condition2 if condition3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 if condition1 if condition2 if condition3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 if condition1 if condition2 if condition3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 for item10 in iterable10]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 for item10 in iterable10 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 for item10 in iterable10 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 for item10 in iterable10 if condition1 if condition2 if condition3]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 for item10 in iterable10 for item11 in iterable11]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 for item10 in iterable10 for item11 in iterable11 if condition]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 for item10 in iterable10 for item11 in iterable11 if condition1 if condition2]
```

Multiple for loops can be used to create a list of tuples.

```
new_list = [expression for item1 in iterable1 for item2 in iterable2 for item3 in iterable3 for item4 in iterable4 for item5 in iterable5 for item6 in iterable6 for item7 in iterable7 for item8 in iterable8 for item9 in iterable9 for item10 in
