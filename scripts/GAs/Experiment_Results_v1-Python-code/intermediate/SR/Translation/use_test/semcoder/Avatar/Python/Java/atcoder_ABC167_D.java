Thought process:
1. Parse the input to extract the number of nodes `N` and the value of `K`.
2. Read the list `L` representing the path.
3. Implement the logic to find the value at index `K` in the path.
4. Handle cases where a loop is detected and adjust `K` accordingly.
5. Output the result.

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(sc.nextInt());
        }
        L.add(0, -1);
        ArrayList<Integer> path = new ArrayList<>();
        path.add(1);
        int ind = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        HashMap<Integer, Integer> Hash = new HashMap<>();
        while (ind < N) {
            int ne = L.get(x);
            if (Hash.containsKey(ne)) {
                flag = true;
                t = Hash.get(ne);
                break;
            }
            path.add(ne);
            ind++;
            Hash.put(ne, ind);
            x = ne;
        }
        if (flag) {
            ArrayList<Integer> loop = new ArrayList<>(path.subList(t, path.size()));
            if (K < path.size()) {
                System.out.println(path.get((int) K));
            } else {
                K -= path.size();
                K %= loop.size();
                System.out.println(loop.get((int) K));
            }
        } else {
            System.out.println(path.get((int) (K - 1)));
        }
    }
}
```
