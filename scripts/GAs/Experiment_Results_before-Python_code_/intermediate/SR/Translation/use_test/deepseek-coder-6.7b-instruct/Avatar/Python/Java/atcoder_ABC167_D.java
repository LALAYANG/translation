```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long K = scanner.nextLong();
        int[] L = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            L[i] = scanner.nextInt();
        }
        L[0] = -1;
        int[] path = new int[N + 1];
        path[0] = 1;
        int ind = 0;
        boolean flag = false;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 1; i <= N + 1; i++) {
            int ne = L[i];
            if (hash.containsKey(ne)) {
                flag = true;
                ind = hash.get(ne);
                break;
            }
            path[i] = ne;
            ind++;
            hash.put(ne, ind);
        }
        if (flag) {
            int loopSize = ind;
            List<Integer> loop = new ArrayList<>();
            for (int i = ind; i < N + 1; i++) {
                loop.add(path[i]);
            }
            if (K < N + 1) {
                System.out.println(path[(int) K]);
            } else {
                K = K - (N + 1);
                K = K % loopSize;
                System.out.println(loop.get((int) K));
            }
        } else {
            System.out.println(path[(int) K - 1]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads in the input, creates a path array, and uses a HashMap to keep track of the indices of the elements in the path. If a loop is detected, it calculates the size of the loop and prints the Kth element accordingly. If no loop is detected, it simply prints the Kth element of the path.

