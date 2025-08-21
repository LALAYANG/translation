Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);
        boolean[] flag = new boolean[N];
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(S[N - 1]);
        flag[N - 1] = true;
        for (int i = 0; i < N - 1; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < N; k++) {
                if (!flag[k] && S[k] < cur.get(j)) {
                    cur.add(S[k]);
                    j++;
                    flag[k] = true;
                    if (j == jM) {
                        break;
                    }
                }
            }
            if (j != jM) {
                System.out.println("No");
                return;
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}
```

This Java code does the same thing as the Python code. It reads the input, sorts the array, and then checks if the array can be rearranged in a way that each element is less than the previous one. If it can, it prints "Yes", otherwise it prints "No".

