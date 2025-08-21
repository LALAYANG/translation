Thought process:
1. Implement the ```root``` and ```same``` functions to find the root of a node and check if two nodes have the same root.
2. Define the ```unite``` function to merge two nodes and update their sizes.
3. Read the input values, create the necessary data structures, and iterate through the array to calculate the final result.

```java
// Implement the root and same functions
int root(int[] par, int x) {
    return par[x] == x ? x : (par[x] = root(par, par[x]));
}

boolean same(int[] par, int x, int y) {
    return root(par, x) == root(par, y);
}

// Define the unite function to merge two nodes
void unite(int[] par, int[] rank, int[] size, int x, int y) {
    int rx = root(par, x);
    int ry = root(par, y);
    if (rx != ry) {
        if (rank[rx] < rank[ry]) {
            par[rx] = ry;
            size[ry] += size[rx];
        } else {
            par[ry] = rx;
            size[rx] += size[ry];
            if (rank[rx] == rank[ry]) rank[rx]++;
        }
    }
}

// Read input values, create data structures, and calculate the final result
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] par = new int[n];
    int[] rank = new int[n];
    int[] size = new int[n];
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
        par[i] = i;
        rank[i] = 1;
        size[i] = 1;
    }

    for (int i = 0; i < n; i++) {
        int t = scanner.nextInt() - 1;
        b[t] = i;
    }

    long c = 0;
    for (int k = n - 1; k >= 0; k--) {
        int l = 1, r = 1;
        if (k > 0 && b[k - 1] > b[k]) {
            l += size[root(par, k - 1)];
            unite(par, rank, size, k - 1, k);
        }
        if (k + 1 < n && b[k + 1] > b[k]) {
            r += size[root(par, k + 1)];
            unite(par, rank, size, k + 1, k);
        }
        c += (long) l * r * b[k];
    }

    System.out.println(c);
}
```
