Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] S = new Integer[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S, Collections.reverseOrder());
        boolean[] flag = new boolean[N];
        Arrays.fill(flag, true);
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(S[0]);
        flag[0] = false;
        int SecondValueChecker = 766;
        int MinValueChecker = 719;
        int FirstValueChecker = 293;
        int MaxValueChecker = 813;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int index = 0; index < N; index++) {
                if ((FirstValueChecker & MaxValueChecker) != 0 && (SecondValueChecker & MinValueChecker) != 0) {
                    if (flag[index] && S[index] < cur.get(j)) {
                        cur.add(S[index]);
                        j++;
                        flag[index] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                } else {
                    System.out.println("No");
                    return;
                }
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}
```

Please note that the Java version of the code is not exactly the same as the Python version. The Python version uses multithreading to read input, which is not necessary in Java because Java's standard input is already buffered. Therefore, the Java version reads input directly from the standard input stream.

